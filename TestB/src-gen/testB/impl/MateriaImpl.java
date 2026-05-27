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
import testB.Tarea;
import testB.TestBPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testB.impl.MateriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link testB.impl.MateriaImpl#getTarea <em>Tarea</em>}</li>
 *   <li>{@link testB.impl.MateriaImpl#getDictada <em>Dictada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MateriaImpl extends MinimalEObjectImpl.Container implements Materia {
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
	 * The cached value of the '{@link #getTarea() <em>Tarea</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarea()
	 * @generated
	 * @ordered
	 */
	protected EList<Tarea> tarea;

	/**
	 * The cached value of the '{@link #getDictada() <em>Dictada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictada()
	 * @generated
	 * @ordered
	 */
	protected Docente dictada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MateriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestBPackage.Literals.MATERIA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestBPackage.MATERIA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tarea> getTarea() {
		if (tarea == null) {
			tarea = new EObjectContainmentEList<Tarea>(Tarea.class, this, TestBPackage.MATERIA__TAREA);
		}
		return tarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Docente getDictada() {
		if (dictada != null && dictada.eIsProxy()) {
			InternalEObject oldDictada = (InternalEObject) dictada;
			dictada = (Docente) eResolveProxy(oldDictada);
			if (dictada != oldDictada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestBPackage.MATERIA__DICTADA, oldDictada,
							dictada));
			}
		}
		return dictada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Docente basicGetDictada() {
		return dictada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDictada(Docente newDictada) {
		Docente oldDictada = dictada;
		dictada = newDictada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestBPackage.MATERIA__DICTADA, oldDictada, dictada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TestBPackage.MATERIA__TAREA:
			return ((InternalEList<?>) getTarea()).basicRemove(otherEnd, msgs);
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
		case TestBPackage.MATERIA__NAME:
			return getName();
		case TestBPackage.MATERIA__TAREA:
			return getTarea();
		case TestBPackage.MATERIA__DICTADA:
			if (resolve)
				return getDictada();
			return basicGetDictada();
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
		case TestBPackage.MATERIA__NAME:
			setName((String) newValue);
			return;
		case TestBPackage.MATERIA__TAREA:
			getTarea().clear();
			getTarea().addAll((Collection<? extends Tarea>) newValue);
			return;
		case TestBPackage.MATERIA__DICTADA:
			setDictada((Docente) newValue);
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
		case TestBPackage.MATERIA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TestBPackage.MATERIA__TAREA:
			getTarea().clear();
			return;
		case TestBPackage.MATERIA__DICTADA:
			setDictada((Docente) null);
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
		case TestBPackage.MATERIA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TestBPackage.MATERIA__TAREA:
			return tarea != null && !tarea.isEmpty();
		case TestBPackage.MATERIA__DICTADA:
			return dictada != null;
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

} //MateriaImpl
