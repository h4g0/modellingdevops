/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Command#getCommand_parameter <em>Command parameter</em>}</li>
 *   <li>{@link devops2.Command#getInput <em>Input</em>}</li>
 *   <li>{@link devops2.Command#getParameters <em>Parameters</em>}</li>
 *   <li>{@link devops2.Command#getNamecommand <em>Namecommand</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Command parameter</b></em>' reference list.
	 * The list contents are of type {@link devops2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command parameter</em>' reference list.
	 * @see devops2.Devops2Package#getCommand_Command_parameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getCommand_parameter();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see devops2.Devops2Package#getCommand_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link devops2.Command#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see devops2.Devops2Package#getCommand_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link devops2.Command#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Namecommand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namecommand</em>' attribute.
	 * @see #setNamecommand(String)
	 * @see devops2.Devops2Package#getCommand_Namecommand()
	 * @model id="true"
	 * @generated
	 */
	String getNamecommand();

	/**
	 * Sets the value of the '{@link devops2.Command#getNamecommand <em>Namecommand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namecommand</em>' attribute.
	 * @see #getNamecommand()
	 * @generated
	 */
	void setNamecommand(String value);

} // Command
