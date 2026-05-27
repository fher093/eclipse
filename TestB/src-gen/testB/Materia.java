/**
 */
package testB;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testB.Materia#getName <em>Name</em>}</li>
 *   <li>{@link testB.Materia#getTarea <em>Tarea</em>}</li>
 *   <li>{@link testB.Materia#getDictada <em>Dictada</em>}</li>
 * </ul>
 *
 * @see testB.TestBPackage#getMateria()
 * @model
 * @generated
 */
public interface Materia extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testB.TestBPackage#getMateria_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testB.Materia#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tarea</b></em>' containment reference list.
	 * The list contents are of type {@link testB.Tarea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarea</em>' containment reference list.
	 * @see testB.TestBPackage#getMateria_Tarea()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tarea> getTarea();

	/**
	 * Returns the value of the '<em><b>Dictada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictada</em>' reference.
	 * @see #setDictada(Docente)
	 * @see testB.TestBPackage#getMateria_Dictada()
	 * @model required="true"
	 * @generated
	 */
	Docente getDictada();

	/**
	 * Sets the value of the '{@link testB.Materia#getDictada <em>Dictada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictada</em>' reference.
	 * @see #getDictada()
	 * @generated
	 */
	void setDictada(Docente value);

} // Materia
