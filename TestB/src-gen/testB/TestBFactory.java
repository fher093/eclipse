/**
 */
package testB;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testB.TestBPackage
 * @generated
 */
public interface TestBFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestBFactory eINSTANCE = testB.impl.TestBFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principal</em>'.
	 * @generated
	 */
	Principal createPrincipal();

	/**
	 * Returns a new object of class '<em>Materia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Materia</em>'.
	 * @generated
	 */
	Materia createMateria();

	/**
	 * Returns a new object of class '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tarea</em>'.
	 * @generated
	 */
	Tarea createTarea();

	/**
	 * Returns a new object of class '<em>Docente</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docente</em>'.
	 * @generated
	 */
	Docente createDocente();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestBPackage getTestBPackage();

} //TestBFactory
