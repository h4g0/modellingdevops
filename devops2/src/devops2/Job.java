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
 *   <li>{@link devops2.Job#getNamejob <em>Namejob</em>}</li>
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
	 * Returns the value of the '<em><b>Namejob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namejob</em>' attribute.
	 * @see #setNamejob(String)
	 * @see devops2.Devops2Package#getJob_Namejob()
	 * @model
	 * @generated
	 */
	String getNamejob();

	/**
	 * Sets the value of the '{@link devops2.Job#getNamejob <em>Namejob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namejob</em>' attribute.
	 * @see #getNamejob()
	 * @generated
	 */
	void setNamejob(String value);
} // Job
