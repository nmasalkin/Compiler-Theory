package ast;

import java.util.*;

public class GroupNode implements AstNode {
    private final String label;
    private final List<? extends AstNode> children;

    public GroupNode(String label, List<? extends AstNode> children) {
        this.label = label;
        this.children = children;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return children;
    }

    @Override
    public String toString() {
        return label;
    }
}
