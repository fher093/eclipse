/**
 */
package modeloPrueba.impl;

import modeloPrueba.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloPruebaFactoryImpl extends EFactoryImpl implements ModeloPruebaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloPruebaFactory init() {
		try {
			ModeloPruebaFactory theModeloPruebaFactory = (ModeloPruebaFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModeloPruebaPackage.eNS_URI);
			if (theModeloPruebaFactory != null) {
				return theModeloPruebaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloPruebaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloPruebaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModeloPruebaPackage.RAIZ_FDLLU:
			return createRaizFDLLU();
		case ModeloPruebaPackage.ARREGLO_INT:
			return createArregloInt();
		case ModeloPruebaPackage.ARREGLO_STRING:
			return createArregloString();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaizFDLLU createRaizFDLLU() {
		RaizFDLLUImpl raizFDLLU = new RaizFDLLUImpl();
		return raizFDLLU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArregloInt createArregloInt() {
		ArregloIntImpl arregloInt = new ArregloIntImpl();
		return arregloInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArregloString createArregloString() {
		ArregloStringImpl arregloString = new ArregloStringImpl();
		return arregloString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModeloPruebaPackage getModeloPruebaPackage() {
		return (ModeloPruebaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloPruebaPackage getPackage() {
		return ModeloPruebaPackage.eINSTANCE;
	}

} //ModeloPruebaFactoryImpl
