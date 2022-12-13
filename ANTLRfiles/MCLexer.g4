lexer grammar MCLexer;


BOOL : 'true' | 'false';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
TYPE : 'int' | 'double';
WS  : [\t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
NUMBER : ('-')? DIGIT+ ('.' DIGIT+)?;
ID : (LETTER | UNDERSCORE)+ (UNDERSCORE | NUMBER)*;
LETTER : [a-zA-Z];
DIGIT : [0-9];
/*FIRSTPRIORITYOPERATOR :  '*' | '/' | '%';
  SECONDPRIORITYOPERATOR : '+' | '-' ;
  THIRDPRIORITYOPERATOR :   '<' | '<=' | '>' | '>=' ;
  FOURTHPRIORITYOPERATOR :  '==' | '!=' ;
  FIFTHPRIORITYOPERATOR :  '||' | '&&' ; */
OPERATOR : '+' | '-' | '*' | '/' | '%' | '||' | '&&' | '<' | '<=' | '>' | '>=' | '==' | '!=' ;
NOT : '!';
EQUAL : '=';
ENDOFINSTRUCTION : ';';
UNDERSCORE : '_';
RBRACKETOPEN : '(';
RBRACKETCLOSE : ')';
CBRACKETOPEN : '{';
CBRACKETCLOSE : '}';

