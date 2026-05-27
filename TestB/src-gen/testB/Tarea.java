/**
 */
package testB;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testB.Tarea#getName <em>Name</em>}</li>
 *   <li>{@link testB.Tarea#getTipoC <em>Tipo C</em>}</li>
 * </ul>
 *
 * @see testB.TestBPackage#getTarea()
 * @model
 * @generated
 */
public interface Tarea extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testB.TestBPackage#getTarea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testB.Tarea#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipo C</b></em>' attribute.
	 * The literals are from the enumeration {@link testB.TipoCalificacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo C</em>' attribute.
	 * @see testB.TipoCalificacion
	 * @see #setTipoC(TipoCalificacion)
	 * @see testB.TestBPackage#getTarea_TipoC()
	 * @model
	 * @generated
	 */
	TipoCalificacion getTipoC();

	/**
	 * Sets the value of the '{@link testB.Tarea#getTipoC <em>Tipo C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo C</em>' attribute.
	 * @see testB.TipoCalificacion
	 * @see #getTipoC()
	 * @generated
	 */
	void setTipoC(TipoCalificacion value);

} // Tarea
