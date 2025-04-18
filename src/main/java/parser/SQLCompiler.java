package parser;

import antlr.SQLLexer;
import antlr.SQLParser;
import ast.SelectNode;
import org.antlr.v4.runtime.*;

public class SQLCompiler {
    public static void main(String[] args) {
        String query = "SELECT name, age FROM users WHERE age > 30 ORDER BY name DESC LIMIT 10";

        // Создание лексера и парсера
        CharStream input = CharStreams.fromString(query);
        SQLLexer lexer = new SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);

        // Парсинг и визит
        SQLParser.QueryContext tree = parser.query();
        SqlAstVisitor visitor = new SqlAstVisitor();
        SelectNode ast = (SelectNode) visitor.visit(tree);

        // Печать AST
        System.out.println(ast);
    }
}