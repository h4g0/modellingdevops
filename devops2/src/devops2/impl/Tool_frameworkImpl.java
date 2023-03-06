/**
 */
package devops2.impl;

import devops2.Devops2Package;
import devops2.Tool_framework;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devops2.impl.Tool_frameworkImpl#getNametool <em>Nametool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tool_frameworkImpl extends MinimalEObjectImpl.Container implements Tool_framework {
	/**
	 * The default value of the '{@link #getNametool() <em>Nametool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNametool()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMETOOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNametool() <em>Nametool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNametool()
	 * @generated
	 * @ordered
	 */
	protected String nametool = NAMETOOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tool_frameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Devops2Package.Literals.TOOL_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNametool() {
		return nametool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNametool(String newNametool) {
		String oldNametool = nametool;
		nametool = newNametool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.TOOL_FRAMEWORK__NAMETOOL, oldNametool, nametool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Devops2Package.TOOL_FRAMEWORK__NAMETOOL:
				return getNametool();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Devops2Package.TOOL_FRAMEWORK__NAMETOOL:
				setNametool((String)newValue);
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
			case Devops2Package.TOOL_FRAMEWORK__NAMETOOL:
				setNametool(NAMETOOL_EDEFAULT);
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
			case Devops2Package.TOOL_FRAMEWORK__NAMETOOL:
				return NAMETOOL_EDEFAULT == null ? nametool != null : !NAMETOOL_EDEFAULT.equals(nametool);
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
		result.append(" (Nametool: ");
		result.append(nametool);
		result.append(')');
		return result.toString();
	}

} //Tool_frameworkImpl
