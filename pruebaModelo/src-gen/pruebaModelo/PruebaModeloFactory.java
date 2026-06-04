/**
 */
package pruebaModelo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pruebaModelo.PruebaModeloPackage
 * @generated
 */
public interface PruebaModeloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PruebaModeloFactory eINSTANCE = pruebaModelo.impl.PruebaModeloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Raiz FDLLU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raiz FDLLU</em>'.
	 * @generated
	 */
	RaizFDLLU createRaizFDLLU();

	/**
	 * Returns a new object of class '<em>Arreglo Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arreglo Int</em>'.
	 * @generated
	 */
	ArregloInt createArregloInt();

	/**
	 * Returns a new object of class '<em>Arreglo String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arreglo String</em>'.
	 * @generated
	 */
	ArregloString createArregloString();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PruebaModeloPackage getPruebaModeloPackage();

} //PruebaModeloFactory
