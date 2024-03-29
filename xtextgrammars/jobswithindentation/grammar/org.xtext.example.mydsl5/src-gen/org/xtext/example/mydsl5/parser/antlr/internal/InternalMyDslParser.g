/*
 * generated by Xtext 2.27.0
 */
parser grammar InternalMyDslParser;

options {
	tokenVocab=InternalMyDslLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package org.xtext.example.mydsl5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl5.services.MyDslGrammarAccess;

}

@members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Pipeline";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePipeline
entryRulePipeline returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPipelineRule()); }
	iv_rulePipeline=rulePipeline
	{ $current=$iv_rulePipeline.current; }
	EOF;

// Rule Pipeline
rulePipeline returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPipelineAccess().getPipelineAction_0(),
					$current);
			}
		)
		(
			otherlv_1=Name
			{
				newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getNameKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getName0EStringParserRuleCall_1_1_0());
					}
					lv_Name0_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPipelineRule());
						}
						set(
							$current,
							"Name0",
							lv_Name0_2_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_3=Pipeline_tool_framework
			{
				newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getPipeline_tool_frameworkKeyword_2_0());
			}
			otherlv_4=LeftParenthesis
			{
				newLeafNode(otherlv_4, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_2_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPipelineRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_frameworkCrossReference_2_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=Comma
				{
					newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getCommaKeyword_2_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPipelineRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_tool_frameworkTool_frameworkCrossReference_2_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=RightParenthesis
			{
				newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_2_4());
			}
		)?
		(
			otherlv_9=Pipeline_envirnonment
			{
				newLeafNode(otherlv_9, grammarAccess.getPipelineAccess().getPipeline_envirnonmentKeyword_3_0());
			}
			otherlv_10=LeftParenthesis
			{
				newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPipelineRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentCrossReference_3_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=Comma
				{
					newLeafNode(otherlv_12, grammarAccess.getPipelineAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getPipelineRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getPipelineAccess().getPipeline_envirnonmentEnvironmentCrossReference_3_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14=RightParenthesis
			{
				newLeafNode(otherlv_14, grammarAccess.getPipelineAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		(
			otherlv_15=When_1
			{
				newLeafNode(otherlv_15, grammarAccess.getPipelineAccess().getWhenKeyword_4_0());
			}
			otherlv_16=LeftCurlyBracket
			{
				newLeafNode(otherlv_16, grammarAccess.getPipelineAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_2_0());
					}
					lv_when_17_0=ruleWhen
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPipelineRule());
						}
						add(
							$current,
							"when",
							lv_when_17_0,
							"org.xtext.example.mydsl5.MyDsl.When");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=Comma
				{
					newLeafNode(otherlv_18, grammarAccess.getPipelineAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPipelineAccess().getWhenWhenParserRuleCall_4_3_1_0());
						}
						lv_when_19_0=ruleWhen
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPipelineRule());
							}
							add(
								$current,
								"when",
								lv_when_19_0,
								"org.xtext.example.mydsl5.MyDsl.When");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_20=RightCurlyBracket
			{
				newLeafNode(otherlv_20, grammarAccess.getPipelineAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_21=Jobs
			{
				newLeafNode(otherlv_21, grammarAccess.getPipelineAccess().getJobsKeyword_5_0());
			}
			this_BEGIN_22=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_22, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_2_0());
					}
					lv_job_23_0=ruleJob
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPipelineRule());
						}
						add(
							$current,
							"job",
							lv_job_23_0,
							"org.xtext.example.mydsl5.MyDsl.Job");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPipelineAccess().getJobJobParserRuleCall_5_3_0());
					}
					lv_job_24_0=ruleJob
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPipelineRule());
						}
						add(
							$current,
							"job",
							lv_job_24_0,
							"org.xtext.example.mydsl5.MyDsl.Job");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			this_END_25=RULE_END
			{
				newLeafNode(this_END_25, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_4());
			}
		)?
	)
;

// Entry rule entryRuleWhen
entryRuleWhen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhenRule()); }
	iv_ruleWhen=ruleWhen
	{ $current=$iv_ruleWhen.current; }
	EOF;

// Rule When
ruleWhen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWhenAccess().getWhenAction_0(),
					$current);
			}
		)
		otherlv_1=When
		{
			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhenAccess().getName4EStringParserRuleCall_2_0());
				}
				lv_Name4_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhenRule());
					}
					set(
						$current,
						"Name4",
						lv_Name4_2_0,
						"org.xtext.example.mydsl5.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=LeftCurlyBracket
		{
			newLeafNode(otherlv_3, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4=Trigger
			{
				newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getTriggerKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTriggerEStringParserRuleCall_4_1_0());
					}
					lv_Trigger_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"Trigger",
							lv_Trigger_5_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6=Timer
			{
				newLeafNode(otherlv_6, grammarAccess.getWhenAccess().getTimerKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTimerEStringParserRuleCall_5_1_0());
					}
					lv_Timer_7_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"Timer",
							lv_Timer_7_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8=RightCurlyBracket
		{
			newLeafNode(otherlv_8, grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleJob
entryRuleJob returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJobRule()); }
	iv_ruleJob=ruleJob
	{ $current=$iv_ruleJob.current; }
	EOF;

// Rule Job
ruleJob returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJobAccess().getJobAction_0(),
					$current);
			}
		)
		(
			(
				lv_Allow_faillure_1_0=Allow_faillure
				{
					newLeafNode(lv_Allow_faillure_1_0, grammarAccess.getJobAccess().getAllow_faillureAllow_faillureKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJobRule());
					}
					setWithLastConsumed($current, "Allow_faillure", lv_Allow_faillure_1_0 != null, "Allow_faillure");
				}
			)
		)?
		{
			newCompositeNode(grammarAccess.getJobAccess().getEStringParserRuleCall_2());
		}
		ruleEString
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_3=Colon
		{
			newLeafNode(otherlv_3, grammarAccess.getJobAccess().getColonKeyword_3());
		}
		this_BEGIN_4=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_4, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_4());
		}
		(
			otherlv_5=Name1
			{
				newLeafNode(otherlv_5, grammarAccess.getJobAccess().getName1Keyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getName1EStringParserRuleCall_5_1_0());
					}
					lv_Name1_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						set(
							$current,
							"Name1",
							lv_Name1_6_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7=Depends
			{
				newLeafNode(otherlv_7, grammarAccess.getJobAccess().getDependsKeyword_6_0());
			}
			otherlv_8=LeftParenthesis
			{
				newLeafNode(otherlv_8, grammarAccess.getJobAccess().getLeftParenthesisKeyword_6_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_6_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_10=Comma
				{
					newLeafNode(otherlv_10, grammarAccess.getJobAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getJobRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getJobAccess().getDependsJobCrossReference_6_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_12=RightParenthesis
			{
				newLeafNode(otherlv_12, grammarAccess.getJobAccess().getRightParenthesisKeyword_6_4());
			}
		)?
		(
			otherlv_13=Tool_framework_job
			{
				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getTool_framework_jobKeyword_7_0());
			}
			otherlv_14=LeftParenthesis
			{
				newLeafNode(otherlv_14, grammarAccess.getJobAccess().getLeftParenthesisKeyword_7_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_7_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_16=Comma
				{
					newLeafNode(otherlv_16, grammarAccess.getJobAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getJobRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getJobAccess().getTool_framework_jobTool_frameworkCrossReference_7_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_18=RightParenthesis
			{
				newLeafNode(otherlv_18, grammarAccess.getJobAccess().getRightParenthesisKeyword_7_4());
			}
		)?
		(
			otherlv_19=Output
			{
				newLeafNode(otherlv_19, grammarAccess.getJobAccess().getOutputKeyword_8_0());
			}
			otherlv_20=LeftParenthesis
			{
				newLeafNode(otherlv_20, grammarAccess.getJobAccess().getLeftParenthesisKeyword_8_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_8_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_22=Comma
				{
					newLeafNode(otherlv_22, grammarAccess.getJobAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getJobRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getJobAccess().getOutputArtifactCrossReference_8_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_24=RightParenthesis
			{
				newLeafNode(otherlv_24, grammarAccess.getJobAccess().getRightParenthesisKeyword_8_4());
			}
		)?
		(
			otherlv_25=Ifthenelse
			{
				newLeafNode(otherlv_25, grammarAccess.getJobAccess().getIfthenelseKeyword_9_0());
			}
			otherlv_26=LeftParenthesis
			{
				newLeafNode(otherlv_26, grammarAccess.getJobAccess().getLeftParenthesisKeyword_9_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJobRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_9_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=Comma
				{
					newLeafNode(otherlv_28, grammarAccess.getJobAccess().getCommaKeyword_9_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getJobRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getJobAccess().getIfthenelseIfThenElseCrossReference_9_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_30=RightParenthesis
			{
				newLeafNode(otherlv_30, grammarAccess.getJobAccess().getRightParenthesisKeyword_9_4());
			}
		)?
		(
			otherlv_31=Command_1
			{
				newLeafNode(otherlv_31, grammarAccess.getJobAccess().getCommandKeyword_10_0());
			}
			otherlv_32=LeftCurlyBracket
			{
				newLeafNode(otherlv_32, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_10_2_0());
					}
					lv_command_33_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						add(
							$current,
							"command",
							lv_command_33_0,
							"org.xtext.example.mydsl5.MyDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_34=Comma
				{
					newLeafNode(otherlv_34, grammarAccess.getJobAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getJobAccess().getCommandCommandParserRuleCall_10_3_1_0());
						}
						lv_command_35_0=ruleCommand
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJobRule());
							}
							add(
								$current,
								"command",
								lv_command_35_0,
								"org.xtext.example.mydsl5.MyDsl.Command");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_36=RightCurlyBracket
			{
				newLeafNode(otherlv_36, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		(
			otherlv_37=Input
			{
				newLeafNode(otherlv_37, grammarAccess.getJobAccess().getInputKeyword_11_0());
			}
			otherlv_38=LeftCurlyBracket
			{
				newLeafNode(otherlv_38, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_11_2_0());
					}
					lv_input_39_0=ruleArtifact
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getJobRule());
						}
						add(
							$current,
							"input",
							lv_input_39_0,
							"org.xtext.example.mydsl5.MyDsl.Artifact");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_40=Comma
				{
					newLeafNode(otherlv_40, grammarAccess.getJobAccess().getCommaKeyword_11_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getJobAccess().getInputArtifactParserRuleCall_11_3_1_0());
						}
						lv_input_41_0=ruleArtifact
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getJobRule());
							}
							add(
								$current,
								"input",
								lv_input_41_0,
								"org.xtext.example.mydsl5.MyDsl.Artifact");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_42=RightCurlyBracket
			{
				newLeafNode(otherlv_42, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_11_4());
			}
		)?
		this_END_43=RULE_END
		{
			newLeafNode(this_END_43, grammarAccess.getJobAccess().getENDTerminalRuleCall_12());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleArtifact
entryRuleArtifact returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArtifactRule()); }
	iv_ruleArtifact=ruleArtifact
	{ $current=$iv_ruleArtifact.current; }
	EOF;

// Rule Artifact
ruleArtifact returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getArtifactAccess().getArtifactAction_0(),
					$current);
			}
		)
		otherlv_1=Artifact
		{
			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
		}
		otherlv_2=LeftCurlyBracket
		{
			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3=Name3
			{
				newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getName3Keyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArtifactAccess().getName3EStringParserRuleCall_3_1_0());
					}
					lv_Name3_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArtifactRule());
						}
						set(
							$current,
							"Name3",
							lv_Name3_4_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5=RightCurlyBracket
		{
			newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCommandAccess().getCommandAction_0(),
					$current);
			}
		)
		otherlv_1=Command
		{
			newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getDescriptionEStringParserRuleCall_2_0());
				}
				lv_Description_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"Description",
						lv_Description_2_0,
						"org.xtext.example.mydsl5.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=LeftCurlyBracket
		{
			newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4=Parameters
			{
				newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getParametersKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandAccess().getParametersEStringParserRuleCall_4_1_0());
					}
					lv_Parameters_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandRule());
						}
						set(
							$current,
							"Parameters",
							lv_Parameters_5_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6=Tool
			{
				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getToolKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCommandRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getCommandAccess().getToolTool_frameworkCrossReference_5_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8=RightCurlyBracket
		{
			newLeafNode(otherlv_8, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleIfThenElse
entryRuleIfThenElse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfThenElseRule()); }
	iv_ruleIfThenElse=ruleIfThenElse
	{ $current=$iv_ruleIfThenElse.current; }
	EOF;

// Rule IfThenElse
ruleIfThenElse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIfThenElseAccess().getIfThenElseAction_0(),
					$current);
			}
		)
		otherlv_1=IfThenElse
		{
			newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_1());
		}
		otherlv_2=LeftCurlyBracket
		{
			newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3=Condition
			{
				newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getConditionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionEStringParserRuleCall_3_1_0());
					}
					lv_Condition_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
						}
						set(
							$current,
							"Condition",
							lv_Condition_4_0,
							"org.xtext.example.mydsl5.MyDsl.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5=If
			{
				newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getIfKeyword_4_0());
			}
			otherlv_6=LeftCurlyBracket
			{
				newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_4_2_0());
					}
					lv_if_7_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
						}
						add(
							$current,
							"if",
							lv_if_7_0,
							"org.xtext.example.mydsl5.MyDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=Comma
				{
					newLeafNode(otherlv_8, grammarAccess.getIfThenElseAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfCommandParserRuleCall_4_3_1_0());
						}
						lv_if_9_0=ruleCommand
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
							}
							add(
								$current,
								"if",
								lv_if_9_0,
								"org.xtext.example.mydsl5.MyDsl.Command");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10=RightCurlyBracket
			{
				newLeafNode(otherlv_10, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_11=Else
			{
				newLeafNode(otherlv_11, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
			}
			otherlv_12=LeftCurlyBracket
			{
				newLeafNode(otherlv_12, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_5_2_0());
					}
					lv_else_13_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
						}
						add(
							$current,
							"else",
							lv_else_13_0,
							"org.xtext.example.mydsl5.MyDsl.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=Comma
				{
					newLeafNode(otherlv_14, grammarAccess.getIfThenElseAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseCommandParserRuleCall_5_3_1_0());
						}
						lv_else_15_0=ruleCommand
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
							}
							add(
								$current,
								"else",
								lv_else_15_0,
								"org.xtext.example.mydsl5.MyDsl.Command");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16=RightCurlyBracket
			{
				newLeafNode(otherlv_16, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_17=Ifelse
			{
				newLeafNode(otherlv_17, grammarAccess.getIfThenElseAccess().getIfelseKeyword_6_0());
			}
			otherlv_18=LeftCurlyBracket
			{
				newLeafNode(otherlv_18, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_6_2_0());
					}
					lv_ifelse_19_0=ruleIfThenElse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
						}
						add(
							$current,
							"ifelse",
							lv_ifelse_19_0,
							"org.xtext.example.mydsl5.MyDsl.IfThenElse");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=Comma
				{
					newLeafNode(otherlv_20, grammarAccess.getIfThenElseAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfThenElseAccess().getIfelseIfThenElseParserRuleCall_6_3_1_0());
						}
						lv_ifelse_21_0=ruleIfThenElse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
							}
							add(
								$current,
								"ifelse",
								lv_ifelse_21_0,
								"org.xtext.example.mydsl5.MyDsl.IfThenElse");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_22=RightCurlyBracket
			{
				newLeafNode(otherlv_22, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		(
			otherlv_23=Elseif
			{
				newLeafNode(otherlv_23, grammarAccess.getIfThenElseAccess().getElseifKeyword_7_0());
			}
			otherlv_24=LeftCurlyBracket
			{
				newLeafNode(otherlv_24, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_7_2_0());
					}
					lv_elseif_25_0=ruleIfThenElse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
						}
						add(
							$current,
							"elseif",
							lv_elseif_25_0,
							"org.xtext.example.mydsl5.MyDsl.IfThenElse");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_26=Comma
				{
					newLeafNode(otherlv_26, grammarAccess.getIfThenElseAccess().getCommaKeyword_7_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIfThenElseAccess().getElseifIfThenElseParserRuleCall_7_3_1_0());
						}
						lv_elseif_27_0=ruleIfThenElse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
							}
							add(
								$current,
								"elseif",
								lv_elseif_27_0,
								"org.xtext.example.mydsl5.MyDsl.IfThenElse");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_28=RightCurlyBracket
			{
				newLeafNode(otherlv_28, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_7_4());
			}
		)?
		otherlv_29=RightCurlyBracket
		{
			newLeafNode(otherlv_29, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_8());
		}
	)
;
