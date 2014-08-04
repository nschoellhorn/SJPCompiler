package net.dreamcode.sjp;

import jasmin.Main;
import net.dreamcode.sjp.parsing.SimpleJavaLanguageLexer;
import net.dreamcode.sjp.parsing.SimpleJavaLanguageParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class SJPCompiler {

    private static String fileTemplate = ".class public SJPMainClass\n" +
            ".super java/lang/Object\n" +
            "\n" +
            ".method public static main([Ljava/lang/String;)V\n" +
            "   .limit stack 100\n" +
            "   .limit locals 100\n" +
            "   \n" +
            "${instructions}\n" +
            "   return\n" +
            "\n" +
            ".end method";

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRFileStream("demo/test.sjp");

        String jasminCode = "";
        try {
            jasminCode = compile(input);
        }
        catch (RuntimeException ex) {
            System.err.println("Compiling failed due to the following code error:\n" + ex.getMessage());
            System.exit(-1);
        }

        System.out.println("Building Jasmin file");
        File outputClassFile = new File("demo/SJPMainClass.j");

        if (!outputClassFile.exists()) {
            outputClassFile.createNewFile();
        }

        FileWriter writer = new FileWriter(outputClassFile);
        writer.write(jasminCode);
        writer.close();

        System.out.println("Building JVM binary class");
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
        Main.main(new String[] {"-d", "demo", "demo/SJPMainClass.j"});
        System.setOut(stdout);

        System.out.println("Building JAR file");
        File manifest = new File("demo/manifest.mf");

        if (!manifest.exists()) {
            manifest.createNewFile();
        }

        FileWriter jarWriter = new FileWriter(manifest);
        jarWriter.write("Manifest-Version: 1.0\n" +
                "Main-Class: SJPMainClass\n" +
                "Created-By: SJP Compiler (c) DreamCode\n");
        jarWriter.close();

        Process process = Runtime.getRuntime().exec(new String[]{"jar", "cmf", "manifest.mf", "Program.jar", "SJPMainClass.class"}, null, new File("demo/").getAbsoluteFile());
        // Make sure that the JAR creation can finish correctly
        process.waitFor();

        // Clean up the files that we dont need anymore
        manifest.delete();
        outputClassFile.delete();
    }

    public static String compile(ANTLRInputStream input) throws RuntimeException {
        SimpleJavaLanguageLexer lexer = new SimpleJavaLanguageLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleJavaLanguageParser parser = new SimpleJavaLanguageParser(tokenStream);

        System.out.println("Building tree...");
        ParseTree tree = parser.program();
        MyVisitor visitor = new MyVisitor();

        System.out.println("Generating JVM instructions");
        String instructions = visitor.visit(tree);
        return buildJasminCode(instructions);
    }

    private static String buildJasminCode(String instructions) {
        return fileTemplate.replace("${instructions}", instructions);
    }

}
