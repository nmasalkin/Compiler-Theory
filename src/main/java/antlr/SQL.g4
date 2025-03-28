grammar SQL;

query: SELECT columnList FROM tableName (WHERE condition)? (ORDER BY columnOrder)? (LIMIT limitValue)?;

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ORDER: 'ORDER';
BY: 'BY';
LIMIT: 'LIMIT';

columnList: '*' | column (',' column)*;
column: IDENTIFIER;
tableName: IDENTIFIER;
condition: column operator value;
operator: '=' | '>' | '<' | '>=' | '<=' | '<>';
value: NUMBER | STRING;
columnOrder: column (ASC | DESC)?;
ASC: 'ASC';
DESC: 'DESC';
limitValue: NUMBER;

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
STRING: '\'' .*? '\'';

WS: [ \t\r\n]+ -> skip;