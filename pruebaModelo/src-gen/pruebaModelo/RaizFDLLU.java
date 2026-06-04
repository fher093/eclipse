/**
 */
package pruebaModelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raiz FDLLU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pruebaModelo.RaizFDLLU#getName <em>Name</em>}</li>
 *   <li>{@link pruebaModelo.RaizFDLLU#getArregloint <em>Arregloint</em>}</li>
 *   <li>{@link pruebaModelo.RaizFDLLU#getArreglostring <em>Arreglostring</em>}</li>
 * </ul>
 *
 * @see pruebaModelo.PruebaModeloPackage#getRaizFDLLU()
 * @model
 * @generated
 */
public interface RaizFDLLU extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pruebaModelo.PruebaModeloPackage#getRaizFDLLU_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pruebaModelo.RaizFDLLU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arregloint</b></em>' containment reference list.
	 * The list contents are of type {@link pruebaModelo.ArregloInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arregloint</em>' containment reference list.
	 * @see pruebaModelo.PruebaModeloPackage#getRaizFDLLU_Arregloint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArregloInt> getArregloint();

	/**
	 * Returns the value of the '<em><b>Arreglostring</b></em>' containment reference list.
	 * The list contents are of type {@link pruebaModelo.ArregloString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arreglostring</em>' containment reference list.
	 * @see pruebaModelo.PruebaModeloPackage#getRaizFDLLU_Arreglostring()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArregloString> getArreglostring();

} // RaizFDLLU
