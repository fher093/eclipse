/**
 */
package ape4_B.impl;

import ape4_B.Ape4_BPackage;
import ape4_B.Ape4_BTables;
import ape4_B.Atributo;
import ape4_B.TipoDato;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ape4_B.impl.AtributoImpl#getName <em>Name</em>}</li>
 *   <li>{@link ape4_B.impl.AtributoImpl#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link ape4_B.impl.AtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link ape4_B.impl.AtributoImpl#isRequerido <em>Requerido</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected static final int LONGITUD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected int longitud = LONGITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.STRING;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequerido() <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequerido()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUERIDO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequerido() <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequerido()
	 * @generated
	 * @ordered
	 */
	protected boolean requerido = REQUERIDO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ape4_BPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ape4_BPackage.ATRIBUTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLongitud() {
		return longitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitud(int newLongitud) {
		int oldLongitud = longitud;
		longitud = newLongitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ape4_BPackage.ATRIBUTO__LONGITUD, oldLongitud,
					longitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ape4_BPackage.ATRIBUTO__TIPO_DATO, oldTipoDato,
					tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequerido() {
		return requerido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequerido(boolean newRequerido) {
		boolean oldRequerido = requerido;
		requerido = newRequerido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ape4_BPackage.ATRIBUTO__REQUERIDO, oldRequerido,
					requerido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean longitudMaxima(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Atributo::longitudMaxima";
		try {
			/**
			 *
			 * inv longitudMaxima:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.longitud < 1000
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Ape4_BPackage.Literals.ATRIBUTO___LONGITUD_MAXIMA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Ape4_BTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int longitud = this.getLongitud();
				final /*@NonInvalid*/ IntegerValue BOXED_longitud = ValueUtil.integerValueOf(longitud);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, BOXED_longitud, Ape4_BTables.INT_1000).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Ape4_BTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ape4_BPackage.ATRIBUTO__NAME:
			return getName();
		case Ape4_BPackage.ATRIBUTO__LONGITUD:
			return getLongitud();
		case Ape4_BPackage.ATRIBUTO__TIPO_DATO:
			return getTipoDato();
		case Ape4_BPackage.ATRIBUTO__REQUERIDO:
			return isRequerido();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Ape4_BPackage.ATRIBUTO__NAME:
			setName((String) newValue);
			return;
		case Ape4_BPackage.ATRIBUTO__LONGITUD:
			setLongitud((Integer) newValue);
			return;
		case Ape4_BPackage.ATRIBUTO__TIPO_DATO:
			setTipoDato((TipoDato) newValue);
			return;
		case Ape4_BPackage.ATRIBUTO__REQUERIDO:
			setRequerido((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Ape4_BPackage.ATRIBUTO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Ape4_BPackage.ATRIBUTO__LONGITUD:
			setLongitud(LONGITUD_EDEFAULT);
			return;
		case Ape4_BPackage.ATRIBUTO__TIPO_DATO:
			setTipoDato(TIPO_DATO_EDEFAULT);
			return;
		case Ape4_BPackage.ATRIBUTO__REQUERIDO:
			setRequerido(REQUERIDO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Ape4_BPackage.ATRIBUTO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Ape4_BPackage.ATRIBUTO__LONGITUD:
			return longitud != LONGITUD_EDEFAULT;
		case Ape4_BPackage.ATRIBUTO__TIPO_DATO:
			return tipoDato != TIPO_DATO_EDEFAULT;
		case Ape4_BPackage.ATRIBUTO__REQUERIDO:
			return requerido != REQUERIDO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Ape4_BPackage.ATRIBUTO___LONGITUD_MAXIMA__DIAGNOSTICCHAIN_MAP:
			return longitudMaxima((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", longitud: ");
		result.append(longitud);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", requerido: ");
		result.append(requerido);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
