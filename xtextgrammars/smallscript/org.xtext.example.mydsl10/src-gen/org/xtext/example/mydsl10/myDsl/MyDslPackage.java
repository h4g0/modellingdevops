/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl10.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl10/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl <em>Pipeline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.PipelineImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getPipeline()
   * @generated
   */
  int PIPELINE = 0;

  /**
   * The feature id for the '<em><b>Name0</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE__NAME0 = 0;

  /**
   * The feature id for the '<em><b>Pipeline tool framework</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE__PIPELINE_TOOL_FRAMEWORK = 1;

  /**
   * The feature id for the '<em><b>Pipeline envirnonment</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE__PIPELINE_ENVIRNONMENT = 2;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE__WHEN = 3;

  /**
   * The feature id for the '<em><b>Job</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE__JOB = 4;

  /**
   * The number of structural features of the '<em>Pipeline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIPELINE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.WhenImpl <em>When</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.WhenImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getWhen()
   * @generated
   */
  int WHEN = 1;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN__TRIGGER = 0;

  /**
   * The number of structural features of the '<em>When</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl <em>Job</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.JobImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getJob()
   * @generated
   */
  int JOB = 2;

  /**
   * The feature id for the '<em><b>Allow faillure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__ALLOW_FAILLURE = 0;

  /**
   * The feature id for the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__NAME1 = 1;

  /**
   * The feature id for the '<em><b>Depends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__DEPENDS = 2;

  /**
   * The feature id for the '<em><b>Tool framework job</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__TOOL_FRAMEWORK_JOB = 3;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__OUTPUT = 4;

  /**
   * The feature id for the '<em><b>Ifthenelse</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__IFTHENELSE = 5;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__COMMAND = 6;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB__INPUT = 7;

  /**
   * The number of structural features of the '<em>Job</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOB_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.Tool_frameworkImpl <em>Tool framework</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.Tool_frameworkImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getTool_framework()
   * @generated
   */
  int TOOL_FRAMEWORK = 3;

  /**
   * The feature id for the '<em><b>Name5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_FRAMEWORK__NAME5 = 0;

  /**
   * The number of structural features of the '<em>Tool framework</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOOL_FRAMEWORK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.EnvironmentImpl <em>Environment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.EnvironmentImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getEnvironment()
   * @generated
   */
  int ENVIRONMENT = 4;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Environment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.ArtifactImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 5;

  /**
   * The feature id for the '<em><b>Name3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME3 = 0;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.CommandImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 6;

  /**
   * The feature id for the '<em><b>Tool</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__TOOL = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Environment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ENVIRONMENT = 3;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl10.myDsl.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl10.myDsl.impl.IfThenElseImpl
   * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = 0;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__IF = 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = 2;

  /**
   * The feature id for the '<em><b>Ifelse</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__IFELSE = 3;

  /**
   * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSEIF = 4;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Pipeline <em>Pipeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pipeline</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline
   * @generated
   */
  EClass getPipeline();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Pipeline#getName0 <em>Name0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name0</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline#getName0()
   * @see #getPipeline()
   * @generated
   */
  EAttribute getPipeline_Name0();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Pipeline#getPipeline_tool_framework <em>Pipeline tool framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pipeline tool framework</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline#getPipeline_tool_framework()
   * @see #getPipeline()
   * @generated
   */
  EReference getPipeline_Pipeline_tool_framework();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Pipeline#getPipeline_envirnonment <em>Pipeline envirnonment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Pipeline envirnonment</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline#getPipeline_envirnonment()
   * @see #getPipeline()
   * @generated
   */
  EReference getPipeline_Pipeline_envirnonment();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Pipeline#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>When</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline#getWhen()
   * @see #getPipeline()
   * @generated
   */
  EReference getPipeline_When();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Pipeline#getJob <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Job</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Pipeline#getJob()
   * @see #getPipeline()
   * @generated
   */
  EReference getPipeline_Job();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.When <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When</em>'.
   * @see org.xtext.example.mydsl10.myDsl.When
   * @generated
   */
  EClass getWhen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.When#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trigger</em>'.
   * @see org.xtext.example.mydsl10.myDsl.When#getTrigger()
   * @see #getWhen()
   * @generated
   */
  EAttribute getWhen_Trigger();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Job <em>Job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Job</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job
   * @generated
   */
  EClass getJob();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Job#isAllow_faillure <em>Allow faillure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow faillure</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#isAllow_faillure()
   * @see #getJob()
   * @generated
   */
  EAttribute getJob_Allow_faillure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Job#getName1 <em>Name1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name1</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getName1()
   * @see #getJob()
   * @generated
   */
  EAttribute getJob_Name1();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getDepends()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Depends();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getTool_framework_job <em>Tool framework job</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tool framework job</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getTool_framework_job()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Tool_framework_job();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Output</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getOutput()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Output();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getIfthenelse <em>Ifthenelse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ifthenelse</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getIfthenelse()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Ifthenelse();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getCommand()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Command();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Job#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Job#getInput()
   * @see #getJob()
   * @generated
   */
  EReference getJob_Input();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Tool_framework <em>Tool framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tool framework</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Tool_framework
   * @generated
   */
  EClass getTool_framework();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Tool_framework#getName5 <em>Name5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name5</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Tool_framework#getName5()
   * @see #getTool_framework()
   * @generated
   */
  EAttribute getTool_framework_Name5();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Environment
   * @generated
   */
  EClass getEnvironment();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Environment#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Environment#getKey()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_Key();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Environment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Environment#getValue()
   * @see #getEnvironment()
   * @generated
   */
  EAttribute getEnvironment_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Artifact#getName3 <em>Name3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name3</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Artifact#getName3()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name3();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Command#getTool <em>Tool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tool</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Command#getTool()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Tool();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl10.myDsl.Command#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Command#getParameters()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Parameters();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.Command#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Command#getDescription()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.Command#getEnvironment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Environment</em>'.
   * @see org.xtext.example.mydsl10.myDsl.Command#getEnvironment()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Environment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl10.myDsl.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl10.myDsl.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EAttribute getIfThenElse_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.IfThenElse#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>If</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse#getIf()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_If();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.IfThenElse#getIfelse <em>Ifelse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifelse</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse#getIfelse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Ifelse();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl10.myDsl.IfThenElse#getElseif <em>Elseif</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseif</em>'.
   * @see org.xtext.example.mydsl10.myDsl.IfThenElse#getElseif()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Elseif();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl <em>Pipeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.PipelineImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getPipeline()
     * @generated
     */
    EClass PIPELINE = eINSTANCE.getPipeline();

    /**
     * The meta object literal for the '<em><b>Name0</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIPELINE__NAME0 = eINSTANCE.getPipeline_Name0();

    /**
     * The meta object literal for the '<em><b>Pipeline tool framework</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIPELINE__PIPELINE_TOOL_FRAMEWORK = eINSTANCE.getPipeline_Pipeline_tool_framework();

    /**
     * The meta object literal for the '<em><b>Pipeline envirnonment</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIPELINE__PIPELINE_ENVIRNONMENT = eINSTANCE.getPipeline_Pipeline_envirnonment();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIPELINE__WHEN = eINSTANCE.getPipeline_When();

    /**
     * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIPELINE__JOB = eINSTANCE.getPipeline_Job();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.WhenImpl <em>When</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.WhenImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getWhen()
     * @generated
     */
    EClass WHEN = eINSTANCE.getWhen();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHEN__TRIGGER = eINSTANCE.getWhen_Trigger();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl <em>Job</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.JobImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getJob()
     * @generated
     */
    EClass JOB = eINSTANCE.getJob();

    /**
     * The meta object literal for the '<em><b>Allow faillure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOB__ALLOW_FAILLURE = eINSTANCE.getJob_Allow_faillure();

    /**
     * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOB__NAME1 = eINSTANCE.getJob_Name1();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__DEPENDS = eINSTANCE.getJob_Depends();

    /**
     * The meta object literal for the '<em><b>Tool framework job</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__TOOL_FRAMEWORK_JOB = eINSTANCE.getJob_Tool_framework_job();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__OUTPUT = eINSTANCE.getJob_Output();

    /**
     * The meta object literal for the '<em><b>Ifthenelse</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__IFTHENELSE = eINSTANCE.getJob_Ifthenelse();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__COMMAND = eINSTANCE.getJob_Command();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOB__INPUT = eINSTANCE.getJob_Input();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.Tool_frameworkImpl <em>Tool framework</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.Tool_frameworkImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getTool_framework()
     * @generated
     */
    EClass TOOL_FRAMEWORK = eINSTANCE.getTool_framework();

    /**
     * The meta object literal for the '<em><b>Name5</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOOL_FRAMEWORK__NAME5 = eINSTANCE.getTool_framework_Name5();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.EnvironmentImpl <em>Environment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.EnvironmentImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getEnvironment()
     * @generated
     */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__KEY = eINSTANCE.getEnvironment_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT__VALUE = eINSTANCE.getEnvironment_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.ArtifactImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Name3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME3 = eINSTANCE.getArtifact_Name3();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.CommandImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__TOOL = eINSTANCE.getCommand_Tool();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

    /**
     * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ENVIRONMENT = eINSTANCE.getCommand_Environment();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl10.myDsl.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl10.myDsl.impl.IfThenElseImpl
     * @see org.xtext.example.mydsl10.myDsl.impl.MyDslPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__IF = eINSTANCE.getIfThenElse_If();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '<em><b>Ifelse</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__IFELSE = eINSTANCE.getIfThenElse_Ifelse();

    /**
     * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSEIF = eINSTANCE.getIfThenElse_Elseif();

  }

} //MyDslPackage
