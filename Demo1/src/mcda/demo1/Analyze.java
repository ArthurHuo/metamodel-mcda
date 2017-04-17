/**
 */
package mcda.demo1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyze</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.Analyze#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getAnalyze()
 * @model
 * @generated
 */
public interface Analyze extends operation {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see mcda.demo1.mcdaPackage#getAnalyze_Method()
	 * @model required="true"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link mcda.demo1.Analyze#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // Analyze
