// Generated from E:/IntelliJ Projects/SJPCompiler/grammar\SimpleJavaLanguage.g4 by ANTLR 4.4.1-dev
package net.dreamcode.sjp.parsing;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaLanguageParser}.
 */
public interface SimpleJavaLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull SimpleJavaLanguageParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull SimpleJavaLanguageParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull SimpleJavaLanguageParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull SimpleJavaLanguageParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SimpleJavaLanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SimpleJavaLanguageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#printline}.
	 * @param ctx the parse tree
	 */
	void enterPrintline(@NotNull SimpleJavaLanguageParser.PrintlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#printline}.
	 * @param ctx the parse tree
	 */
	void exitPrintline(@NotNull SimpleJavaLanguageParser.PrintlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull SimpleJavaLanguageParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull SimpleJavaLanguageParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleJavaLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleJavaLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull SimpleJavaLanguageParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull SimpleJavaLanguageParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SimpleJavaLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SimpleJavaLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#stringVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringVarDeclaration(@NotNull SimpleJavaLanguageParser.StringVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#stringVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringVarDeclaration(@NotNull SimpleJavaLanguageParser.StringVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleJavaLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleJavaLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull SimpleJavaLanguageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull SimpleJavaLanguageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaLanguageParser#intVarDelaration}.
	 * @param ctx the parse tree
	 */
	void enterIntVarDelaration(@NotNull SimpleJavaLanguageParser.IntVarDelarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaLanguageParser#intVarDelaration}.
	 * @param ctx the parse tree
	 */
	void exitIntVarDelaration(@NotNull SimpleJavaLanguageParser.IntVarDelarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull SimpleJavaLanguageParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull SimpleJavaLanguageParser.DivContext ctx);
}