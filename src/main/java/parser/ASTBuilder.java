package parser;

import ast.*;
import antlr.*;

import java.util.List;
import java.util.stream.Collectors;

public class ASTBuilder {

    public SelectNode buildAST(SQLParser.QueryContext ctx) {
        List<ColumnNode> columns = ctx.columnList().column().stream()
                .map(col -> new ColumnNode(col.getText()))
                .collect(Collectors.toList());

        FromNode table = new FromNode(ctx.tableName().getText());

        WhereNode where = ctx.condition() != null ? new WhereNode(ctx.condition().getText()) : null;
        OrderByNode orderBy = ctx.columnOrder() != null
                ? new OrderByNode(ctx.columnOrder().column().getText(), ctx.columnOrder().ASC() != null)
                : null;
        LimitNode limit = ctx.limitValue() != null ? new LimitNode(Integer.parseInt(ctx.limitValue().getText())) : null;

        return new SelectNode(columns, table, where, orderBy, limit);
    }
}