grammar SQL;

WS: [ \t\r\n]+ -> skip ;
STRING: '\'' .*? '\'' ;
NUMBER: [0-9]+ ;
IDENT: [a-zA-Z_][a-zA-Z_0-9]* ;

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ORDER: 'ORDER';
BY: 'BY';
ASC: 'ASC';
DESC: 'DESC';
LIMIT: 'LIMIT';

EQ: '=';
NEQ: '<>';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';

COMMA: ',';

query: selectStmt EOF;

selectStmt
    : SELECT columns FROM tableName (WHERE condition)? (ORDER BY orderBy)? (LIMIT limitExpr)?
    ;

columns: STAR | column (COMMA column)*;
column: IDENT;
tableName: IDENT;

condition: expr;

orderBy: column (ASC | DESC)?;

limitExpr: NUMBER;

expr
    : left=expr op=(EQ | NEQ | LT | LE | GT | GE) right=expr   #binaryExpr
    | IDENT                                                   #identExpr
    | NUMBER                                                  #numberExpr
    | STRING                                                  #stringExpr
    | '(' expr ')'                                            #groupExpr
    ;

STAR: '*';
