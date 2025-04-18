package parser;

import ast.SelectNode;
import org.antlr.v4.runtime.*;

public class SQLCompiler {
    public static void main(String[] args) {
        String sql = "SELECT name, age FROM users WHERE age > 18 ORDER BY name DESC LIMIT 10";

        SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);

        ASTBuilder builder = new ASTBuilder();
        SelectNode ast = builder.buildAST(parser.query());

        ast.print("");
    }
}