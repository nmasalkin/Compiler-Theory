package ast;

public class WhereNode extends ASTNode {
    private String condition;

    public WhereNode(String condition) {
        this.condition = condition;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "WHERE");
        System.out.println(prefix + "│   └── " + condition);
    }
}