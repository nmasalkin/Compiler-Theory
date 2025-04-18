package parser;

import antlr.SQLBaseVisitor;
import antlr.SQLParser;
import ast.*;

import java.util.*;
import java.util.stream.Collectors;

public class SqlAstVisitor extends SQLBaseVisitor<Object> {

    @Override
    public SelectNode visitSelectStmt(SQLParser.SelectStmtContext ctx) {
        // Обработка списка колонок
        List<ColumnNode> columns;
        if (ctx.columns().STAR() != null) {
            columns = List.of(new ColumnNode("*"));
        } else {
            columns = ctx.columns().column().stream()
                    .map(colCtx -> (ColumnNode) visit(colCtx))
                    .collect(Collectors.toList());
        }

        TableNode table = (TableNode) visit(ctx.tableName());

        ExprNode where = ctx.condition() != null ? (ExprNode) visit(ctx.condition()) : null;
        OrderNode order = ctx.orderBy() != null ? (OrderNode) visit(ctx.orderBy()) : null;
        LimitNode limit = ctx.limitExpr() != null ? (LimitNode) visit(ctx.limitExpr()) : null;

        return new SelectNode(columns, table, where, order, limit);
    }

    @Override
    public ColumnNode visitColumn(SQLParser.ColumnContext ctx) {
        return new ColumnNode(ctx.getText());
    }

    @Override
    public TableNode visitTableName(SQLParser.TableNameContext ctx) {
        return new TableNode(ctx.getText());
    }

    @Override
    public ExprNode visitBinaryExpr(SQLParser.BinaryExprContext ctx) {
        ExprNode left = (ExprNode) visit(ctx.left);
        String op = ctx.op.getText();
        ExprNode right = (ExprNode) visit(ctx.right);
        return new BinaryExprNode(left, op, right);
    }

    @Override
    public ExprNode visitIdentExpr(SQLParser.IdentExprContext ctx) {
        return new IdentifierNode(ctx.getText());
    }

    @Override
    public ExprNode visitNumberExpr(SQLParser.NumberExprContext ctx) {
        return new ValueNode(ctx.getText());
    }

    @Override
    public ExprNode visitStringExpr(SQLParser.StringExprContext ctx) {
        return new ValueNode(ctx.getText());
    }

    @Override
    public ExprNode visitGroupExpr(SQLParser.GroupExprContext ctx) {
        return (ExprNode) visit(ctx.expr());
    }

    @Override
    public OrderNode visitOrderBy(SQLParser.OrderByContext ctx) {
        String column = ctx.column().getText();
        String direction = ctx.ASC() != null ? "ASC" : (ctx.DESC() != null ? "DESC" : null);
        return new OrderNode(column, direction);
    }

    @Override
    public LimitNode visitLimitExpr(SQLParser.LimitExprContext ctx) {
        return new LimitNode(ctx.getText());
    }
}