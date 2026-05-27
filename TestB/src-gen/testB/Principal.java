/**
 */
package testB;

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
 *   <li>{@link testB.Principal#getName <em>Name</em>}</li>
 *   <li>{@link testB.Principal#getMateria <em>Materia</em>}</li>
 *   <li>{@link testB.Principal#getDocente <em>Docente</em>}</li>
 * </ul>
 *
 * @see testB.TestBPackage#getPrincipal()
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
	 * @see testB.TestBPackage#getPrincipal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testB.Principal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Materia</b></em>' containment reference list.
	 * The list contents are of type {@link testB.Materia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materia</em>' containment reference list.
	 * @see testB.TestBPackage#getPrincipal_Materia()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Materia> getMateria();

	/**
	 * Returns the value of the '<em><b>Docente</b></em>' containment reference list.
	 * The list contents are of type {@link testB.Docente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docente</em>' containment reference list.
	 * @see testB.TestBPackage#getPrincipal_Docente()
	 * @model containment="true"
	 * @generated
	 */
	EList<Docente> getDocente();

} // Principal
