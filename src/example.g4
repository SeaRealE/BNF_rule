/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/
program : declaration+ assignment+ EOF;
declaration : type IDENTIFIER (','IDENTIFIER)* ':' TYPE ';';
assignment : lvalue '=' rvalue ';' ;
lvalue : IDENTIFIER ;
rvalue : expr ;
type : TYPEDEF ;
expr : term ( ( '+' | '-' ) term )* ;
term : factor ( ( '*' | '/' ) factor )* ;
factor : NUMBER | IDENTIFIER | '(' expr ')' ;

/*------------------------------------------------------------------
* LEXER RULES
*------------------------------------------------------------------*/
TYPEDEF : 'var' ;
TYPE : 'integer' | 'real' ;

IDENTIFIER : LETTER (LETTER | DIGIT)*;
NEWLINE : [\r\n]+ ;
WHITESPACE : [ \t] + -> channel (HIDDEN);
