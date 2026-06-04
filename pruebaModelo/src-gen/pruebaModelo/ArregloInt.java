/**
 */
package pruebaModelo;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link pruebaModelo.ArregloInt#getName <em>Name</em>}</li>
 *   <li>{@link pruebaModelo.ArregloInt#getValores <em>Valores</em>}</li>
 * </ul>
 *
 * @see pruebaModelo.PruebaModeloPackage#getArregloInt()
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
	 * @see pruebaModelo.PruebaModeloPackage#getArregloInt_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pruebaModelo.ArregloInt#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Valores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' attribute list.
	 * @see pruebaModelo.PruebaModeloPackage#getArregloInt_Valores()
	 * @model
	 * @generated
	 */
	EList<Integer> getValores();

} // ArregloInt
