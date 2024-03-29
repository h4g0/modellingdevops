/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl10.myDsl.IFThenElseSteps_alt1;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;
import org.xtext.example.mydsl10.myDsl.StepOptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IF Then Else Steps alt1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.IFThenElseSteps_alt1Impl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.IFThenElseSteps_alt1Impl#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.IFThenElseSteps_alt1Impl#getElsef <em>Elsef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IFThenElseSteps_alt1Impl extends MinimalEObjectImpl.Container implements IFThenElseSteps_alt1
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected EList<StepOptions> if_;

  /**
   * The cached value of the '{@link #getElsef() <em>Elsef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsef()
   * @generated
   * @ordered
   */
  protected EList<StepOptions> elsef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IFThenElseSteps_alt1Impl()
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
    return MyDslPackage.Literals.IF_THEN_ELSE_STEPS_ALT1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StepOptions> getIf()
  {
    if (if_ == null)
    {
      if_ = new EObjectContainmentEList<StepOptions>(StepOptions.class, this, MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF);
    }
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StepOptions> getElsef()
  {
    if (elsef == null)
    {
      elsef = new EObjectContainmentEList<StepOptions>(StepOptions.class, this, MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF);
    }
    return elsef;
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
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF:
        return ((InternalEList<?>)getIf()).basicRemove(otherEnd, msgs);
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF:
        return ((InternalEList<?>)getElsef()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__CONDITION:
        return getCondition();
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF:
        return getIf();
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF:
        return getElsef();
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
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__CONDITION:
        setCondition((String)newValue);
        return;
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF:
        getIf().clear();
        getIf().addAll((Collection<? extends StepOptions>)newValue);
        return;
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF:
        getElsef().clear();
        getElsef().addAll((Collection<? extends StepOptions>)newValue);
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
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF:
        getIf().clear();
        return;
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF:
        getElsef().clear();
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
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__IF:
        return if_ != null && !if_.isEmpty();
      case MyDslPackage.IF_THEN_ELSE_STEPS_ALT1__ELSEF:
        return elsef != null && !elsef.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (Condition: ");
    result.append(condition);
    result.append(')');
    return result.toString();
  }

} //IFThenElseSteps_alt1Impl
