/**
 */
package ape4_B;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ape4_B.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link ape4_B.Atributo#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link ape4_B.Atributo#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link ape4_B.Atributo#isRequerido <em>Requerido</em>}</li>
 * </ul>
 *
 * @see ape4_B.Ape4_BPackage#getAtributo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='longitudMaxima'"
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ape4_B.Ape4_BPackage#getAtributo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ape4_B.Atributo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitud</em>' attribute.
	 * @see #setLongitud(int)
	 * @see ape4_B.Ape4_BPackage#getAtributo_Longitud()
	 * @model required="true"
	 * @generated
	 */
	int getLongitud();

	/**
	 * Sets the value of the '{@link ape4_B.Atributo#getLongitud <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitud</em>' attribute.
	 * @see #getLongitud()
	 * @generated
	 */
	void setLongitud(int value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link ape4_B.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see ape4_B.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see ape4_B.Ape4_BPackage#getAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link ape4_B.Atributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see ape4_B.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Requerido</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requerido</em>' attribute.
	 * @see #setRequerido(boolean)
	 * @see ape4_B.Ape4_BPackage#getAtributo_Requerido()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRequerido();

	/**
	 * Sets the value of the '{@link ape4_B.Atributo#isRequerido <em>Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requerido</em>' attribute.
	 * @see #isRequerido()
	 * @generated
	 */
	void setRequerido(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.longitud&lt;1000'"
	 * @generated
	 */
	boolean longitudMaxima(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Atributo
