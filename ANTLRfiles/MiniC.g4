grammar MiniC;
import Lexer;

program : declaration* statement*;
declaration : TYPE identifier (EQUAL (expression | bracketExpression | condition | assignment))? ENDOFISTRUCTION;
identifier : identifierHead | identifierHead identifierTail;
identifierHead : LETTER | UNDERSCORE;
identifierTail : (identifierHead | DIGIT) identifierTail*;
statement : ENDOFISTRUCTION | (expression | bracketExpression | condition | assignment) ENDOFISTRUCTION | blockStatement | ifStatement | whileStatement;
blockStatement : CBRACKETOPEN declaration* statement* CBRACKETCLOSE;
ifStatement : IF RBRACKETOPEN(expression | bracketExpression | condition | assignment) RBRACKETCLOSE statement (ELSE statement)?;
whileStatement : WHILE RBRACKETOPEN(expression | bracketExpression | condition | assignment) RBRACKETCLOSE statement;
expression : BOOL | NUMBER | NEGATIVENUMBER ;
bracketExpression: RBRACKETOPEN expression RBRACKETCLOSE;
condition: NOT? (expression | identifier) (OPERATOR expression)?;
assignment: identifier (EQUAL expression)+;




