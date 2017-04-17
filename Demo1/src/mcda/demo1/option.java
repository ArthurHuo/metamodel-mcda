/**
 */
package mcda.demo1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.option#getName <em>Name</em>}</li>
 *   <li>{@link mcda.demo1.option#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mcda.demo1.option#getInstanceof <em>Instanceof</em>}</li>
 *   <li>{@link mcda.demo1.option#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getoption()
 * @model
 * @generated
 */
public interface option extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mcda.demo1.mcdaPackage#getoption_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mcda.demo1.option#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute list.
	 * @see mcda.demo1.mcdaPackage#getoption_Attribute()
	 * @model
	 * @generated
	 */
	EList<String> getAttribute();

	/**
	 * Returns the value of the '<em><b>Instanceof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instanceof</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanceof</em>' reference.
	 * @see #setInstanceof(OptionType)
	 * @see mcda.demo1.mcdaPackage#getoption_Instanceof()
	 * @model required="true"
	 * @generated
	 */
	OptionType getInstanceof();

	/**
	 * Sets the value of the '{@link mcda.demo1.option#getInstanceof <em>Instanceof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanceof</em>' reference.
	 * @see #getInstanceof()
	 * @generated
	 */
	void setInstanceof(OptionType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mcda.demo1.mcdaPackage#getoption_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mcda.demo1.option#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // option
