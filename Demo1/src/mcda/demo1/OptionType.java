/**
 */
package mcda.demo1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.OptionType#getCompareWeight <em>Compare Weight</em>}</li>
 *   <li>{@link mcda.demo1.OptionType#getName <em>Name</em>}</li>
 *   <li>{@link mcda.demo1.OptionType#getDefineCriteria <em>Define Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getOptionType()
 * @model
 * @generated
 */
public interface OptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compare Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare Weight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare Weight</em>' containment reference.
	 * @see #setCompareWeight(ComparisonMatrix)
	 * @see mcda.demo1.mcdaPackage#getOptionType_CompareWeight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComparisonMatrix getCompareWeight();

	/**
	 * Sets the value of the '{@link mcda.demo1.OptionType#getCompareWeight <em>Compare Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare Weight</em>' containment reference.
	 * @see #getCompareWeight()
	 * @generated
	 */
	void setCompareWeight(ComparisonMatrix value);

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
	 * @see mcda.demo1.mcdaPackage#getOptionType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mcda.demo1.OptionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Define Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link mcda.demo1.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define Criteria</em>' containment reference list.
	 * @see mcda.demo1.mcdaPackage#getOptionType_DefineCriteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criteria> getDefineCriteria();

} // OptionType
