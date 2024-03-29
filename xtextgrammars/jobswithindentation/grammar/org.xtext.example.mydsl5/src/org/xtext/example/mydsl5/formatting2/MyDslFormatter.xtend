/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl5.formatting2

import com.google.inject.Inject
import devops2.Job
import devops2.Pipeline
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl5.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(Pipeline pipeline, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (when : pipeline.when) {
			when.format
		}
		for (job : pipeline.job) {
			job.format
		}
	}

	def dispatch void format(Job job, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (command : job.command) {
			command.format
		}
		for (artifact : job.input) {
			artifact.format
		}
	}
	
	// TODO: implement for IfThenElse
}
