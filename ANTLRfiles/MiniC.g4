grammar MiniC;
import MCLexer;

program : declaration* statement*;
declaration : TYPE ID (EQUAL (expression | bracketExpression | condition | assignment))? ENDOFISTRUCTION;
statement : ENDOFISTRUCTION | (expression | bracketExpression | condition | assignment) ENDOFISTRUCTION | blockStatement | ifStatement | whileStatement;
blockStatement : CBRACKETOPEN declaration* statement* CBRACKETCLOSE;
ifStatement : IF RBRACKETOPEN(expression | bracketExpression | condition | assignment) RBRACKETCLOSE statement (ELSE statement)?;
whileStatement : WHILE RBRACKETOPEN(expression | bracketExpression | condition | assignment) RBRACKETCLOSE statement;
expression : BOOL | NUMBER | NEGATIVENUMBER | DOUBLENUMBER;
bracketExpression: RBRACKETOPEN expression RBRACKETCLOSE;
condition: NOT? (expression | ID) (OPERATOR (expression | ID))?;
assignment: ID (EQUAL expression)+;




