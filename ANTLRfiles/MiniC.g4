grammar MiniC;
import MCLexer;
options {
  tokenVocab=MCLexer;
}


program : statement*;
declaration : TYPE ID ENDOFINSTRUCTION #SimpleDeclaration
            | TYPE ID EQUAL ( assign | expression | printfStatement | scanfStatement  ) ENDOFINSTRUCTION  #AssignDeclaration;
assign : ID EQUAL ( assign | expression | printfStatement | scanfStatement  );
statement : ENDOFINSTRUCTION | ( assign | expression | printfStatement | scanfStatement  ) ENDOFINSTRUCTION | blockStatement | ifStatement | whileStatement | declaration;
printfStatement : PRINTF RBRACKETOPEN STRING_CHAR (COMMA (expression))* RBRACKETCLOSE;
scanfStatement : SCANF RBRACKETOPEN STRING_CHAR (COMMA (AMPERSAND ID))+ RBRACKETCLOSE;
blockStatement : CBRACKETOPEN statement* CBRACKETCLOSE;
ifStatement : IF RBRACKETOPEN ( assign | expression | printfStatement | scanfStatement  ) RBRACKETCLOSE statement (ELSE statement)?;
whileStatement : WHILE RBRACKETOPEN ( assign | expression | printfStatement | scanfStatement  ) RBRACKETCLOSE statement;
expression : e1 ( OR e1)* ;
e1 : e2 ( AND e2 )* ;
e2 : e3  (op=(MINOR | MINOREQUAL | MAJOR | MAJOREQUAL | ISEQUAL | ISNOTEQUAL) e3 )* ;
e3 : e4? ( op=(PLUS | MINUS) e4 )* ;
e4 : e5  ( op=(TIMES | DIVIDED | MODULE) e5 )* ;
e5 : e6 | NOT e5 ;
e6 : BOOL | NUMBER | ID | RBRACKETOPEN expression RBRACKETCLOSE;


