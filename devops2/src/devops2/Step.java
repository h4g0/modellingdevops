/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Step#getCommand <em>Command</em>}</li>
 *   <li>{@link devops2.Step#getStep_parameter <em>Step parameter</em>}</li>
 *   <li>{@link devops2.Step#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link devops2.Step#getTool_framework <em>Tool framework</em>}</li>
 *   <li>{@link devops2.Step#getNamestep <em>Namestep</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see devops2.Devops2Package#getStep_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommand();

	/**
	 * Returns the value of the '<em><b>Step parameter</b></em>' reference list.
	 * The list contents are of type {@link devops2.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step parameter</em>' reference list.
	 * @see devops2.Devops2Package#getStep_Step_parameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getStep_parameter();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference list.
	 * The list contents are of type {@link devops2.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference list.
	 * @see devops2.Devops2Package#getStep_Artifact()
	 * @model
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Tool framework</b></em>' reference list.
	 * The list contents are of type {@link devops2.Tool_framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework</em>' reference list.
	 * @see devops2.Devops2Package#getStep_Tool_framework()
	 * @model
	 * @generated
	 */
	EList<Tool_framework> getTool_framework();

	/**
	 * Returns the value of the '<em><b>Namestep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namestep</em>' attribute.
	 * @see #setNamestep(String)
	 * @see devops2.Devops2Package#getStep_Namestep()
	 * @model
	 * @generated
	 */
	String getNamestep();

	/**
	 * Sets the value of the '{@link devops2.Step#getNamestep <em>Namestep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namestep</em>' attribute.
	 * @see #getNamestep()
	 * @generated
	 */
	void setNamestep(String value);

} // Step
