/**
 */
package mcda.demo1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.Task#getHaveOperation <em>Have Operation</em>}</li>
 *   <li>{@link mcda.demo1.Task#getDefineType <em>Define Type</em>}</li>
 *   <li>{@link mcda.demo1.Task#getHaveOption <em>Have Option</em>}</li>
 *   <li>{@link mcda.demo1.Task#getName <em>Name</em>}</li>
 *   <li>{@link mcda.demo1.Task#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Have Operation</b></em>' containment reference list.
	 * The list contents are of type {@link mcda.demo1.operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Have Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have Operation</em>' containment reference list.
	 * @see mcda.demo1.mcdaPackage#getTask_HaveOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<operation> getHaveOperation();

	/**
	 * Returns the value of the '<em><b>Define Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define Type</em>' containment reference.
	 * @see #setDefineType(OptionType)
	 * @see mcda.demo1.mcdaPackage#getTask_DefineType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OptionType getDefineType();

	/**
	 * Sets the value of the '{@link mcda.demo1.Task#getDefineType <em>Define Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define Type</em>' containment reference.
	 * @see #getDefineType()
	 * @generated
	 */
	void setDefineType(OptionType value);

	/**
	 * Returns the value of the '<em><b>Have Option</b></em>' containment reference list.
	 * The list contents are of type {@link mcda.demo1.option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Have Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have Option</em>' containment reference list.
	 * @see mcda.demo1.mcdaPackage#getTask_HaveOption()
	 * @model containment="true"
	 * @generated
	 */
	EList<option> getHaveOption();

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
	 * @see mcda.demo1.mcdaPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mcda.demo1.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mcda.demo1.mcdaPackage#getTask_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mcda.demo1.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Task
