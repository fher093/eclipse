/**
 */
package testB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testB.Docente#getName <em>Name</em>}</li>
 *   <li>{@link testB.Docente#getDicta <em>Dicta</em>}</li>
 * </ul>
 *
 * @see testB.TestBPackage#getDocente()
 * @model
 * @generated
 */
public interface Docente extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testB.TestBPackage#getDocente_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testB.Docente#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dicta</b></em>' reference list.
	 * The list contents are of type {@link testB.Materia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dicta</em>' reference list.
	 * @see testB.TestBPackage#getDocente_Dicta()
	 * @model required="true" upper="3"
	 * @generated
	 */
	EList<Materia> getDicta();

} // Docente
