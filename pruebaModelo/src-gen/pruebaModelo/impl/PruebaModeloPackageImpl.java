/**
 */
package pruebaModelo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pruebaModelo.ArregloInt;
import pruebaModelo.ArregloString;
import pruebaModelo.PruebaModeloFactory;
import pruebaModelo.PruebaModeloPackage;
import pruebaModelo.RaizFDLLU;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PruebaModeloPackageImpl extends EPackageImpl implements PruebaModeloPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raizFDLLUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arregloIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arregloStringEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pruebaModelo.PruebaModeloPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PruebaModeloPackageImpl() {
		super(eNS_URI, PruebaModeloFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PruebaModeloPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PruebaModeloPackage init() {
		if (isInited)
			return (PruebaModeloPackage) EPackage.Registry.INSTANCE.getEPackage(PruebaModeloPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPruebaModeloPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PruebaModeloPackageImpl thePruebaModeloPackage = registeredPruebaModeloPackage instanceof PruebaModeloPackageImpl
				? (PruebaModeloPackageImpl) registeredPruebaModeloPackage
				: new PruebaModeloPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePruebaModeloPackage.createPackageContents();

		// Initialize created meta-data
		thePruebaModeloPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePruebaModeloPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PruebaModeloPackage.eNS_URI, thePruebaModeloPackage);
		return thePruebaModeloPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaizFDLLU() {
		return raizFDLLUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRaizFDLLU_Name() {
		return (EAttribute) raizFDLLUEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRaizFDLLU_Arregloint() {
		return (EReference) raizFDLLUEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRaizFDLLU_Arreglostring() {
		return (EReference) raizFDLLUEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArregloInt() {
		return arregloIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArregloInt_Name() {
		return (EAttribute) arregloIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArregloInt_Valores() {
		return (EAttribute) arregloIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArregloString() {
		return arregloStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArregloString_Name() {
		return (EAttribute) arregloStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArregloString_Valores() {
		return (EAttribute) arregloStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PruebaModeloFactory getPruebaModeloFactory() {
		return (PruebaModeloFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		raizFDLLUEClass = createEClass(RAIZ_FDLLU);
		createEAttribute(raizFDLLUEClass, RAIZ_FDLLU__NAME);
		createEReference(raizFDLLUEClass, RAIZ_FDLLU__ARREGLOINT);
		createEReference(raizFDLLUEClass, RAIZ_FDLLU__ARREGLOSTRING);

		arregloIntEClass = createEClass(ARREGLO_INT);
		createEAttribute(arregloIntEClass, ARREGLO_INT__NAME);
		createEAttribute(arregloIntEClass, ARREGLO_INT__VALORES);

		arregloStringEClass = createEClass(ARREGLO_STRING);
		createEAttribute(arregloStringEClass, ARREGLO_STRING__NAME);
		createEAttribute(arregloStringEClass, ARREGLO_STRING__VALORES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(raizFDLLUEClass, RaizFDLLU.class, "RaizFDLLU", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRaizFDLLU_Name(), ecorePackage.getEString(), "name", null, 0, 1, RaizFDLLU.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRaizFDLLU_Arregloint(), this.getArregloInt(), null, "arregloint", null, 0, -1,
				RaizFDLLU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRaizFDLLU_Arreglostring(), this.getArregloString(), null, "arreglostring", null, 0, -1,
				RaizFDLLU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arregloIntEClass, ArregloInt.class, "ArregloInt", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArregloInt_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArregloInt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArregloInt_Valores(), ecorePackage.getEInt(), "valores", null, 0, -1, ArregloInt.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arregloStringEClass, ArregloString.class, "ArregloString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArregloString_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArregloString.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArregloString_Valores(), ecorePackage.getEString(), "valores", null, 0, -1,
				ArregloString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PruebaModeloPackageImpl
