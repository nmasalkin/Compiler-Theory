package ast;

public class OrderByNode extends ASTNode {
    private String column;
    private boolean ascending;

    public OrderByNode(String column, boolean ascending) {
        this.column = column;
        this.ascending = ascending;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "ORDER BY");
        System.out.println(prefix + "│   └── " + column + (ascending ? " ASC" : " DESC"));
    }
}