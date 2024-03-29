/*
 * generated by Xtext 2.27.0
 */
lexer grammar InternalMyDslLexer;

@header {
package org.xtext.example.mydsl5.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Pipeline_tool_framework : 'pipeline_tool_framework';

Pipeline_envirnonment : 'pipeline_envirnonment';

Tool_framework_job : 'tool_framework_job';

Allow_faillure : 'Allow_faillure';

Tool_framework : 'Tool_framework';

Environment : 'Environment';

IfThenElse : 'IfThenElse';

Parameters : 'Parameters';

Ifthenelse : 'ifthenelse';

Condition : 'Condition';

Artifact : 'Artifact';

Command : 'Command';

Trigger : 'Trigger';

Command_1 : 'command';

Depends : 'depends';

Elseif : 'elseif';

Ifelse : 'ifelse';

Output : 'output';

Name1 : 'Name1';

Name3 : 'Name3';

Name5 : 'Name5';

Timer : 'Timer';

Value : 'Value';

False : 'false';

Input : 'input';

Jobs : 'jobs:';

Name : 'name:';

When : 'When';

Else : 'else';

Tool : 'tool';

True : 'true';

When_1 : 'when';

Key : 'Key';

If : 'if';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

Colon : ':';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
