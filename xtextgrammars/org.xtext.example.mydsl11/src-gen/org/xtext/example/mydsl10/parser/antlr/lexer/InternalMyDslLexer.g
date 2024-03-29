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

Allow_faillure : 'Allow_faillure';

Else : '[[- else]]';

FailFast : 'fail-fast:';

End : '[[- end]]';

Strategy : 'strategy:';

Outputs : 'outputs:';

RunsOn : 'runs-on:';

Secrets : 'secrets:';

Uses_1 : '- uses:';

If_1 : '[[- if ';

Matrix : 'matrix:';

Path : 'path: |';

Run_2 : '- run:';

Needs : 'needs:';

Run_3 : 'run: <';

Run_4 : 'run: >';

Run_5 : 'run: |';

Steps : 'steps:';

False : 'false';

Jobs : 'jobs:';

Run_1 : 'run: ';

Uses : 'uses:';

With : 'with:';

Env : 'env:';

Run : 'run:';

True : 'true';

If : 'if:';

On : 'on:';

HyphenMinusSpace : '- ';

RULE_TRIGGER_WORDS : ('push'|'pull_request'|'check_suite'|'create'|'delete'|'deployment'|'deployment_status'|'discussion'|'fork'|'gollum'|'issue_comment'|'release'|'schedule'|'issues'|'workflow_dispatch'|'merge_group:'|'repository_dispatch');

RULE_NAME : ('Name:'|'name:'|'- name:'|'- name : '|'- id:');

RULE_TRIGGERS : RULE_TRIGGER_WORDS ':';

fragment RULE_HTTP : ('https:'|'http:');

fragment RULE_CHARACTERS : (';'|'+'|'!'|'&'|'('|')'|'='|'>'|'<'|','|'*'|'{'|'}'|'.'|'-'|'\\'|'/'|'%'|'$'|'@'|'['|']'|'_'|'"'|'\''|'A'..'Z'|'a'..'z');

RULE_ALPHANUMERICSTRING : ((RULE_HTTP|RULE_CHARACTERS|RULE_INT)+|'- cron '|'- cron'|'- master'|'- master '|'- main');

RULE_KEY : RULE_ALPHANUMERICSTRING ':';

RULE_NEWLINE : '\r'? '\n';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
