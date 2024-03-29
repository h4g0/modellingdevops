/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl10.myDsl.Command2Uses;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;
import org.xtext.example.mydsl10.myDsl.Tool_framework;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command2 Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.Command2UsesImpl#getTool <em>Tool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Command2UsesImpl extends MinimalEObjectImpl.Container implements Command2Uses
{
  /**
   * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTool()
   * @generated
   * @ordered
   */
  protected EList<Tool_framework> tool;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Command2UsesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COMMAND2_USES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tool_framework> getTool()
  {
    if (tool == null)
    {
      tool = new EObjectContainmentEList<Tool_framework>(Tool_framework.class, this, MyDslPackage.COMMAND2_USES__TOOL);
    }
    return tool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND2_USES__TOOL:
        return ((InternalEList<?>)getTool()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND2_USES__TOOL:
        return getTool();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND2_USES__TOOL:
        getTool().clear();
        getTool().addAll((Collection<? extends Tool_framework>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND2_USES__TOOL:
        getTool().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND2_USES__TOOL:
        return tool != null && !tool.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Command2UsesImpl
