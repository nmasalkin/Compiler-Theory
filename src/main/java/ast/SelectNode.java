package ast;

import java.util.*;

public class SelectNode implements AstNode {
    private List<ColumnNode> columns;
    private TableNode table;
    private ExprNode where;
    private OrderNode order;
    private LimitNode limit;

    public SelectNode(List<ColumnNode> columns, TableNode table, ExprNode where, OrderNode order, LimitNode limit) {
        this.columns = columns;
        this.table = table;
        this.where = where;
        this.order = order;
        this.limit = limit;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        List<AstNode> children = new ArrayList<>();
        children.add(new GroupNode("COLUMNS", columns));
        if (table != null) children.add(table);
        if (where != null) children.add(new GroupNode("WHERE", List.of(where)));
        if (order != null) children.add(order);
        if (limit != null) children.add(limit);
        return children;
    }

    @Override
    public String toString() {
        return "SELECT";
    }
}
