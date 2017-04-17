/**
 */
package mcda.demo1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcda.demo1.ComparisonMatrix#getMakeupof <em>Makeupof</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcda.demo1.mcdaPackage#getComparisonMatrix()
 * @model
 * @generated
 */
public interface ComparisonMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Makeupof</b></em>' containment reference list.
	 * The list contents are of type {@link mcda.demo1.ComparisonPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Makeupof</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Makeupof</em>' containment reference list.
	 * @see mcda.demo1.mcdaPackage#getComparisonMatrix_Makeupof()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComparisonPair> getMakeupof();

} // ComparisonMatrix
