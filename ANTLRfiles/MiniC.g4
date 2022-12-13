grammar MiniC;
import MCLexer;
options {
  tokenVocab=MiniCLexer;
}

program : declaration* statement*;
declaration : TYPE ID ENDOFINSTRUCTION #SimpleDeclaration
            | TYPE ID EQUAL (expression | operation) ENDOFINSTRUCTION #AssignDeclaration;
statement : ENDOFINSTRUCTION | (expression | operation) ENDOFINSTRUCTION | blockStatement | ifStatement | whileStatement;
blockStatement : CBRACKETOPEN declaration* statement* CBRACKETCLOSE;
ifStatement : IF RBRACKETOPEN (expression | operation ) RBRACKETCLOSE statement (ELSE statement)?;
whileStatement : WHILE RBRACKETOPEN (expression | operation ) RBRACKETCLOSE statement;
expression : BOOL #BoolExpr
            | NUMBER #NumberExpr
            | RBRACKETOPEN (expression | operation) RBRACKETCLOSE #BracketExpr
            | ID EQUAL (expression | operation) #AssignExpr;
operation : NOT? (expression | ID) (OPERATOR (expression | operation))?;


