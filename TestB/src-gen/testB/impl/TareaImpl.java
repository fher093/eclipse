/**
 */
package testB.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import testB.Tarea;
import testB.TestBPackage;
import testB.TipoCalificacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testB.impl.TareaImpl#getName <em>Name</em>}</li>
 *   <li>{@link testB.impl.TareaImpl#getTipoC <em>Tipo C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaImpl extends MinimalEObjectImpl.Container implements Tarea {
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
	 * The default value of the '{@link #getTipoC() <em>Tipo C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoC()
	 * @generated
	 * @ordered
	 */
	protected static final TipoCalificacion TIPO_C_EDEFAULT = TipoCalificacion.APE;

	/**
	 * The cached value of the '{@link #getTipoC() <em>Tipo C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoC()
	 * @generated
	 * @ordered
	 */
	protected TipoCalificacion tipoC = TIPO_C_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestBPackage.Literals.TAREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestBPackage.TAREA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoCalificacion getTipoC() {
		return tipoC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoC(TipoCalificacion newTipoC) {
		TipoCalificacion oldTipoC = tipoC;
		tipoC = newTipoC == null ? TIPO_C_EDEFAULT : newTipoC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestBPackage.TAREA__TIPO_C, oldTipoC, tipoC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestBPackage.TAREA__NAME:
			return getName();
		case TestBPackage.TAREA__TIPO_C:
			return getTipoC();
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
		case TestBPackage.TAREA__NAME:
			setName((String) newValue);
			return;
		case TestBPackage.TAREA__TIPO_C:
			setTipoC((TipoCalificacion) newValue);
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
		case TestBPackage.TAREA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestBPackage.TAREA__TIPO_C:
			setTipoC(TIPO_C_EDEFAULT);
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
		case TestBPackage.TAREA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestBPackage.TAREA__TIPO_C:
			return tipoC != TIPO_C_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", tipoC: ");
		result.append(tipoC);
		result.append(')');
		return result.toString();
	}

} //TareaImpl
