/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.When#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject
{
  /**
   * Returns the value of the '<em><b>Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' attribute.
   * @see #setTrigger(String)
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getWhen_Trigger()
   * @model
   * @generated
   */
  String getTrigger();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl10.myDsl.When#getTrigger <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' attribute.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(String value);

} // When
