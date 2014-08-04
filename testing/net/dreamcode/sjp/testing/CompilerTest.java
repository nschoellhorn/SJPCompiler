package net.dreamcode.sjp.testing;

import jasmin.ClassFile;
import net.dreamcode.sjp.SJPCompiler;
import net.dreamcode.sjp.exceptions.UndeclaredVariableException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Copyright
 */
public class CompilerTest {

    private Path tempDir;
    private final String lf = System.lineSeparator();

    @BeforeMethod
    public void prepare() throws Exception {
        tempDir = Files.createTempDirectory("compilerTest");
    }

    @AfterMethod
    public void cleanUp() throws Exception {
        deleteRecursive(tempDir.toFile());
    }

    private void deleteRecursive(File dir) {
        if (dir.isDirectory()) {
            for (File child : dir.listFiles()) {
                deleteRecursive(child);
            }
        }

        if (!dir.delete()) {
            throw new Error("Could not delete temp dir <" + dir + ">");
        }
    }

    @Test(dataProvider = "provideCodeAndExpectedText")
    public void runningCodeOutputsExpectedText(String code, String expectedText) throws Exception {
        String actualOutput = compileAndRun(code);
        Assert.assertEquals(actualOutput, expectedText);
    }

    @Test(expectedExceptions = UndeclaredVariableException.class,
            expectedExceptionsMessageRegExp = "1:10 undeclared variable <x>")
    public void compilingCodeThrowsUndeclaredVariableErrorWithinAccess() throws Exception {
        compileAndRun("printline x;");
    }

    @Test(expectedExceptions = UndeclaredVariableException.class,
            expectedExceptionsMessageRegExp = "1:13 undeclared variable <x>")
    public void compilingCodeThrowsUndeclaredVariableErrorWithinAssignment() throws Exception {
        compileAndRun("assign 42 to x;");
    }

    private String compileAndRun(String code) throws Exception {
        code = SJPCompiler.compile(new ANTLRInputStream(code));

        //System.out.println(code);

        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(code), "", false);
        Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");

        try (OutputStream out = Files.newOutputStream(outputPath)) {
            classFile.write(out);
        }

        return runJavaClass(tempDir, classFile.getClassName());
    }

    private String runJavaClass(Path dir, String className) throws Exception {
        Process proc = Runtime.getRuntime().exec(new String[] {"java", "-cp", dir.toString(), className});
        try (InputStream in = proc.getInputStream()) {
            return new Scanner(in).useDelimiter("\\A").next();
        }
    }

    @DataProvider
    public Object[][] provideCodeAndExpectedText() {
        return new Object[][] {
                // Math test
                {"printline 1+2 ;", "3" + lf},
                {"printline 42+2+1 ;", "45" + lf},
                {"printline 1 ; printline 2 ;", "1" + lf + "2" + lf},
                {"printline 2-1 ;", "1" + lf},
                {"printline 3*2 ;", "6" + lf},
                {"printline 6/2 ;", "3" + lf},
                {"printline 7/2 ;", "3" + lf},
                {"printline 8/2*4 ;", "16" + lf},
                {"printline 2+3*3 ;", "11" + lf},
                {"printline 9-2*3 ;", "3" + lf},
                {"allocate int with name testVar; assign 21 to testVar; allocate int with name test2; assign 21 + testVar to test2; printline test2;", "42" + lf},

                // Variables test
                {"allocate int with name testVar; assign 42 to testVar; printline testVar ;", "42" + lf},
                {"allocate int with name testVar; assign 42 to testVar; printline testVar+2 ;", "44" + lf},
                {"allocate int with name testVar; allocate int with name testVar2; assign 42 to testVar; assign 10 to testVar2; printline testVar + testVar2 ;", "52" + lf},

                // Test string output
                {"printline \"Hallo Welt\";", "Hallo Welt" + lf},

                // Test string variables
                {"allocate text with name testString; assign \"Test\" to testString; printline testString;", "Test" + lf}
        };
    }

}
