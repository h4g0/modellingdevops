/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl5.serializer;

import com.google.inject.Inject;
import devops2.Artifact;
import devops2.Command;
import devops2.Devops2Package;
import devops2.Environment;
import devops2.IfThenElse;
import devops2.Job;
import devops2.Pipeline;
import devops2.Tool_framework;
import devops2.When;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl5.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Devops2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Devops2Package.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case Devops2Package.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case Devops2Package.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case Devops2Package.IF_THEN_ELSE:
				sequence_IfThenElse(context, (IfThenElse) semanticObject); 
				return; 
			case Devops2Package.JOB:
				sequence_Job(context, (Job) semanticObject); 
				return; 
			case Devops2Package.PIPELINE:
				sequence_Pipeline(context, (Pipeline) semanticObject); 
				return; 
			case Devops2Package.TOOL_FRAMEWORK:
				sequence_Tool_framework(context, (Tool_framework) semanticObject); 
				return; 
			case Devops2Package.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     Name3=EString?
	 * </pre>
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (Description=EString Parameters=EString? tool=[Tool_framework|EString]?)
	 * </pre>
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (Key=EString? Value=EString?)
	 * </pre>
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     IfThenElse returns IfThenElse
	 *
	 * Constraint:
	 *     (
	 *         Condition=EString? 
	 *         (if+=Command if+=Command*)? 
	 *         (else+=Command else+=Command*)? 
	 *         (ifelse+=IfThenElse ifelse+=IfThenElse*)? 
	 *         (elseif+=IfThenElse elseif+=IfThenElse*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_IfThenElse(ISerializationContext context, IfThenElse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Job returns Job
	 *
	 * Constraint:
	 *     (
	 *         Allow_faillure?='Allow_faillure'? 
	 *         Name1=EString? 
	 *         (depends+=[Job|EString] depends+=[Job|EString]*)? 
	 *         (tool_framework_job+=[Tool_framework|EString] tool_framework_job+=[Tool_framework|EString]*)? 
	 *         (output+=[Artifact|EString] output+=[Artifact|EString]*)? 
	 *         (ifthenelse+=[IfThenElse|EString] ifthenelse+=[IfThenElse|EString]*)? 
	 *         (command+=Command command+=Command*)? 
	 *         (input+=Artifact input+=Artifact*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Job(ISerializationContext context, Job semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pipeline returns Pipeline
	 *
	 * Constraint:
	 *     (
	 *         Name0=EString? 
	 *         (pipeline_tool_framework+=[Tool_framework|EString] pipeline_tool_framework+=[Tool_framework|EString]*)? 
	 *         (pipeline_envirnonment+=[Environment|EString] pipeline_envirnonment+=[Environment|EString]*)? 
	 *         (when+=When when+=When*)? 
	 *         (job+=Job job+=Job*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Pipeline(ISerializationContext context, Pipeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Tool_framework returns Tool_framework
	 *
	 * Constraint:
	 *     Name5=EString?
	 * </pre>
	 */
	protected void sequence_Tool_framework(ISerializationContext context, Tool_framework semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     (Name4=EString Trigger=EString? Timer=EString?)
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}