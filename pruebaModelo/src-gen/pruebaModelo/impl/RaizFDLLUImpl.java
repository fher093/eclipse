/**
 */
package pruebaModelo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pruebaModelo.ArregloInt;
import pruebaModelo.ArregloString;
import pruebaModelo.PruebaModeloPackage;
import pruebaModelo.RaizFDLLU;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raiz FDLLU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pruebaModelo.impl.RaizFDLLUImpl#getName <em>Name</em>}</li>
 *   <li>{@link pruebaModelo.impl.RaizFDLLUImpl#getArregloint <em>Arregloint</em>}</li>
 *   <li>{@link pruebaModelo.impl.RaizFDLLUImpl#getArreglostring <em>Arreglostring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RaizFDLLUImpl extends MinimalEObjectImpl.Container implements RaizFDLLU {
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
	 * The cached value of the '{@link #getArregloint() <em>Arregloint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArregloint()
	 * @generated
	 * @ordered
	 */
	protected EList<ArregloInt> arregloint;

	/**
	 * The cached value of the '{@link #getArreglostring() <em>Arreglostring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArreglostring()
	 * @generated
	 * @ordered
	 */
	protected EList<ArregloString> arreglostring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaizFDLLUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PruebaModeloPackage.Literals.RAIZ_FDLLU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PruebaModeloPackage.RAIZ_FDLLU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArregloInt> getArregloint() {
		if (arregloint == null) {
			arregloint = new EObjectContainmentEList<ArregloInt>(ArregloInt.class, this,
					PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT);
		}
		return arregloint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArregloString> getArreglostring() {
		if (arreglostring == null) {
			arreglostring = new EObjectContainmentEList<ArregloString>(ArregloString.class, this,
					PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING);
		}
		return arreglostring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT:
			return ((InternalEList<?>) getArregloint()).basicRemove(otherEnd, msgs);
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING:
			return ((InternalEList<?>) getArreglostring()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PruebaModeloPackage.RAIZ_FDLLU__NAME:
			return getName();
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT:
			return getArregloint();
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING:
			return getArreglostring();
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
		case PruebaModeloPackage.RAIZ_FDLLU__NAME:
			setName((String) newValue);
			return;
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT:
			getArregloint().clear();
			getArregloint().addAll((Collection<? extends ArregloInt>) newValue);
			return;
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING:
			getArreglostring().clear();
			getArreglostring().addAll((Collection<? extends ArregloString>) newValue);
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
		case PruebaModeloPackage.RAIZ_FDLLU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT:
			getArregloint().clear();
			return;
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING:
			getArreglostring().clear();
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
		case PruebaModeloPackage.RAIZ_FDLLU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOINT:
			return arregloint != null && !arregloint.isEmpty();
		case PruebaModeloPackage.RAIZ_FDLLU__ARREGLOSTRING:
			return arreglostring != null && !arreglostring.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RaizFDLLUImpl
