package ast;

public class ColumnNode extends ASTNode {
    private String name;

    public ColumnNode(String name) {
        this.name = name;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + name);
    }
}