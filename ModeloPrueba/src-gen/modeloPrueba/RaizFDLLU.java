/**
 */
package modeloPrueba;

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
 *   <li>{@link modeloPrueba.RaizFDLLU#getName <em>Name</em>}</li>
 *   <li>{@link modeloPrueba.RaizFDLLU#getContiene <em>Contiene</em>}</li>
 *   <li>{@link modeloPrueba.RaizFDLLU#getContien <em>Contien</em>}</li>
 * </ul>
 *
 * @see modeloPrueba.ModeloPruebaPackage#getRaizFDLLU()
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
	 * @see modeloPrueba.ModeloPruebaPackage#getRaizFDLLU_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modeloPrueba.RaizFDLLU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contiene</b></em>' reference list.
	 * The list contents are of type {@link modeloPrueba.ArregloInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contiene</em>' reference list.
	 * @see modeloPrueba.ModeloPruebaPackage#getRaizFDLLU_Contiene()
	 * @model
	 * @generated
	 */
	EList<ArregloInt> getContiene();

	/**
	 * Returns the value of the '<em><b>Contien</b></em>' reference list.
	 * The list contents are of type {@link modeloPrueba.ArregloString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contien</em>' reference list.
	 * @see modeloPrueba.ModeloPruebaPackage#getRaizFDLLU_Contien()
	 * @model
	 * @generated
	 */
	EList<ArregloString> getContien();

} // RaizFDLLU
