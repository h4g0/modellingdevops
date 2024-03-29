/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.JobIfThenElse#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getJobIfThenElse()
 * @model
 * @generated
 */
public interface JobIfThenElse extends EObject
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference.
   * @see #setOption(EObject)
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getJobIfThenElse_Option()
   * @model containment="true"
   * @generated
   */
  EObject getOption();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl10.myDsl.JobIfThenElse#getOption <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' containment reference.
   * @see #getOption()
   * @generated
   */
  void setOption(EObject value);

} // JobIfThenElse
