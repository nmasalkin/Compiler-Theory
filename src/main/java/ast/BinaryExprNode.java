package ast;

import java.util.*;

public class BinaryExprNode implements ExprNode {
    private String op;
    private ExprNode left;
    private ExprNode right;

    public BinaryExprNode(ExprNode left, String op, ExprNode right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public Collection<? extends AstNode> childs() {
        return List.of(left, right);
    }

    @Override
    public String toString() {
        return op;
    }
}
