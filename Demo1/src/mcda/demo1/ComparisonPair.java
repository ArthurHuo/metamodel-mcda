/**
 */
package mcda.demo1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.ComparisonPair#getCriteria1 <em>Criteria1</em>}</li>
 *   <li>{@link mcda.demo1.ComparisonPair#getCriteria2 <em>Criteria2</em>}</li>
 *   <li>{@link mcda.demo1.ComparisonPair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getComparisonPair()
 * @model
 * @generated
 */
public interface ComparisonPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria1</em>' attribute.
	 * @see #setCriteria1(String)
	 * @see mcda.demo1.mcdaPackage#getComparisonPair_Criteria1()
	 * @model required="true"
	 * @generated
	 */
	String getCriteria1();

	/**
	 * Sets the value of the '{@link mcda.demo1.ComparisonPair#getCriteria1 <em>Criteria1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria1</em>' attribute.
	 * @see #getCriteria1()
	 * @generated
	 */
	void setCriteria1(String value);

	/**
	 * Returns the value of the '<em><b>Criteria2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria2</em>' attribute.
	 * @see #setCriteria2(String)
	 * @see mcda.demo1.mcdaPackage#getComparisonPair_Criteria2()
	 * @model required="true"
	 * @generated
	 */
	String getCriteria2();

	/**
	 * Sets the value of the '{@link mcda.demo1.ComparisonPair#getCriteria2 <em>Criteria2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria2</em>' attribute.
	 * @see #getCriteria2()
	 * @generated
	 */
	void setCriteria2(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mcda.demo1.mcdaPackage#getComparisonPair_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mcda.demo1.ComparisonPair#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ComparisonPair
