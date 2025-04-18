package antlr;// Generated from SQL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(SQLParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(SQLParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SQLParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SQLParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SQLParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SQLParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(SQLParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(SQLParser.OrderByContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpr(SQLParser.LimitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpr(SQLParser.LimitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(SQLParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(SQLParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(SQLParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(SQLParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroupExpr(SQLParser.GroupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroupExpr(SQLParser.GroupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(SQLParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(SQLParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(SQLParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(SQLParser.BinaryExprContext ctx);
}