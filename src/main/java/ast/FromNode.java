package ast;

public class FromNode extends ASTNode {
    private String name;

    public FromNode(String name) {
        this.name = name;
    }

    @Override
    public void print(String prefix) {
        System.out.println("FROM\n" + prefix + name);
    }
}