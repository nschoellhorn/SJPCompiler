grammar SimpleJavaLanguage;

program: (statement ';')+;

statement: printline
        | intVarDelaration
        | stringVarDeclaration
        | assignment
        ;

expression: left=expression '/' right=expression #Div
        | left=expression '*' right=expression #Mul
        | left=expression '+' right=expression #Plus
        | left=expression '-' right=expression #Minus
        | number=NUMBER #Number
        | varName=IDENTIFIER #Variable
        | string=STRING #String
        ;

intVarDelaration: 'allocate int with name ' varName=IDENTIFIER;
stringVarDeclaration: 'allocate text with name ' varName=IDENTIFIER;

assignment: 'assign' expr=expression 'to' varName=IDENTIFIER;

printline: 'printline ' argument=expression;

LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;

NUMBER: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

STRING : '"' .*? '"'  ;