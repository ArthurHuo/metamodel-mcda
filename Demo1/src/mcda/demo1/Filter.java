/**
 */
package mcda.demo1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.Filter#getTarget <em>Target</em>}</li>
 *   <li>{@link mcda.demo1.Filter#getOp <em>Op</em>}</li>
 *   <li>{@link mcda.demo1.Filter#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link mcda.demo1.Filter#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends operation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see mcda.demo1.mcdaPackage#getFilter_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link mcda.demo1.Filter#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see mcda.demo1.mcdaPackage#getFilter_Op()
	 * @model required="true"
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link mcda.demo1.Filter#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

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
	 * @see mcda.demo1.mcdaPackage#getFilter_CriteriaName()
	 * @model required="true"
	 * @generated
	 */
	String getCriteriaName();

	/**
	 * Sets the value of the '{@link mcda.demo1.Filter#getCriteriaName <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Name</em>' attribute.
	 * @see #getCriteriaName()
	 * @generated
	 */
	void setCriteriaName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(option)
	 * @see mcda.demo1.mcdaPackage#getFilter_Filter()
	 * @model required="true"
	 * @generated
	 */
	option getFilter();

	/**
	 * Sets the value of the '{@link mcda.demo1.Filter#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(option value);

} // Filter
