/**
 */
package mcda.demo1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.Evaluate#getContain <em>Contain</em>}</li>
 *   <li>{@link mcda.demo1.Evaluate#getCriteriaName <em>Criteria Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getEvaluate()
 * @model
 * @generated
 */
public interface Evaluate extends operation {
	/**
	 * Returns the value of the '<em><b>Contain</b></em>' containment reference list.
	 * The list contents are of type {@link mcda.demo1.EvaluatePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain</em>' containment reference list.
	 * @see mcda.demo1.mcdaPackage#getEvaluate_Contain()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluatePair> getContain();

	/**
	 * Returns the value of the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Name</em>' attribute.
	 * @see #setCriteriaName(String)
	 * @see mcda.demo1.mcdaPackage#getEvaluate_CriteriaName()
	 * @model required="true"
	 * @generated
	 */
	String getCriteriaName();

	/**
	 * Sets the value of the '{@link mcda.demo1.Evaluate#getCriteriaName <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Name</em>' attribute.
	 * @see #getCriteriaName()
	 * @generated
	 */
	void setCriteriaName(String value);

} // Evaluate
