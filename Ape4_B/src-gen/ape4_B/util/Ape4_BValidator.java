/**
 */
package ape4_B.util;

import ape4_B.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ape4_B.Ape4_BPackage
 * @generated
 */
public class Ape4_BValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Ape4_BValidator INSTANCE = new Ape4_BValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ape4_B";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre Corto' of 'Entidad'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTIDAD__NOMBRE_CORTO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Longitud Maxima' of 'Atributo'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATRIBUTO__LONGITUD_MAXIMA = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ape4_BValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Ape4_BPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Ape4_BPackage.PRINCIPAL:
			return validatePrincipal((Principal) value, diagnostics, context);
		case Ape4_BPackage.ENTIDAD:
			return validateEntidad((Entidad) value, diagnostics, context);
		case Ape4_BPackage.ATRIBUTO:
			return validateAtributo((Atributo) value, diagnostics, context);
		case Ape4_BPackage.TIPO_DATO:
			return validateTipoDato((TipoDato) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal(Principal principal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(principal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad(Entidad entidad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entidad, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(entidad, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEntidad_nombreCorto(entidad, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nombreCorto constraint of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntidad_nombreCorto(Entidad entidad, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entidad.nombreCorto(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atributo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(atributo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAtributo_longitudMaxima(atributo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the longitudMaxima constraint of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo_longitudMaxima(Atributo atributo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return atributo.longitudMaxima(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTipoDato(TipoDato tipoDato, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Ape4_BValidator
