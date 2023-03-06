/**
 */
package devops2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.Artifact#getNameartifact <em>Nameartifact</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {

	/**
	 * Returns the value of the '<em><b>Nameartifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameartifact</em>' attribute.
	 * @see #setNameartifact(String)
	 * @see devops2.Devops2Package#getArtifact_Nameartifact()
	 * @model
	 * @generated
	 */
	String getNameartifact();

	/**
	 * Sets the value of the '{@link devops2.Artifact#getNameartifact <em>Nameartifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameartifact</em>' attribute.
	 * @see #getNameartifact()
	 * @generated
	 */
	void setNameartifact(String value);
} // Artifact
