/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl10.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Pipeline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pipeline</em>'.
   * @generated
   */
  Pipeline createPipeline();

  /**
   * Returns a new object of class '<em>When</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When</em>'.
   * @generated
   */
  When createWhen();

  /**
   * Returns a new object of class '<em>Job</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Job</em>'.
   * @generated
   */
  Job createJob();

  /**
   * Returns a new object of class '<em>Tool framework</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tool framework</em>'.
   * @generated
   */
  Tool_framework createTool_framework();

  /**
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  Artifact createArtifact();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Then Else</em>'.
   * @generated
   */
  IfThenElse createIfThenElse();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
