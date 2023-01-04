lexer grammar MCLexer;


BOOL : 'true' | 'false';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
TYPE : 'int' | 'double';
WS  : [ \t\r\n]+ -> skip;
WORD_END : ' ';
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
ID : (LETTER | UNDERSCORE)+ (UNDERSCORE | DIGIT)*;
TIMES : '*' ;
DIVIDED : '/' ;
MODULE : '%';
PLUS : '+';
MINUS : '-';
MINOR : '<';
MINOREQUAL : '<=';
MAJOR : '>';
MAJOREQUAL : '>=';
ISEQUAL : '==';
ISNOTEQUAL : '!=';
OR : '||';
AND : '&&' ;
NOT : '!';
EQUAL : '=';
ENDOFINSTRUCTION : ';';
NUMBER : DIGIT+ ('.' DIGIT+)?;
LETTER : [a-zA-Z];
DIGIT : [0-9];
UNDERSCORE : '_';
RBRACKETOPEN : '(';
RBRACKETCLOSE : ')';
CBRACKETOPEN : '{';
CBRACKETCLOSE : '}';

