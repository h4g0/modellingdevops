/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Job#getStep <em>Step</em>}</li>
 *   <li>{@link devops2.Job#getName1 <em>Name1</em>}</li>
 *   <li>{@link devops2.Job#getUses <em>Uses</em>}</li>
 *   <li>{@link devops2.Job#getTool_framework_job <em>Tool framework job</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see devops2.Devops2Package#getJob_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name1</em>' attribute.
	 * @see #setName1(String)
	 * @see devops2.Devops2Package#getJob_Name1()
	 * @model
	 * @generated
	 */
	String getName1();

	/**
	 * Sets the value of the '{@link devops2.Job#getName1 <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name1</em>' attribute.
	 * @see #getName1()
	 * @generated
	 */
	void setName1(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link devops2.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Uses()
	 * @model
	 * @generated
	 */
	EList<Job> getUses();

	/**
	 * Returns the value of the '<em><b>Tool framework job</b></em>' reference list.
	 * The list contents are of type {@link devops2.Tool_framework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool framework job</em>' reference list.
	 * @see devops2.Devops2Package#getJob_Tool_framework_job()
	 * @model
	 * @generated
	 */
	EList<Tool_framework> getTool_framework_job();
} // Job
