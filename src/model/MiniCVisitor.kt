package model// Generated from java-escape by ANTLR 4.7.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link model.MiniCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface MiniCVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgram(ctx : MiniCParser.ProgramContext) : T
	/**
	 * Visit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link model.MiniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpleDeclaration(ctx : MiniCParser.SimpleDeclarationContext) : T
	/**
	 * Visit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link model.MiniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignDeclaration(ctx : MiniCParser.AssignDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssign(ctx : MiniCParser.AssignContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : MiniCParser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#printfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitPrintfStatement(ctx : MiniCParser.PrintfStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#scanfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitScanfStatement(ctx : MiniCParser.ScanfStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockStatement(ctx : MiniCParser.BlockStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfStatement(ctx : MiniCParser.IfStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWhileStatement(ctx : MiniCParser.WhileStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : MiniCParser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE1(ctx : MiniCParser.E1Context) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE2(ctx : MiniCParser.E2Context) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE3(ctx : MiniCParser.E3Context) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE4(ctx : MiniCParser.E4Context) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE5(ctx : MiniCParser.E5Context) : T
	/**
	 * Visit a parse tree produced by {@link model.MiniCParser#e6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitE6(ctx : MiniCParser.E6Context) : T
}