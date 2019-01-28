grammar BnfGm;
/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/
prog:	(declar NEWLINE?)* (assign NEWLINE?)*    /* declar가 assign보다 앞 */
    |	expr
    ;
declar: ID variable':'datatype';';
assign : variable':='expr';';
expr:	expr (PLUS|MINUS) term
    |	number
    |	variable
    |	term
    ;
term:	term (MULT|DIV) factor
    |	number
    |	variable
    |	'(' expr ')'
    ;
factor:	number
    |	variable
    |	'(' expr ')'
    ;
variable : ID(','ID)*;
datatype : ID;
number : INT
    |	REAL
    ;
/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';

INT : ('0'..'9')+ ;
REAL : INT('.'(INT)?)?;
ID : ('a'..'z'|'A'..'Z'|'0'..'9')+ ;

NEWLINE : [\r\n]+ ;
WHITESPACE : [ \t] + -> channel (HIDDEN);
