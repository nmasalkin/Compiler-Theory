package ast;

import java.util.*;

public class ColumnNode implements AstNode {
    private String name;

    public ColumnNode(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return name;
    }
}
