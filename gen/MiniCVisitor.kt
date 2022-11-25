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
	 * Visit a parse tree produced by {@link MiniCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitDeclaration(ctx : MiniCParser.DeclarationContext) : T
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
	 * Visit a parse tree produced by {@link MiniCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitExpression(ctx : MiniCParser.ExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#bracketExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitBracketExpression(ctx : MiniCParser.BracketExpressionContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitCondition(ctx : MiniCParser.ConditionContext) : T
	/**
	 * Visit a parse tree produced by {@link MiniCParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	fun visitAssignment(ctx : MiniCParser.AssignmentContext) : T
}