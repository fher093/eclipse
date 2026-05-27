/**
 */
package testB.impl;

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
import testB.Docente;
import testB.Materia;
import testB.Principal;
import testB.TestBPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testB.impl.PrincipalImpl#getName <em>Name</em>}</li>
 *   <li>{@link testB.impl.PrincipalImpl#getMateria <em>Materia</em>}</li>
 *   <li>{@link testB.impl.PrincipalImpl#getDocente <em>Docente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrincipalImpl extends MinimalEObjectImpl.Container implements Principal {
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
	 * The cached value of the '{@link #getMateria() <em>Materia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMateria()
	 * @generated
	 * @ordered
	 */
	protected EList<Materia> materia;

	/**
	 * The cached value of the '{@link #getDocente() <em>Docente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocente()
	 * @generated
	 * @ordered
	 */
	protected EList<Docente> docente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestBPackage.Literals.PRINCIPAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestBPackage.PRINCIPAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Materia> getMateria() {
		if (materia == null) {
			materia = new EObjectContainmentEList<Materia>(Materia.class, this, TestBPackage.PRINCIPAL__MATERIA);
		}
		return materia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Docente> getDocente() {
		if (docente == null) {
			docente = new EObjectContainmentEList<Docente>(Docente.class, this, TestBPackage.PRINCIPAL__DOCENTE);
		}
		return docente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestBPackage.PRINCIPAL__MATERIA:
			return ((InternalEList<?>) getMateria()).basicRemove(otherEnd, msgs);
		case TestBPackage.PRINCIPAL__DOCENTE:
			return ((InternalEList<?>) getDocente()).basicRemove(otherEnd, msgs);
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
		case TestBPackage.PRINCIPAL__NAME:
			return getName();
		case TestBPackage.PRINCIPAL__MATERIA:
			return getMateria();
		case TestBPackage.PRINCIPAL__DOCENTE:
			return getDocente();
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
		case TestBPackage.PRINCIPAL__NAME:
			setName((String) newValue);
			return;
		case TestBPackage.PRINCIPAL__MATERIA:
			getMateria().clear();
			getMateria().addAll((Collection<? extends Materia>) newValue);
			return;
		case TestBPackage.PRINCIPAL__DOCENTE:
			getDocente().clear();
			getDocente().addAll((Collection<? extends Docente>) newValue);
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
		case TestBPackage.PRINCIPAL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestBPackage.PRINCIPAL__MATERIA:
			getMateria().clear();
			return;
		case TestBPackage.PRINCIPAL__DOCENTE:
			getDocente().clear();
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
		case TestBPackage.PRINCIPAL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestBPackage.PRINCIPAL__MATERIA:
			return materia != null && !materia.isEmpty();
		case TestBPackage.PRINCIPAL__DOCENTE:
			return docente != null && !docente.isEmpty();
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

} //PrincipalImpl
