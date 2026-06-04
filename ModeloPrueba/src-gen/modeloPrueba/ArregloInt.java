/**
 */
package modeloPrueba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arreglo Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloPrueba.ArregloInt#getName <em>Name</em>}</li>
 *   <li>{@link modeloPrueba.ArregloInt#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see modeloPrueba.ModeloPruebaPackage#getArregloInt()
 * @model
 * @generated
 */
public interface ArregloInt extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modeloPrueba.ModeloPruebaPackage#getArregloInt_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modeloPrueba.ArregloInt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(int)
	 * @see modeloPrueba.ModeloPruebaPackage#getArregloInt_Tipo()
	 * @model
	 * @generated
	 */
	int getTipo();

	/**
	 * Sets the value of the '{@link modeloPrueba.ArregloInt#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(int value);

} // ArregloInt
