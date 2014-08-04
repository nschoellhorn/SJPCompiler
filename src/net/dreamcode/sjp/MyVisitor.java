package net.dreamcode.sjp;

import net.dreamcode.sjp.exceptions.UndeclaredVariableException;
import net.dreamcode.sjp.parsing.SimpleJavaLanguageBaseVisitor;
import net.dreamcode.sjp.parsing.SimpleJavaLanguageParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright
 */
public class MyVisitor extends SimpleJavaLanguageBaseVisitor<String> {

    private Map<String, Integer> variables = new HashMap<>(100);
    private JVMStack stack = new JVMStack();
    private Map<Integer, DataType> variablesMapping = new HashMap<>(100);
    private JVMStack variablesStack = new JVMStack();

    // Type mappings
    private List<String> integerVars = new ArrayList<>();
    private List<String> stringVars = new ArrayList<>();

    @Override
    public String visitPrintline(@NotNull SimpleJavaLanguageParser.PrintlineContext ctx) {
        String instructionArguments = visit(ctx.argument);
        DataType dataType = stack.pop();

        return "   getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                instructionArguments + "\n" +
                "   invokevirtual java/io/PrintStream/println(" + dataType.getJvmType() + ")V\n";
    }

    @Override
    public String visitPlus(@NotNull SimpleJavaLanguageParser.PlusContext ctx) {
        String instructionArguments = visitChildren(ctx);

        DataType type1 = stack.pop();
        DataType type2 = stack.pop();
        stack.push(DataType.INTEGER);

        return instructionArguments + "\n"
                + "iadd";
    }

    @Override
    public String visitMinus(@NotNull SimpleJavaLanguageParser.MinusContext ctx) {
        String instructionArguments = visitChildren(ctx);

        stack.pop();
        stack.pop();
        stack.push(DataType.INTEGER);

        return instructionArguments + "\n"
               + "isub";
    }

    @Override
    public String visitMul(@NotNull SimpleJavaLanguageParser.MulContext ctx) {
        String instructionArguments = visitChildren(ctx);

        stack.pop();
        stack.pop();
        stack.push(DataType.INTEGER);

        return instructionArguments + "\n"
                + "imul";
    }

    @Override
    public String visitDiv(@NotNull SimpleJavaLanguageParser.DivContext ctx) {
        String instructionArguments = visitChildren(ctx);

        stack.pop();
        stack.pop();
        stack.push(DataType.INTEGER);

        return instructionArguments + "\n"
                + "idiv";
    }

    @Override
    public String visitNumber(@NotNull SimpleJavaLanguageParser.NumberContext ctx) {
        stack.push(DataType.INTEGER);
        return "ldc " + ctx.number.getText();
    }

    @Override
    public String visitIntVarDelaration(@NotNull SimpleJavaLanguageParser.IntVarDelarationContext ctx) {
        variablesMapping.put(variablesMapping.size(), DataType.INTEGER);
        integerVars.add(ctx.varName.getText());
        variables.put(ctx.varName.getText(), variables.size());
        return "";
    }

    @Override
    public String visitStringVarDeclaration(@NotNull SimpleJavaLanguageParser.StringVarDeclarationContext ctx) {
        variablesMapping.put(variablesMapping.size(), DataType.STRING);
        stringVars.add(ctx.varName.getText());
        variables.put(ctx.varName.getText(), variables.size());
        return "";
    }

    @Override
    public String visitString(@NotNull SimpleJavaLanguageParser.StringContext ctx) {
        stack.push(DataType.STRING);
        return "ldc " + ctx.string.getText();
    }

    @Override
    public String visitAssignment(@NotNull SimpleJavaLanguageParser.AssignmentContext ctx) {
        Integer varIndex = variables.get(ctx.varName.getText());

        if (varIndex == null) {
            throw new UndeclaredVariableException(ctx.varName);
        }

        String instructionArguments = visit(ctx.expr);
        stack.pop();

        if (stringVars.contains(ctx.varName.getText())) {
            return instructionArguments + "\n" +
                    "astore " + variables.get(ctx.varName.getText());
        }

        return instructionArguments + "\n" +
                "istore " + variables.get(ctx.varName.getText());
    }

    @Override
    public String visitVariable(@NotNull SimpleJavaLanguageParser.VariableContext ctx) {

        Integer varIndex = variables.get(ctx.varName.getText());

        DataType type = variablesMapping.get(varIndex);

        stack.push(type);

        if (varIndex == null) {
            throw new UndeclaredVariableException(ctx.varName);
        }

        if (type.equals(DataType.STRING)) {
            return "aload " + varIndex;
        }

        return "iload " + varIndex;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }

        return aggregate + "\n" + nextResult;
    }
}
