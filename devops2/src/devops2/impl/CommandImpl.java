/**
 */
package devops2.impl;

import devops2.Command;
import devops2.Devops2Package;
import devops2.Parameter;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devops2.impl.CommandImpl#getCommand_parameter <em>Command parameter</em>}</li>
 *   <li>{@link devops2.impl.CommandImpl#getInput <em>Input</em>}</li>
 *   <li>{@link devops2.impl.CommandImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link devops2.impl.CommandImpl#getNamecommand <em>Namecommand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The cached value of the '{@link #getCommand_parameter() <em>Command parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand_parameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> command_parameter;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;
	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamecommand() <em>Namecommand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamecommand()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMECOMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamecommand() <em>Namecommand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamecommand()
	 * @generated
	 * @ordered
	 */
	protected String namecommand = NAMECOMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Devops2Package.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getCommand_parameter() {
		if (command_parameter == null) {
			command_parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, Devops2Package.COMMAND__COMMAND_PARAMETER);
		}
		return command_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.COMMAND__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.COMMAND__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamecommand() {
		return namecommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamecommand(String newNamecommand) {
		String oldNamecommand = namecommand;
		namecommand = newNamecommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.COMMAND__NAMECOMMAND, oldNamecommand, namecommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Devops2Package.COMMAND__COMMAND_PARAMETER:
				return getCommand_parameter();
			case Devops2Package.COMMAND__INPUT:
				return getInput();
			case Devops2Package.COMMAND__PARAMETERS:
				return getParameters();
			case Devops2Package.COMMAND__NAMECOMMAND:
				return getNamecommand();
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
			case Devops2Package.COMMAND__COMMAND_PARAMETER:
				getCommand_parameter().clear();
				getCommand_parameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Devops2Package.COMMAND__INPUT:
				setInput((String)newValue);
				return;
			case Devops2Package.COMMAND__PARAMETERS:
				setParameters((String)newValue);
				return;
			case Devops2Package.COMMAND__NAMECOMMAND:
				setNamecommand((String)newValue);
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
			case Devops2Package.COMMAND__COMMAND_PARAMETER:
				getCommand_parameter().clear();
				return;
			case Devops2Package.COMMAND__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case Devops2Package.COMMAND__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case Devops2Package.COMMAND__NAMECOMMAND:
				setNamecommand(NAMECOMMAND_EDEFAULT);
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
			case Devops2Package.COMMAND__COMMAND_PARAMETER:
				return command_parameter != null && !command_parameter.isEmpty();
			case Devops2Package.COMMAND__INPUT:
				return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
			case Devops2Package.COMMAND__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case Devops2Package.COMMAND__NAMECOMMAND:
				return NAMECOMMAND_EDEFAULT == null ? namecommand != null : !NAMECOMMAND_EDEFAULT.equals(namecommand);
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
		result.append(" (input: ");
		result.append(input);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", Namecommand: ");
		result.append(namecommand);
		result.append(')');
		return result.toString();
	}

} //CommandImpl
