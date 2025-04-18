package ast;

import java.util.*;

public class IdentifierNode implements ExprNode {
    private String name;

    public IdentifierNode(String name) {
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
