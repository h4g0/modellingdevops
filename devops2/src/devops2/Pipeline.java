/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Pipeline#getWhen <em>When</em>}</li>
 *   <li>{@link devops2.Pipeline#getJob <em>Job</em>}</li>
 *   <li>{@link devops2.Pipeline#getNamepipeline <em>Namepipeline</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {

	/**
	 * Returns the value of the '<em><b>Job</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_Job()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJob();

	/**
	 * Returns the value of the '<em><b>Namepipeline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namepipeline</em>' attribute.
	 * @see #setNamepipeline(String)
	 * @see devops2.Devops2Package#getPipeline_Namepipeline()
	 * @model
	 * @generated
	 */
	String getNamepipeline();

	/**
	 * Sets the value of the '{@link devops2.Pipeline#getNamepipeline <em>Namepipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namepipeline</em>' attribute.
	 * @see #getNamepipeline()
	 * @generated
	 */
	void setNamepipeline(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.When}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see devops2.Devops2Package#getPipeline_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<When> getWhen();
} // Pipeline
