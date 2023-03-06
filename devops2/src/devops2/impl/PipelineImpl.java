/**
 */
package devops2.impl;

import devops2.Devops2Package;
import devops2.Job;
import devops2.Pipeline;

import devops2.When;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devops2.impl.PipelineImpl#getWhen <em>When</em>}</li>
 *   <li>{@link devops2.impl.PipelineImpl#getJob <em>Job</em>}</li>
 *   <li>{@link devops2.impl.PipelineImpl#getNamepipeline <em>Namepipeline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends MinimalEObjectImpl.Container implements Pipeline {
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
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * The default value of the '{@link #getNamepipeline() <em>Namepipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamepipeline()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEPIPELINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamepipeline() <em>Namepipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamepipeline()
	 * @generated
	 * @ordered
	 */
	protected String namepipeline = NAMEPIPELINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Devops2Package.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, Devops2Package.PIPELINE__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamepipeline() {
		return namepipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamepipeline(String newNamepipeline) {
		String oldNamepipeline = namepipeline;
		namepipeline = newNamepipeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.PIPELINE__NAMEPIPELINE, oldNamepipeline, namepipeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Devops2Package.PIPELINE__WHEN:
				return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
			case Devops2Package.PIPELINE__JOB:
				return ((InternalEList<?>)getJob()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<When> getWhen() {
		if (when == null) {
			when = new EObjectContainmentEList<When>(When.class, this, Devops2Package.PIPELINE__WHEN);
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Devops2Package.PIPELINE__WHEN:
				return getWhen();
			case Devops2Package.PIPELINE__JOB:
				return getJob();
			case Devops2Package.PIPELINE__NAMEPIPELINE:
				return getNamepipeline();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Devops2Package.PIPELINE__WHEN:
				getWhen().clear();
				getWhen().addAll((Collection<? extends When>)newValue);
				return;
			case Devops2Package.PIPELINE__JOB:
				getJob().clear();
				getJob().addAll((Collection<? extends Job>)newValue);
				return;
			case Devops2Package.PIPELINE__NAMEPIPELINE:
				setNamepipeline((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Devops2Package.PIPELINE__WHEN:
				getWhen().clear();
				return;
			case Devops2Package.PIPELINE__JOB:
				getJob().clear();
				return;
			case Devops2Package.PIPELINE__NAMEPIPELINE:
				setNamepipeline(NAMEPIPELINE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Devops2Package.PIPELINE__WHEN:
				return when != null && !when.isEmpty();
			case Devops2Package.PIPELINE__JOB:
				return job != null && !job.isEmpty();
			case Devops2Package.PIPELINE__NAMEPIPELINE:
				return NAMEPIPELINE_EDEFAULT == null ? namepipeline != null : !NAMEPIPELINE_EDEFAULT.equals(namepipeline);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Namepipeline: ");
		result.append(namepipeline);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
