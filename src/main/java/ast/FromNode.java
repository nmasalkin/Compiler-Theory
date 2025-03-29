package ast;

public class FromNode extends ASTNode {
    private String name;

    public FromNode(String name) {
        this.name = name;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "FROM");
        System.out.println(prefix + "│   └── " + name);
    }
}