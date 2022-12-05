// Generated from java-escape by ANTLR 4.7.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
interface MiniCVisitor<T> : ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitProgram(ctx : MiniCParser.ProgramContext) : T
	/**
	 * Visit a parse tree produced by the {@code SimpleDeclaration}
	 * labeled alternative in {@link MiniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitSimpleDeclaration(ctx : MiniCParser.SimpleDeclarationContext) : T
	/**
	 * Visit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link MiniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignDeclaration(ctx : MiniCParser.AssignDeclarationContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitStatement(ctx : MiniCParser.StatementContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBlockStatement(ctx : MiniCParser.BlockStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitIfStatement(ctx : MiniCParser.IfStatementContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitWhileStatement(ctx : MiniCParser.WhileStatementContext) : T
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBoolExpr(ctx : MiniCParser.BoolExprContext) : T
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitNumberExpr(ctx : MiniCParser.NumberExprContext) : T
	/**
	 * Visit a parse tree produced by the {@code BracketExpr}
	 * labeled alternative in {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBracketExpr(ctx : MiniCParser.BracketExprContext) : T
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignExpr(ctx : MiniCParser.AssignExprContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitOperation(ctx : MiniCParser.OperationContext) : T
}