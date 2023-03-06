/**
 */
package devops2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Tool_framework#getNametool <em>Nametool</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getTool_framework()
 * @model
 * @generated
 */
public interface Tool_framework extends EObject {

	/**
	 * Returns the value of the '<em><b>Nametool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nametool</em>' attribute.
	 * @see #setNametool(String)
	 * @see devops2.Devops2Package#getTool_framework_Nametool()
	 * @model
	 * @generated
	 */
	String getNametool();

	/**
	 * Sets the value of the '{@link devops2.Tool_framework#getNametool <em>Nametool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nametool</em>' attribute.
	 * @see #getNametool()
	 * @generated
	 */
	void setNametool(String value);
} // Tool_framework
