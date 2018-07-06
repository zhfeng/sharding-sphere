grammar MySQLDML;
import DMLBase,SQLBase,Keyword,Symbol;
@header{
	package io.shardingsphere.parser.antlr.mysql;
}

selectSpec: 
	(ALL | DISTINCT | DISTINCTROW)? 
	HIGH_PRIORITY? 
	STRAIGHT_JOIN?
	SQL_SMALL_RESULT?
	SQL_BIG_RESULT?
	SQL_BUFFER_RESULT?
	(SQL_CACHE | SQL_NO_CACHE)?
	SQL_CALC_FOUND_ROWS?
	;

//https://dev.mysql.com/doc/refman/8.0/en/expressions.html
expr:
	expr OR expr
  	| expr OR_SYM  expr
  	| expr XOR expr
  	| expr AND expr
 	| expr AND_SYM expr
 	| LEFT_PAREN expr RIGHT_PAREN
  	| NOT expr
  	| NOT_SYM expr
  	| booleanPrimary
	;
	
booleanPrimary:
    booleanPrimary IS NOT? (TRUE | FALSE | UNKNOWN |NULL)
  	| booleanPrimary SAFE_EQ predicate
 	| booleanPrimary comparisonOperator predicate
  	| booleanPrimary comparisonOperator (ALL | ANY) subquery
  	| predicate
  	;

comparisonOperator:
	EQ_OR_ASSIGN | GTE | GT | LTE | LT | NEQ_SYM | NEQ
	;

predicate:
	bitExpr NOT? IN subquery
	| bitExpr NOT? IN LEFT_PAREN simpleExpr ( COMMA  simpleExpr)* RIGHT_PAREN
	| bitExpr NOT? BETWEEN simpleExpr AND predicate
	| bitExpr SOUNDS LIKE simpleExpr
	| bitExpr NOT? LIKE simpleExpr (ESCAPE simpleExpr)*
	| bitExpr NOT? REGEXP simpleExpr
	| bitExpr
	;
  
bitExpr:
	bitExpr BIT_INCLUSIVE_OR bitExpr
	| bitExpr BIT_AND bitExpr
	| bitExpr SIGNED_LEFT_SHIFT bitExpr
	| bitExpr SIGNED_RIGHT_SHIFT bitExpr
	| bitExpr PLUS bitExpr
	| bitExpr MINUS bitExpr
	| bitExpr ASTERISK bitExpr
	| bitExpr SLASH bitExpr
	| bitExpr DIV bitExpr
	| bitExpr MOD bitExpr
	| bitExpr MOD_SYM bitExpr
	| bitExpr BIT_EXCLUSIVE_OR bitExpr
	//| bitExpr '+' interval_expr
	//| bitExpr '-' interval_expr
	| simpleExpr
	;
	
simpleExpr:
	| functionCall
	| liter
	| ID
	| simpleExpr collateClause
	//| param_marker
	//| variable
	| simpleExpr AND_SYM simpleExpr
	| PLUS simpleExpr
	| MINUS simpleExpr
	| UNARY_BIT_COMPLEMENT simpleExpr
	| NOT_SYM simpleExpr
	| BINARY simpleExpr
	| LEFT_PAREN expr RIGHT_PAREN
	| ROW LEFT_PAREN simpleExpr( COMMA  simpleExpr)* RIGHT_PAREN
	| subquery
	| EXISTS subquery
	// | (identifier expr)
	//| match_expr
	//| case_expr
	// | interval_expr 
	;
 
liter:
	QUESTION
	|NUMBER
	|TRUE 
	|FALSE
	|NULL
	|LEFT_BRACE ID STRING RIGHT_BRACE //
	|HEX_DIGIT
	|ID? STRING  collateClause?
	|(DATE | TIME |TIMESTAMP)STRING
	|ID? BIT_NUM collateClause?
	; 

collateClause:
	COLLATE ID
	;

functionCall:
	ID LEFT_PAREN(|expr ( COMMA  expr)*) RIGHT_PAREN
	;

caseExpress:
	caseCond
	|caseComp
	;
	
caseComp:
	CASE simpleExpr caseWhenComp+ elseResult? END  
	;
	
caseWhenComp:
	WHEN simpleExpr THEN caseResult
	;

caseCond:
	CASE whenResult+ elseResult? END
	;
	
whenResult:
	WHEN booleanPrimary THEN caseResult
	;

elseResult:
	ELSE caseResult
	;

caseResult:
	expr
	;

selectExpr:
	(bitExpr| caseExpress) AS? alias?
	;
	
	
//https://dev.mysql.com/doc/refman/8.0/en/join.html
tableReferences:
    tableReference(COMMA  tableReference)*
    ;

tableReference:
	(tableFactor joinTable)+
  	| tableFactor joinTable+
  	| tableFactor
 	;
 	
tableFactor:
    tableName (PARTITION  itemList)?
        (AS? alias)? indexHintList? 
  	| subquery AS? alias
  	| LEFT_PAREN tableReferences RIGHT_PAREN
	;
	

joinTable:
	(INNER | CROSS)? JOIN tableFactor joinCondition?
  	| STRAIGHT_JOIN tableFactor
  	| STRAIGHT_JOIN tableFactor joinCondition
  	| (LEFT|RIGHT) OUTER? JOIN tableFactor joinCondition
  	| NATURAL (INNER | (LEFT|RIGHT) (OUTER))? JOIN tableFactor
	;
	
joinCondition:
    ON expr
  	| USING itemList
	;
    
indexHintList:
    indexHint(COMMA  indexHint)*
    ;

indexHint:
	USE (INDEX|KEY) (FOR (JOIN|ORDER BY|GROUP BY))* itemList
  	| IGNORE (INDEX|KEY) (FOR (JOIN|ORDER BY|GROUP BY))* itemList
 	;

//delete 
deleteClause:
	DELETE deleteSpec (fromMulti| fromSingle) 
	;
	
fromSingle: 
	FROM ID partitionClause?
	; 
	 
fromMulti:
	(ID ('.*')? (COMMA ID ('.*')?)* FROM  tableReferences)
	|FROM (ID ('.*')? (COMMA ID ('.*')?)* USING tableReferences)
	;

deleteSpec: 
	LOW_PRIORITY?
	|QUICK?
	|IGNORE?
	;
	
// define insert rule
insert:
	insertClause INTO? ID partitionClause? 
	(setClause | columnClause) onDuplicateClause?
	;
	
insertClause:
	INSERT insertSpec?
	;
	
insertSpec:
	LOW_PRIORITY
	| DELAYED 
	| HIGH_PRIORITY IGNORE
	;
	
partitionClause: 
	PARTITION itemList
	;
	
columnClause: 
	itemListWithEmpty? (valueClause | select)
	;
	
valueClause: 
	(VALUES | VALUE) valueList (COMMA valueList)*
	;
	
setClause: 
	SET assignmentList
	;
	
onDuplicateClause: 
	ON DUPLICATE KEY UPDATE assignmentList
	;

itemListWithEmpty:
	(LEFT_PAREN RIGHT_PAREN)
	|itemList
	;

assignmentList: 
	assignment (COMMA assignment)*
	;
	
assignment:
	columnName EQ_OR_ASSIGN value;
	
value:
	DEFAULT|expr;
	
valueList:
	LEFT_PAREN value (COMMA value)* RIGHT_PAREN
	;

//override update rule
updateClause: 
	UPDATE updateSpec tableReferences
	;
	
updateSpec: 
	LOW_PRIORITY? IGNORE?
	;

item: ID; 

DISTINCTROW: D I S T I N C T R O W;
HIGH_PRIORITY: H I G H UL_ P R I O R I T Y;
STRAIGHT_JOIN: S T R A I G H T UL_ J O I N;
SQL_SMALL_RESULT: S Q L UL_ S M A L L UL_ R E S U L T;
SQL_BIG_RESULT: S Q L UL_ B I G UL_ R E S U L T;
SQL_BUFFER_RESULT: S Q L UL_ B U F F E R UL_ R E S U L T;
SQL_CACHE: S Q L UL_ C A C H E;
SQL_NO_CACHE: S Q L UL_ N O UL_ C A C H E;
SQL_CALC_FOUND_ROWS: S Q L UL_ C A L C UL_ F O U N D UL_ R O W S;

OUTFILE: O U T F I L E;
CHARACTER: C H A R A C T E R;
DUMPFILE: D U M P F I L E;

SKIP_: S K I P;
OJ: O J;

LOW_PRIORITY: L O W UL_ P R I O R I T Y;

DELAYED: D E L A Y E D;

COLLATE :C O L L A T E ;







     
