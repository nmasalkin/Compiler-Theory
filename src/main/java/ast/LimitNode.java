package ast;

import java.util.*;

public class LimitNode implements AstNode {
    private String limit;

    public LimitNode(String limit) {
        this.limit = limit;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return Arrays.asList(new ValueNode(limit));
    }

    @Override
    public String toString() {
        return "LIMIT";
    }
}