/**
 */
package pruebaModelo;

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
 * @see pruebaModelo.PruebaModeloFactory
 * @model kind="package"
 * @generated
 */
public interface PruebaModeloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pruebaModelo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pruebaModelo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pruebaModelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PruebaModeloPackage eINSTANCE = pruebaModelo.impl.PruebaModeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link pruebaModelo.impl.RaizFDLLUImpl <em>Raiz FDLLU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pruebaModelo.impl.RaizFDLLUImpl
	 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getRaizFDLLU()
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
	 * The feature id for the '<em><b>Arregloint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU__ARREGLOINT = 1;

	/**
	 * The feature id for the '<em><b>Arreglostring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIZ_FDLLU__ARREGLOSTRING = 2;

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
	 * The meta object id for the '{@link pruebaModelo.impl.ArregloIntImpl <em>Arreglo Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pruebaModelo.impl.ArregloIntImpl
	 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getArregloInt()
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
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_INT__VALORES = 1;

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
	 * The meta object id for the '{@link pruebaModelo.impl.ArregloStringImpl <em>Arreglo String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pruebaModelo.impl.ArregloStringImpl
	 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getArregloString()
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
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARREGLO_STRING__VALORES = 1;

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
	 * Returns the meta object for class '{@link pruebaModelo.RaizFDLLU <em>Raiz FDLLU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raiz FDLLU</em>'.
	 * @see pruebaModelo.RaizFDLLU
	 * @generated
	 */
	EClass getRaizFDLLU();

	/**
	 * Returns the meta object for the attribute '{@link pruebaModelo.RaizFDLLU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pruebaModelo.RaizFDLLU#getName()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EAttribute getRaizFDLLU_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pruebaModelo.RaizFDLLU#getArregloint <em>Arregloint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arregloint</em>'.
	 * @see pruebaModelo.RaizFDLLU#getArregloint()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EReference getRaizFDLLU_Arregloint();

	/**
	 * Returns the meta object for the containment reference list '{@link pruebaModelo.RaizFDLLU#getArreglostring <em>Arreglostring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arreglostring</em>'.
	 * @see pruebaModelo.RaizFDLLU#getArreglostring()
	 * @see #getRaizFDLLU()
	 * @generated
	 */
	EReference getRaizFDLLU_Arreglostring();

	/**
	 * Returns the meta object for class '{@link pruebaModelo.ArregloInt <em>Arreglo Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arreglo Int</em>'.
	 * @see pruebaModelo.ArregloInt
	 * @generated
	 */
	EClass getArregloInt();

	/**
	 * Returns the meta object for the attribute '{@link pruebaModelo.ArregloInt#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pruebaModelo.ArregloInt#getName()
	 * @see #getArregloInt()
	 * @generated
	 */
	EAttribute getArregloInt_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pruebaModelo.ArregloInt#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valores</em>'.
	 * @see pruebaModelo.ArregloInt#getValores()
	 * @see #getArregloInt()
	 * @generated
	 */
	EAttribute getArregloInt_Valores();

	/**
	 * Returns the meta object for class '{@link pruebaModelo.ArregloString <em>Arreglo String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arreglo String</em>'.
	 * @see pruebaModelo.ArregloString
	 * @generated
	 */
	EClass getArregloString();

	/**
	 * Returns the meta object for the attribute '{@link pruebaModelo.ArregloString#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pruebaModelo.ArregloString#getName()
	 * @see #getArregloString()
	 * @generated
	 */
	EAttribute getArregloString_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pruebaModelo.ArregloString#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valores</em>'.
	 * @see pruebaModelo.ArregloString#getValores()
	 * @see #getArregloString()
	 * @generated
	 */
	EAttribute getArregloString_Valores();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PruebaModeloFactory getPruebaModeloFactory();

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
		 * The meta object literal for the '{@link pruebaModelo.impl.RaizFDLLUImpl <em>Raiz FDLLU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pruebaModelo.impl.RaizFDLLUImpl
		 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getRaizFDLLU()
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
		 * The meta object literal for the '<em><b>Arregloint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIZ_FDLLU__ARREGLOINT = eINSTANCE.getRaizFDLLU_Arregloint();

		/**
		 * The meta object literal for the '<em><b>Arreglostring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAIZ_FDLLU__ARREGLOSTRING = eINSTANCE.getRaizFDLLU_Arreglostring();

		/**
		 * The meta object literal for the '{@link pruebaModelo.impl.ArregloIntImpl <em>Arreglo Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pruebaModelo.impl.ArregloIntImpl
		 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getArregloInt()
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
		 * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_INT__VALORES = eINSTANCE.getArregloInt_Valores();

		/**
		 * The meta object literal for the '{@link pruebaModelo.impl.ArregloStringImpl <em>Arreglo String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pruebaModelo.impl.ArregloStringImpl
		 * @see pruebaModelo.impl.PruebaModeloPackageImpl#getArregloString()
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
		 * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARREGLO_STRING__VALORES = eINSTANCE.getArregloString_Valores();

	}

} //PruebaModeloPackage
