/**
 */
package testB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testB.TestBFactory
 * @model kind="package"
 * @generated
 */
public interface TestBPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testB";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/testB";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testB";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestBPackage eINSTANCE = testB.impl.TestBPackageImpl.init();

	/**
	 * The meta object id for the '{@link testB.impl.PrincipalImpl <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testB.impl.PrincipalImpl
	 * @see testB.impl.TestBPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Materia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__MATERIA = 1;

	/**
	 * The feature id for the '<em><b>Docente</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__DOCENTE = 2;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testB.impl.MateriaImpl <em>Materia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testB.impl.MateriaImpl
	 * @see testB.impl.TestBPackageImpl#getMateria()
	 * @generated
	 */
	int MATERIA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tarea</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__TAREA = 1;

	/**
	 * The feature id for the '<em><b>Dictada</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA__DICTADA = 2;

	/**
	 * The number of structural features of the '<em>Materia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Materia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testB.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testB.impl.TareaImpl
	 * @see testB.impl.TestBPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__TIPO_C = 1;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testB.impl.DocenteImpl <em>Docente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testB.impl.DocenteImpl
	 * @see testB.impl.TestBPackageImpl#getDocente()
	 * @generated
	 */
	int DOCENTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCENTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dicta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCENTE__DICTA = 1;

	/**
	 * The number of structural features of the '<em>Docente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCENTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Docente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCENTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testB.TipoCalificacion <em>Tipo Calificacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testB.TipoCalificacion
	 * @see testB.impl.TestBPackageImpl#getTipoCalificacion()
	 * @generated
	 */
	int TIPO_CALIFICACION = 4;

	/**
	 * Returns the meta object for class '{@link testB.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see testB.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the attribute '{@link testB.Principal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testB.Principal#getName()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link testB.Principal#getMateria <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materia</em>'.
	 * @see testB.Principal#getMateria()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Materia();

	/**
	 * Returns the meta object for the containment reference list '{@link testB.Principal#getDocente <em>Docente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docente</em>'.
	 * @see testB.Principal#getDocente()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Docente();

	/**
	 * Returns the meta object for class '{@link testB.Materia <em>Materia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Materia</em>'.
	 * @see testB.Materia
	 * @generated
	 */
	EClass getMateria();

	/**
	 * Returns the meta object for the attribute '{@link testB.Materia#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testB.Materia#getName()
	 * @see #getMateria()
	 * @generated
	 */
	EAttribute getMateria_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link testB.Materia#getTarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tarea</em>'.
	 * @see testB.Materia#getTarea()
	 * @see #getMateria()
	 * @generated
	 */
	EReference getMateria_Tarea();

	/**
	 * Returns the meta object for the reference '{@link testB.Materia#getDictada <em>Dictada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dictada</em>'.
	 * @see testB.Materia#getDictada()
	 * @see #getMateria()
	 * @generated
	 */
	EReference getMateria_Dictada();

	/**
	 * Returns the meta object for class '{@link testB.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see testB.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link testB.Tarea#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testB.Tarea#getName()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Name();

	/**
	 * Returns the meta object for the attribute '{@link testB.Tarea#getTipoC <em>Tipo C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo C</em>'.
	 * @see testB.Tarea#getTipoC()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_TipoC();

	/**
	 * Returns the meta object for class '{@link testB.Docente <em>Docente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docente</em>'.
	 * @see testB.Docente
	 * @generated
	 */
	EClass getDocente();

	/**
	 * Returns the meta object for the attribute '{@link testB.Docente#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testB.Docente#getName()
	 * @see #getDocente()
	 * @generated
	 */
	EAttribute getDocente_Name();

	/**
	 * Returns the meta object for the reference list '{@link testB.Docente#getDicta <em>Dicta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dicta</em>'.
	 * @see testB.Docente#getDicta()
	 * @see #getDocente()
	 * @generated
	 */
	EReference getDocente_Dicta();

	/**
	 * Returns the meta object for enum '{@link testB.TipoCalificacion <em>Tipo Calificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Calificacion</em>'.
	 * @see testB.TipoCalificacion
	 * @generated
	 */
	EEnum getTipoCalificacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestBFactory getTestBFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testB.impl.PrincipalImpl <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testB.impl.PrincipalImpl
		 * @see testB.impl.TestBPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__NAME = eINSTANCE.getPrincipal_Name();

		/**
		 * The meta object literal for the '<em><b>Materia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__MATERIA = eINSTANCE.getPrincipal_Materia();

		/**
		 * The meta object literal for the '<em><b>Docente</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__DOCENTE = eINSTANCE.getPrincipal_Docente();

		/**
		 * The meta object literal for the '{@link testB.impl.MateriaImpl <em>Materia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testB.impl.MateriaImpl
		 * @see testB.impl.TestBPackageImpl#getMateria()
		 * @generated
		 */
		EClass MATERIA = eINSTANCE.getMateria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIA__NAME = eINSTANCE.getMateria_Name();

		/**
		 * The meta object literal for the '<em><b>Tarea</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIA__TAREA = eINSTANCE.getMateria_Tarea();

		/**
		 * The meta object literal for the '<em><b>Dictada</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIA__DICTADA = eINSTANCE.getMateria_Dictada();

		/**
		 * The meta object literal for the '{@link testB.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testB.impl.TareaImpl
		 * @see testB.impl.TestBPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NAME = eINSTANCE.getTarea_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__TIPO_C = eINSTANCE.getTarea_TipoC();

		/**
		 * The meta object literal for the '{@link testB.impl.DocenteImpl <em>Docente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testB.impl.DocenteImpl
		 * @see testB.impl.TestBPackageImpl#getDocente()
		 * @generated
		 */
		EClass DOCENTE = eINSTANCE.getDocente();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCENTE__NAME = eINSTANCE.getDocente_Name();

		/**
		 * The meta object literal for the '<em><b>Dicta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCENTE__DICTA = eINSTANCE.getDocente_Dicta();

		/**
		 * The meta object literal for the '{@link testB.TipoCalificacion <em>Tipo Calificacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testB.TipoCalificacion
		 * @see testB.impl.TestBPackageImpl#getTipoCalificacion()
		 * @generated
		 */
		EEnum TIPO_CALIFICACION = eINSTANCE.getTipoCalificacion();

	}

} //TestBPackage
