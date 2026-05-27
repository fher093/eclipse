/**
 */
package ape4_B;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ape4_B.Principal#getName <em>Name</em>}</li>
 *   <li>{@link ape4_B.Principal#getPosee <em>Posee</em>}</li>
 * </ul>
 *
 * @see ape4_B.Ape4_BPackage#getPrincipal()
 * @model
 * @generated
 */
public interface Principal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ape4_B.Ape4_BPackage#getPrincipal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ape4_B.Principal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Posee</b></em>' containment reference list.
	 * The list contents are of type {@link ape4_B.Entidad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posee</em>' containment reference list.
	 * @see ape4_B.Ape4_BPackage#getPrincipal_Posee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entidad> getPosee();

} // Principal
