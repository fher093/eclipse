/**
 */
package ape4_B;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ape4_B.Entidad#getName <em>Name</em>}</li>
 *   <li>{@link ape4_B.Entidad#getContiene <em>Contiene</em>}</li>
 *   <li>{@link ape4_B.Entidad#getRedirige <em>Redirige</em>}</li>
 * </ul>
 *
 * @see ape4_B.Ape4_BPackage#getEntidad()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nombreCorto'"
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ape4_B.Ape4_BPackage#getEntidad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ape4_B.Entidad#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contiene</b></em>' containment reference list.
	 * The list contents are of type {@link ape4_B.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contiene</em>' containment reference list.
	 * @see ape4_B.Ape4_BPackage#getEntidad_Contiene()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getContiene();

	/**
	 * Returns the value of the '<em><b>Redirige</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirige</em>' reference.
	 * @see #setRedirige(Entidad)
	 * @see ape4_B.Ape4_BPackage#getEntidad_Redirige()
	 * @model
	 * @generated
	 */
	Entidad getRedirige();

	/**
	 * Sets the value of the '{@link ape4_B.Entidad#getRedirige <em>Redirige</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirige</em>' reference.
	 * @see #getRedirige()
	 * @generated
	 */
	void setRedirige(Entidad value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.name.size()&gt;3'"
	 * @generated
	 */
	boolean nombreCorto(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entidad
