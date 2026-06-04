/**
 */
package pruebaModelo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pruebaModelo.ArregloInt;
import pruebaModelo.PruebaModeloPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arreglo Int</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pruebaModelo.impl.ArregloIntImpl#getName <em>Name</em>}</li>
 *   <li>{@link pruebaModelo.impl.ArregloIntImpl#getValores <em>Valores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArregloIntImpl extends MinimalEObjectImpl.Container implements ArregloInt {
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
	 * The cached value of the '{@link #getValores() <em>Valores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValores()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> valores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArregloIntImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PruebaModeloPackage.Literals.ARREGLO_INT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PruebaModeloPackage.ARREGLO_INT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getValores() {
		if (valores == null) {
			valores = new EDataTypeUniqueEList<Integer>(Integer.class, this, PruebaModeloPackage.ARREGLO_INT__VALORES);
		}
		return valores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PruebaModeloPackage.ARREGLO_INT__NAME:
			return getName();
		case PruebaModeloPackage.ARREGLO_INT__VALORES:
			return getValores();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PruebaModeloPackage.ARREGLO_INT__NAME:
			setName((String) newValue);
			return;
		case PruebaModeloPackage.ARREGLO_INT__VALORES:
			getValores().clear();
			getValores().addAll((Collection<? extends Integer>) newValue);
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
		case PruebaModeloPackage.ARREGLO_INT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PruebaModeloPackage.ARREGLO_INT__VALORES:
			getValores().clear();
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
		case PruebaModeloPackage.ARREGLO_INT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PruebaModeloPackage.ARREGLO_INT__VALORES:
			return valores != null && !valores.isEmpty();
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
		result.append(", valores: ");
		result.append(valores);
		result.append(')');
		return result.toString();
	}

} //ArregloIntImpl
