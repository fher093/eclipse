/**
 */
package modeloPrueba.impl;

import java.util.Collection;

import modeloPrueba.ArregloInt;
import modeloPrueba.ArregloString;
import modeloPrueba.ModeloPruebaPackage;
import modeloPrueba.RaizFDLLU;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raiz FDLLU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloPrueba.impl.RaizFDLLUImpl#getName <em>Name</em>}</li>
 *   <li>{@link modeloPrueba.impl.RaizFDLLUImpl#getContiene <em>Contiene</em>}</li>
 *   <li>{@link modeloPrueba.impl.RaizFDLLUImpl#getContien <em>Contien</em>}</li>
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
	 * The cached value of the '{@link #getContiene() <em>Contiene</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContiene()
	 * @generated
	 * @ordered
	 */
	protected EList<ArregloInt> contiene;

	/**
	 * The cached value of the '{@link #getContien() <em>Contien</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContien()
	 * @generated
	 * @ordered
	 */
	protected EList<ArregloString> contien;

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
		return ModeloPruebaPackage.Literals.RAIZ_FDLLU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloPruebaPackage.RAIZ_FDLLU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArregloInt> getContiene() {
		if (contiene == null) {
			contiene = new EObjectResolvingEList<ArregloInt>(ArregloInt.class, this,
					ModeloPruebaPackage.RAIZ_FDLLU__CONTIENE);
		}
		return contiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArregloString> getContien() {
		if (contien == null) {
			contien = new EObjectResolvingEList<ArregloString>(ArregloString.class, this,
					ModeloPruebaPackage.RAIZ_FDLLU__CONTIEN);
		}
		return contien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModeloPruebaPackage.RAIZ_FDLLU__NAME:
			return getName();
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIENE:
			return getContiene();
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIEN:
			return getContien();
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
		case ModeloPruebaPackage.RAIZ_FDLLU__NAME:
			setName((String) newValue);
			return;
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIENE:
			getContiene().clear();
			getContiene().addAll((Collection<? extends ArregloInt>) newValue);
			return;
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIEN:
			getContien().clear();
			getContien().addAll((Collection<? extends ArregloString>) newValue);
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
		case ModeloPruebaPackage.RAIZ_FDLLU__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIENE:
			getContiene().clear();
			return;
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIEN:
			getContien().clear();
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
		case ModeloPruebaPackage.RAIZ_FDLLU__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIENE:
			return contiene != null && !contiene.isEmpty();
		case ModeloPruebaPackage.RAIZ_FDLLU__CONTIEN:
			return contien != null && !contien.isEmpty();
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
