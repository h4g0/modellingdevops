/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl5.formatting2;

import com.google.inject.Inject;
import devops2.Artifact;
import devops2.Command;
import devops2.Job;
import devops2.Pipeline;
import devops2.When;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl5.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;

  protected void _format(final Pipeline pipeline, @Extension final IFormattableDocument document) {
    EList<When> _when = pipeline.getWhen();
    for (final When when : _when) {
      document.<When>format(when);
    }
    EList<Job> _job = pipeline.getJob();
    for (final Job job : _job) {
      document.<Job>format(job);
    }
  }

  protected void _format(final Job job, @Extension final IFormattableDocument document) {
    EList<Command> _command = job.getCommand();
    for (final Command command : _command) {
      document.<Command>format(command);
    }
    EList<Artifact> _input = job.getInput();
    for (final Artifact artifact : _input) {
      document.<Artifact>format(artifact);
    }
  }

  public void format(final Object job, final IFormattableDocument document) {
    if (job instanceof XtextResource) {
      _format((XtextResource)job, document);
      return;
    } else if (job instanceof Job) {
      _format((Job)job, document);
      return;
    } else if (job instanceof Pipeline) {
      _format((Pipeline)job, document);
      return;
    } else if (job instanceof EObject) {
      _format((EObject)job, document);
      return;
    } else if (job == null) {
      _format((Void)null, document);
      return;
    } else if (job != null) {
      _format(job, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(job, document).toString());
    }
  }
}
