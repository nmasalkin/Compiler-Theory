package ast;

import java.util.*;

public class TableNode implements AstNode {
    private String name;

    public TableNode(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "FROM: " + name;
    }
}
