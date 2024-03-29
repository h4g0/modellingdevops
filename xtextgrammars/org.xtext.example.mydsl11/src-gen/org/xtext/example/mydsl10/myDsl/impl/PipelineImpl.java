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

import org.xtext.example.mydsl10.myDsl.Environment;
import org.xtext.example.mydsl10.myDsl.JobIfThenElse;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;
import org.xtext.example.mydsl10.myDsl.Pipeline;
import org.xtext.example.mydsl10.myDsl.When;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl#getName0 <em>Name0</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl#getPipeline_envirnonment <em>Pipeline envirnonment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.PipelineImpl#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline
{
  /**
   * The default value of the '{@link #getName0() <em>Name0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName0()
   * @generated
   * @ordered
   */
  protected static final String NAME0_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName0() <em>Name0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName0()
   * @generated
   * @ordered
   */
  protected String name0 = NAME0_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected EList<When> when;

  /**
   * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected static final String TRIGGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected String trigger = TRIGGER_EDEFAULT;

  /**
   * The cached value of the '{@link #getPipeline_envirnonment() <em>Pipeline envirnonment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPipeline_envirnonment()
   * @generated
   * @ordered
   */
  protected EList<Environment> pipeline_envirnonment;

  /**
   * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJob()
   * @generated
   * @ordered
   */
  protected EList<JobIfThenElse> job;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PipelineImpl()
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
    return MyDslPackage.Literals.PIPELINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName0()
  {
    return name0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName0(String newName0)
  {
    String oldName0 = name0;
    name0 = newName0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PIPELINE__NAME0, oldName0, name0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<When> getWhen()
  {
    if (when == null)
    {
      when = new EObjectContainmentEList<When>(When.class, this, MyDslPackage.PIPELINE__WHEN);
    }
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTrigger(String newTrigger)
  {
    String oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PIPELINE__TRIGGER, oldTrigger, trigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Environment> getPipeline_envirnonment()
  {
    if (pipeline_envirnonment == null)
    {
      pipeline_envirnonment = new EObjectContainmentEList<Environment>(Environment.class, this, MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT);
    }
    return pipeline_envirnonment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JobIfThenElse> getJob()
  {
    if (job == null)
    {
      job = new EObjectContainmentEList<JobIfThenElse>(JobIfThenElse.class, this, MyDslPackage.PIPELINE__JOB);
    }
    return job;
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
      case MyDslPackage.PIPELINE__WHEN:
        return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
      case MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT:
        return ((InternalEList<?>)getPipeline_envirnonment()).basicRemove(otherEnd, msgs);
      case MyDslPackage.PIPELINE__JOB:
        return ((InternalEList<?>)getJob()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PIPELINE__NAME0:
        return getName0();
      case MyDslPackage.PIPELINE__WHEN:
        return getWhen();
      case MyDslPackage.PIPELINE__TRIGGER:
        return getTrigger();
      case MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT:
        return getPipeline_envirnonment();
      case MyDslPackage.PIPELINE__JOB:
        return getJob();
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
      case MyDslPackage.PIPELINE__NAME0:
        setName0((String)newValue);
        return;
      case MyDslPackage.PIPELINE__WHEN:
        getWhen().clear();
        getWhen().addAll((Collection<? extends When>)newValue);
        return;
      case MyDslPackage.PIPELINE__TRIGGER:
        setTrigger((String)newValue);
        return;
      case MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT:
        getPipeline_envirnonment().clear();
        getPipeline_envirnonment().addAll((Collection<? extends Environment>)newValue);
        return;
      case MyDslPackage.PIPELINE__JOB:
        getJob().clear();
        getJob().addAll((Collection<? extends JobIfThenElse>)newValue);
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
      case MyDslPackage.PIPELINE__NAME0:
        setName0(NAME0_EDEFAULT);
        return;
      case MyDslPackage.PIPELINE__WHEN:
        getWhen().clear();
        return;
      case MyDslPackage.PIPELINE__TRIGGER:
        setTrigger(TRIGGER_EDEFAULT);
        return;
      case MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT:
        getPipeline_envirnonment().clear();
        return;
      case MyDslPackage.PIPELINE__JOB:
        getJob().clear();
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
      case MyDslPackage.PIPELINE__NAME0:
        return NAME0_EDEFAULT == null ? name0 != null : !NAME0_EDEFAULT.equals(name0);
      case MyDslPackage.PIPELINE__WHEN:
        return when != null && !when.isEmpty();
      case MyDslPackage.PIPELINE__TRIGGER:
        return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
      case MyDslPackage.PIPELINE__PIPELINE_ENVIRNONMENT:
        return pipeline_envirnonment != null && !pipeline_envirnonment.isEmpty();
      case MyDslPackage.PIPELINE__JOB:
        return job != null && !job.isEmpty();
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
    result.append(" (Name0: ");
    result.append(name0);
    result.append(", Trigger: ");
    result.append(trigger);
    result.append(')');
    return result.toString();
  }

} //PipelineImpl
