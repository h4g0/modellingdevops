/*
 * generated by Xtext 2.27.0
 */
lexer grammar InternalMyDslLexer;

@header {
package org.xtext.example.mydsl10.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Pipeline_tool_framework : 'pipeline_tool_framework';

Pipeline_envirnonment : 'pipeline_envirnonment';

Tool_framework_job : 'tool_framework_job';

Allow_faillure : 'Allow_faillure';

Ifthenelse : 'ifthenelse';

Condition : 'Condition';

Artifact : 'Artifact';

Name_2 : '- name:';

Depends : 'depends';

Run : '- run:';

Elseif : 'elseif';

Ifelse : 'ifelse';

Output : 'output';

Run_1 : 'run: |';

Steps : 'steps:';

Name3 : 'Name3';

Name : 'Name:';

False : 'false';

Input : 'input';

Jobs : 'jobs:';

Name_1 : 'name:';

Else : 'else';

Env : 'env:';

True : 'true';

On : 'on:';

If : 'if';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

Colon : ':';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

RULE_TRIGGERS : ('push'|'pull_request'|'check_suite'|'create'|'delete'|'deployment'|'deployment_status'|'discussion'|'fork'|'gollum'|'issue_comment');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
