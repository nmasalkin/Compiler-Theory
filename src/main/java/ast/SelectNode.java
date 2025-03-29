package ast;

import java.util.List;

public class SelectNode extends ASTNode {
    private List<ColumnNode> columns;
    private FromNode table;
    private WhereNode where;
    private OrderByNode orderBy;
    private LimitNode limit;

    public SelectNode(List<ColumnNode> columns, FromNode table, WhereNode where, OrderByNode orderBy, LimitNode limit) {
        this.columns = columns;
        this.table = table;
        this.where = where;
        this.orderBy = orderBy;
        this.limit = limit;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "Запрос");
        System.out.println(prefix + "├── SELECT");

        for (int i = 0; i < columns.size(); i++) {
            String connector = (i == columns.size() - 1) ? "└── " : "├── ";
            columns.get(i).print(prefix + "│   " + connector);
        }

        table.print(prefix + "├── ");

        if (where != null) where.print(prefix + "├── ");
        if (orderBy != null) orderBy.print(prefix + "├── ");
        if (limit != null) limit.print(prefix + "└── ");
    }
}
