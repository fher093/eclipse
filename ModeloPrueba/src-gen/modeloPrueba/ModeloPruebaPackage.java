/**
 */
package modeloPrueba;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see modeloPrueba.ModeloPruebaFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloPruebaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeloPrueba";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modeloPrueba";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modeloPrueba";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloPruebaPackage eINSTANCE = modeloPrueba.impl.ModeloPruebaPackageImpl.init();

	/**
	 * The meta object id for the '{@link modeloPrueba.impl.RaizFDLLUImpl <em>Raiz FDLLU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloPrueba.impl.RaizFDLLUImpl
	 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getRaizFDLLU()
	 * @generated
	 */
	int RAIZ_FDLLU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contiene</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU__CONTIENE = 1;

	/**
	 * The feature id for the '<em><b>Contien</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU__CONTIEN = 2;

	/**
	 * The number of structural features of the '<em>Raiz FDLLU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Raiz FDLLU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloPrueba.impl.ArregloIntImpl <em>Arreglo Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloPrueba.impl.ArregloIntImpl
	 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getArregloInt()
	 * @generated
	 */
	int ARREGLO_INT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_INT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_INT__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Arreglo Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_INT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arreglo Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_INT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloPrueba.impl.ArregloStringImpl <em>Arreglo String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloPrueba.impl.ArregloStringImpl
	 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getArregloString()
	 * @generated
	 */
	int ARREGLO_STRING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_STRING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_STRING__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Arreglo String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arreglo String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_STRING_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link modeloPrueba.RaizFDLLU <em>Raiz FDLLU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raiz FDLLU</em>'.
	 * @see modeloPrueba.RaizFDLLU
	 * @generated
	 */
	EClass getRaizFDLLU();

	/**
	 * Returns the meta object for the attribute '{@link modeloPrueba.RaizFDLLU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modeloPrueba.RaizFDLLU#getName()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EAttribute getRaizFDLLU_Name();

	/**
	 * Returns the meta object for the reference list '{@link modeloPrueba.RaizFDLLU#getContiene <em>Contiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contiene</em>'.
	 * @see modeloPrueba.RaizFDLLU#getContiene()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EReference getRaizFDLLU_Contiene();

	/**
	 * Returns the meta object for the reference list '{@link modeloPrueba.RaizFDLLU#getContien <em>Contien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contien</em>'.
	 * @see modeloPrueba.RaizFDLLU#getContien()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EReference getRaizFDLLU_Contien();

	/**
	 * Returns the meta object for class '{@link modeloPrueba.ArregloInt <em>Arreglo Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arreglo Int</em>'.
	 * @see modeloPrueba.ArregloInt
	 * @generated
	 */
	EClass getArregloInt();

	/**
	 * Returns the meta object for the attribute '{@link modeloPrueba.ArregloInt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modeloPrueba.ArregloInt#getName()
	 * @see #getArregloInt()
	 * @generated
	 */
	EAttribute getArregloInt_Name();

	/**
	 * Returns the meta object for the attribute '{@link modeloPrueba.ArregloInt#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see modeloPrueba.ArregloInt#getTipo()
	 * @see #getArregloInt()
	 * @generated
	 */
	EAttribute getArregloInt_Tipo();

	/**
	 * Returns the meta object for class '{@link modeloPrueba.ArregloString <em>Arreglo String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arreglo String</em>'.
	 * @see modeloPrueba.ArregloString
	 * @generated
	 */
	EClass getArregloString();

	/**
	 * Returns the meta object for the attribute '{@link modeloPrueba.ArregloString#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modeloPrueba.ArregloString#getName()
	 * @see #getArregloString()
	 * @generated
	 */
	EAttribute getArregloString_Name();

	/**
	 * Returns the meta object for the attribute '{@link modeloPrueba.ArregloString#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see modeloPrueba.ArregloString#getTipo()
	 * @see #getArregloString()
	 * @generated
	 */
	EAttribute getArregloString_Tipo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloPruebaFactory getModeloPruebaFactory();

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
		 * The meta object literal for the '{@link modeloPrueba.impl.RaizFDLLUImpl <em>Raiz FDLLU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloPrueba.impl.RaizFDLLUImpl
		 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getRaizFDLLU()
		 * @generated
		 */
		EClass RAIZ_FDLLU = eINSTANCE.getRaizFDLLU();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAIZ_FDLLU__NAME = eINSTANCE.getRaizFDLLU_Name();

		/**
		 * The meta object literal for the '<em><b>Contiene</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIZ_FDLLU__CONTIENE = eINSTANCE.getRaizFDLLU_Contiene();

		/**
		 * The meta object literal for the '<em><b>Contien</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIZ_FDLLU__CONTIEN = eINSTANCE.getRaizFDLLU_Contien();

		/**
		 * The meta object literal for the '{@link modeloPrueba.impl.ArregloIntImpl <em>Arreglo Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloPrueba.impl.ArregloIntImpl
		 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getArregloInt()
		 * @generated
		 */
		EClass ARREGLO_INT = eINSTANCE.getArregloInt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_INT__NAME = eINSTANCE.getArregloInt_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_INT__TIPO = eINSTANCE.getArregloInt_Tipo();

		/**
		 * The meta object literal for the '{@link modeloPrueba.impl.ArregloStringImpl <em>Arreglo String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloPrueba.impl.ArregloStringImpl
		 * @see modeloPrueba.impl.ModeloPruebaPackageImpl#getArregloString()
		 * @generated
		 */
		EClass ARREGLO_STRING = eINSTANCE.getArregloString();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_STRING__NAME = eINSTANCE.getArregloString_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_STRING__TIPO = eINSTANCE.getArregloString_Tipo();

	}

} //ModeloPruebaPackage
