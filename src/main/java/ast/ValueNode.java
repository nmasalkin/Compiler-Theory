package ast;

import java.util.*;

public class ValueNode implements ExprNode {
    private String value;

    public ValueNode(String value) {
        this.value = value;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return value;
    }
}
