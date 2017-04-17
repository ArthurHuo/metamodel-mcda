/**
 */
package mcda.demo1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mcda.demo1.mcdaPackage
 * @generated
 */
public interface mcdaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	mcdaFactory eINSTANCE = mcda.demo1.impl.mcdaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Analyze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyze</em>'.
	 * @generated
	 */
	Analyze createAnalyze();

	/**
	 * Returns a new object of class '<em>Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate</em>'.
	 * @generated
	 */
	Evaluate createEvaluate();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Type</em>'.
	 * @generated
	 */
	OptionType createOptionType();

	/**
	 * Returns a new object of class '<em>option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>option</em>'.
	 * @generated
	 */
	option createoption();

	/**
	 * Returns a new object of class '<em>Comparison Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Matrix</em>'.
	 * @generated
	 */
	ComparisonMatrix createComparisonMatrix();

	/**
	 * Returns a new object of class '<em>Evaluate Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Pair</em>'.
	 * @generated
	 */
	EvaluatePair createEvaluatePair();

	/**
	 * Returns a new object of class '<em>Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criteria</em>'.
	 * @generated
	 */
	Criteria createCriteria();

	/**
	 * Returns a new object of class '<em>Comparison Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Pair</em>'.
	 * @generated
	 */
	ComparisonPair createComparisonPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	mcdaPackage getmcdaPackage();

} //mcdaFactory
