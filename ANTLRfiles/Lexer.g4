lexer grammar Lexer;

WS  : [\t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
TYPE : 'int';
NEGATIVENUMBER : '-' NUMBER;
NUMBER : NONZERODIGIT DIGIT* ('.' DIGIT+)? | ZERODIGIT ('.' DIGIT+)?;  //perchè esistono anche i decimali se sono solo numeri interi ???
DIGIT : ZERODIGIT | NONZERODIGIT;
LETTER : 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'o' | 'p' | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' |
 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z';
NONZERODIGIT : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
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
