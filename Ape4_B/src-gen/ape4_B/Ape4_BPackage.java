/**
 */
package ape4_B;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ape4_B.Ape4_BFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Ape4_BPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ape4_B";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ape4_B";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ape4_B";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ape4_BPackage eINSTANCE = ape4_B.impl.Ape4_BPackageImpl.init();

	/**
	 * The meta object id for the '{@link ape4_B.impl.PrincipalImpl <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ape4_B.impl.PrincipalImpl
	 * @see ape4_B.impl.Ape4_BPackageImpl#getPrincipal()
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
	 * The feature id for the '<em><b>Posee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__POSEE = 1;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ape4_B.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ape4_B.impl.EntidadImpl
	 * @see ape4_B.impl.Ape4_BPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contiene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__CONTIENE = 1;

	/**
	 * The feature id for the '<em><b>Redirige</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__REDIRIGE = 2;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Nombre Corto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD___NOMBRE_CORTO__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ape4_B.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ape4_B.impl.AtributoImpl
	 * @see ape4_B.impl.Ape4_BPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__LONGITUD = 1;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO = 2;

	/**
	 * The feature id for the '<em><b>Requerido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__REQUERIDO = 3;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Longitud Maxima</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO___LONGITUD_MAXIMA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ape4_B.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ape4_B.TipoDato
	 * @see ape4_B.impl.Ape4_BPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 3;

	/**
	 * Returns the meta object for class '{@link ape4_B.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see ape4_B.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Principal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ape4_B.Principal#getName()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ape4_B.Principal#getPosee <em>Posee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posee</em>'.
	 * @see ape4_B.Principal#getPosee()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Posee();

	/**
	 * Returns the meta object for class '{@link ape4_B.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see ape4_B.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ape4_B.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ape4_B.Entidad#getContiene <em>Contiene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contiene</em>'.
	 * @see ape4_B.Entidad#getContiene()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Contiene();

	/**
	 * Returns the meta object for the reference '{@link ape4_B.Entidad#getRedirige <em>Redirige</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redirige</em>'.
	 * @see ape4_B.Entidad#getRedirige()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Redirige();

	/**
	 * Returns the meta object for the '{@link ape4_B.Entidad#nombreCorto(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre Corto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre Corto</em>' operation.
	 * @see ape4_B.Entidad#nombreCorto(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntidad__NombreCorto__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ape4_B.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see ape4_B.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Atributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ape4_B.Atributo#getName()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Name();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Atributo#getLongitud <em>Longitud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitud</em>'.
	 * @see ape4_B.Atributo#getLongitud()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Longitud();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Atributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see ape4_B.Atributo#getTipoDato()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link ape4_B.Atributo#isRequerido <em>Requerido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requerido</em>'.
	 * @see ape4_B.Atributo#isRequerido()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Requerido();

	/**
	 * Returns the meta object for the '{@link ape4_B.Atributo#longitudMaxima(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Longitud Maxima</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Longitud Maxima</em>' operation.
	 * @see ape4_B.Atributo#longitudMaxima(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAtributo__LongitudMaxima__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link ape4_B.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see ape4_B.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ape4_BFactory getApe4_BFactory();

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
		 * The meta object literal for the '{@link ape4_B.impl.PrincipalImpl <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ape4_B.impl.PrincipalImpl
		 * @see ape4_B.impl.Ape4_BPackageImpl#getPrincipal()
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
		 * The meta object literal for the '<em><b>Posee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__POSEE = eINSTANCE.getPrincipal_Posee();

		/**
		 * The meta object literal for the '{@link ape4_B.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ape4_B.impl.EntidadImpl
		 * @see ape4_B.impl.Ape4_BPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

		/**
		 * The meta object literal for the '<em><b>Contiene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__CONTIENE = eINSTANCE.getEntidad_Contiene();

		/**
		 * The meta object literal for the '<em><b>Redirige</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__REDIRIGE = eINSTANCE.getEntidad_Redirige();

		/**
		 * The meta object literal for the '<em><b>Nombre Corto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTIDAD___NOMBRE_CORTO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEntidad__NombreCorto__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ape4_B.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ape4_B.impl.AtributoImpl
		 * @see ape4_B.impl.Ape4_BPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

		/**
		 * The meta object literal for the '<em><b>Longitud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__LONGITUD = eINSTANCE.getAtributo_Longitud();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO = eINSTANCE.getAtributo_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Requerido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__REQUERIDO = eINSTANCE.getAtributo_Requerido();

		/**
		 * The meta object literal for the '<em><b>Longitud Maxima</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATRIBUTO___LONGITUD_MAXIMA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAtributo__LongitudMaxima__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ape4_B.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ape4_B.TipoDato
		 * @see ape4_B.impl.Ape4_BPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //Ape4_BPackage
