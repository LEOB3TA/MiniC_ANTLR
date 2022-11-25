lexer grammar MCLexer;

WS  : [\t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
TYPE : 'int' | 'double';
NEGATIVENUMBER : '-' (NUMBER | DOUBLENUMBER);
NUMBER : NONZERODIGIT DIGIT*;
DOUBLENUMBER : NUMBER ('.' DIGIT+)? | ZERODIGIT ('.' DIGIT+)?;
DIGIT : ZERODIGIT | NONZERODIGIT;
LETTER : [a-zA-Z];
NONZERODIGIT : [1-9];
ZERODIGIT : '0' ;
OPERATOR : '+' | '-' | '*' | '/' | '%' | '||' | '&&' | '<' | '<=' | '>' | '>=' | '==' | '!=' ;
NOT : '!';
EQUAL : '=';
BOOL : 'true' | 'false';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
ENDOFISTRUCTION : ';';
UNDERSCORE : '_';
RBRACKETOPEN : '(';
RBRACKETCLOSE : ')';
CBRACKETOPEN : '{';
CBRACKETCLOSE : '}';
ID : (LETTER | UNDERSCORE)+ NUMBER*;
