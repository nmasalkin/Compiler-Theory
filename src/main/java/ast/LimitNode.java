package ast;

public class LimitNode extends ASTNode {
    private int limit;

    public LimitNode(int limit) {
        this.limit = limit;
    }

    @Override
    public void print(String prefix) {
        System.out.println("LIMIT\n" + prefix + limit);
    }
}