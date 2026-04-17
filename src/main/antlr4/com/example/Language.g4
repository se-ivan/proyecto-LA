grammar Language;


BOOKSHELF    : (ENCHANTING PUNTO_COMA*)+ EOF ;

instruccion : asignacion 
            | condicional 
            | exp_logica 
            ;

exp_logica  : exp_and (OP_OR exp_and)* ;
exp_and     : comparacion (OP_AND comparacion)* ;

comparacion : expresion ((MAYOR_QUE | MENOR_QUE | IGUAL_QUE) expresion)? ;

asignacion  : ID ASIG (expresion | comparacion) ;

condicional : IF PAR_IZQ comparacion PAR_DER LLAVE_IZQ (instruccion PUNTO_COMA*)+ LLAVE_DER ;

expresion   : termino ((OP_SUMA | OP_RESTA) termino)* ;

termino     : factor ((OP_MULT | OP_DIV) factor)* ;

factor      : ENT 
            | ID 
            | PAR_IZQ exp_logica PAR_DER 
            ;

IF         : 'if' ;
LLAVE_IZQ  : '{' ;
LLAVE_DER  : '}' ;
OP_SUMA    : '+' ;
OP_RESTA   : '-' ;
OP_MULT    : '*' ;
OP_DIV     : '/' ;
PAR_IZQ    : '(' ;
PAR_DER    : ')' ;
ASIG       : '=' ;
PUNTO_COMA : ';' ;
MENOR_QUE  : '<' ;
MAYOR_QUE  : '>' ;
IGUAL_QUE  : '==' ;
OP_OR      : '||' ;
OP_AND     : '&&' ;

ENT        : [0-9]+ ;
ID         : [a-zA-Z_][a-zA-Z_0-9]* ;
WS         : [ \t\n\r\f]+ -> skip ;