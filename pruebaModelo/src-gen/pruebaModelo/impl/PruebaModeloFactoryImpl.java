/**
 */
package pruebaModelo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pruebaModelo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PruebaModeloFactoryImpl extends EFactoryImpl implements PruebaModeloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PruebaModeloFactory init() {
		try {
			PruebaModeloFactory thePruebaModeloFactory = (PruebaModeloFactory) EPackage.Registry.INSTANCE
					.getEFactory(PruebaModeloPackage.eNS_URI);
			if (thePruebaModeloFactory != null) {
				return thePruebaModeloFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PruebaModeloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PruebaModeloFactoryImpl() {
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
		case PruebaModeloPackage.RAIZ_FDLLU:
			return createRaizFDLLU();
		case PruebaModeloPackage.ARREGLO_INT:
			return createArregloInt();
		case PruebaModeloPackage.ARREGLO_STRING:
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
	public PruebaModeloPackage getPruebaModeloPackage() {
		return (PruebaModeloPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PruebaModeloPackage getPackage() {
		return PruebaModeloPackage.eINSTANCE;
	}

} //PruebaModeloFactoryImpl
