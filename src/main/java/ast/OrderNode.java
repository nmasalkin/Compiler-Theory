package ast;

import java.util.*;

public class OrderNode implements AstNode {
    private String column;
    private String direction;

    public OrderNode(String column, String direction) {
        this.column = column;
        this.direction = direction;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return List.of(new ColumnNode(column));
    }

    @Override
    public String toString() {
        return "ORDER BY" + (direction != null ? " " + direction : "");
    }
}
