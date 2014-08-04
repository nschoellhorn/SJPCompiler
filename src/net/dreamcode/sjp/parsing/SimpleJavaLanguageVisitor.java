// Generated from E:/IntelliJ Projects/SJPCompiler/grammar\SimpleJavaLanguage.g4 by ANTLR 4.4.1-dev
package net.dreamcode.sjp.parsing;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull SimpleJavaLanguageParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull SimpleJavaLanguageParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull SimpleJavaLanguageParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#printline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintline(@NotNull SimpleJavaLanguageParser.PrintlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull SimpleJavaLanguageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SimpleJavaLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull SimpleJavaLanguageParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SimpleJavaLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#stringVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVarDeclaration(@NotNull SimpleJavaLanguageParser.StringVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimpleJavaLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull SimpleJavaLanguageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaLanguageParser#intVarDelaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVarDelaration(@NotNull SimpleJavaLanguageParser.IntVarDelarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SimpleJavaLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull SimpleJavaLanguageParser.DivContext ctx);
}