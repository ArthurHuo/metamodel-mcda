/**
 */
package mcda.demo1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mcda.demo1.mcdaFactory
 * @model kind="package"
 * @generated
 */
public interface mcdaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "demo1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://swen424/demo1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mcda";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	mcdaPackage eINSTANCE = mcda.demo1.impl.mcdaPackageImpl.init();

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.TaskImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Have Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAVE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Define Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEFINE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Have Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAVE_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.operationImpl <em>operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.operationImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getoperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The number of structural features of the '<em>operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.FilterImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__TARGET = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__OP = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CRITERIA_NAME = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.AnalyzeImpl <em>Analyze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.AnalyzeImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getAnalyze()
	 * @generated
	 */
	int ANALYZE = 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE__METHOD = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analyze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Analyze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.EvaluateImpl <em>Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.EvaluateImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getEvaluate()
	 * @generated
	 */
	int EVALUATE = 4;

	/**
	 * The feature id for the '<em><b>Contain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__CONTAIN = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__CRITERIA_NAME = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.FileImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URL = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IMPORT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.OptionTypeImpl <em>Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.OptionTypeImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Compare Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__COMPARE_WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Define Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__DEFINE_CRITERIA = 2;

	/**
	 * The number of structural features of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.optionImpl <em>option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.optionImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getoption()
	 * @generated
	 */
	int OPTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Instanceof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__INSTANCEOF = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.ComparisonMatrixImpl <em>Comparison Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.ComparisonMatrixImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getComparisonMatrix()
	 * @generated
	 */
	int COMPARISON_MATRIX = 8;

	/**
	 * The feature id for the '<em><b>Makeupof</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_MATRIX__MAKEUPOF = 0;

	/**
	 * The number of structural features of the '<em>Comparison Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_MATRIX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comparison Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.EvaluatePairImpl <em>Evaluate Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.EvaluatePairImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getEvaluatePair()
	 * @generated
	 */
	int EVALUATE_PAIR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Evaluate Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Evaluate Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.CriteriaImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcda.demo1.impl.ComparisonPairImpl <em>Comparison Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcda.demo1.impl.ComparisonPairImpl
	 * @see mcda.demo1.impl.mcdaPackageImpl#getComparisonPair()
	 * @generated
	 */
	int COMPARISON_PAIR = 11;

	/**
	 * The feature id for the '<em><b>Criteria1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PAIR__CRITERIA1 = 0;

	/**
	 * The feature id for the '<em><b>Criteria2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PAIR__CRITERIA2 = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PAIR__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Comparison Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PAIR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Comparison Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_PAIR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mcda.demo1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see mcda.demo1.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link mcda.demo1.Task#getHaveOperation <em>Have Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Have Operation</em>'.
	 * @see mcda.demo1.Task#getHaveOperation()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HaveOperation();

	/**
	 * Returns the meta object for the containment reference '{@link mcda.demo1.Task#getDefineType <em>Define Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Define Type</em>'.
	 * @see mcda.demo1.Task#getDefineType()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DefineType();

	/**
	 * Returns the meta object for the containment reference list '{@link mcda.demo1.Task#getHaveOption <em>Have Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Have Option</em>'.
	 * @see mcda.demo1.Task#getHaveOption()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HaveOption();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mcda.demo1.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mcda.demo1.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.operation <em>operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operation</em>'.
	 * @see mcda.demo1.operation
	 * @generated
	 */
	EClass getoperation();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see mcda.demo1.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Filter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see mcda.demo1.Filter#getTarget()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Target();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Filter#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see mcda.demo1.Filter#getOp()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Op();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Filter#getCriteriaName <em>Criteria Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria Name</em>'.
	 * @see mcda.demo1.Filter#getCriteriaName()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_CriteriaName();

	/**
	 * Returns the meta object for the reference '{@link mcda.demo1.Filter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see mcda.demo1.Filter#getFilter()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Filter();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.Analyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyze</em>'.
	 * @see mcda.demo1.Analyze
	 * @generated
	 */
	EClass getAnalyze();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Analyze#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see mcda.demo1.Analyze#getMethod()
	 * @see #getAnalyze()
	 * @generated
	 */
	EAttribute getAnalyze_Method();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.Evaluate <em>Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate</em>'.
	 * @see mcda.demo1.Evaluate
	 * @generated
	 */
	EClass getEvaluate();

	/**
	 * Returns the meta object for the containment reference list '{@link mcda.demo1.Evaluate#getContain <em>Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain</em>'.
	 * @see mcda.demo1.Evaluate#getContain()
	 * @see #getEvaluate()
	 * @generated
	 */
	EReference getEvaluate_Contain();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Evaluate#getCriteriaName <em>Criteria Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria Name</em>'.
	 * @see mcda.demo1.Evaluate#getCriteriaName()
	 * @see #getEvaluate()
	 * @generated
	 */
	EAttribute getEvaluate_CriteriaName();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see mcda.demo1.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.File#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see mcda.demo1.File#getURL()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_URL();

	/**
	 * Returns the meta object for the reference list '{@link mcda.demo1.File#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see mcda.demo1.File#getImport()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Import();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Type</em>'.
	 * @see mcda.demo1.OptionType
	 * @generated
	 */
	EClass getOptionType();

	/**
	 * Returns the meta object for the containment reference '{@link mcda.demo1.OptionType#getCompareWeight <em>Compare Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compare Weight</em>'.
	 * @see mcda.demo1.OptionType#getCompareWeight()
	 * @see #getOptionType()
	 * @generated
	 */
	EReference getOptionType_CompareWeight();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.OptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mcda.demo1.OptionType#getName()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mcda.demo1.OptionType#getDefineCriteria <em>Define Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Define Criteria</em>'.
	 * @see mcda.demo1.OptionType#getDefineCriteria()
	 * @see #getOptionType()
	 * @generated
	 */
	EReference getOptionType_DefineCriteria();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.option <em>option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>option</em>'.
	 * @see mcda.demo1.option
	 * @generated
	 */
	EClass getoption();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mcda.demo1.option#getName()
	 * @see #getoption()
	 * @generated
	 */
	EAttribute getoption_Name();

	/**
	 * Returns the meta object for the attribute list '{@link mcda.demo1.option#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute</em>'.
	 * @see mcda.demo1.option#getAttribute()
	 * @see #getoption()
	 * @generated
	 */
	EAttribute getoption_Attribute();

	/**
	 * Returns the meta object for the reference '{@link mcda.demo1.option#getInstanceof <em>Instanceof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instanceof</em>'.
	 * @see mcda.demo1.option#getInstanceof()
	 * @see #getoption()
	 * @generated
	 */
	EReference getoption_Instanceof();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.option#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mcda.demo1.option#getDescription()
	 * @see #getoption()
	 * @generated
	 */
	EAttribute getoption_Description();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.ComparisonMatrix <em>Comparison Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Matrix</em>'.
	 * @see mcda.demo1.ComparisonMatrix
	 * @generated
	 */
	EClass getComparisonMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link mcda.demo1.ComparisonMatrix#getMakeupof <em>Makeupof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Makeupof</em>'.
	 * @see mcda.demo1.ComparisonMatrix#getMakeupof()
	 * @see #getComparisonMatrix()
	 * @generated
	 */
	EReference getComparisonMatrix_Makeupof();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.EvaluatePair <em>Evaluate Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Pair</em>'.
	 * @see mcda.demo1.EvaluatePair
	 * @generated
	 */
	EClass getEvaluatePair();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.EvaluatePair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mcda.demo1.EvaluatePair#getName()
	 * @see #getEvaluatePair()
	 * @generated
	 */
	EAttribute getEvaluatePair_Name();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.EvaluatePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mcda.demo1.EvaluatePair#getValue()
	 * @see #getEvaluatePair()
	 * @generated
	 */
	EAttribute getEvaluatePair_Value();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see mcda.demo1.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.Criteria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mcda.demo1.Criteria#getName()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Name();

	/**
	 * Returns the meta object for class '{@link mcda.demo1.ComparisonPair <em>Comparison Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Pair</em>'.
	 * @see mcda.demo1.ComparisonPair
	 * @generated
	 */
	EClass getComparisonPair();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.ComparisonPair#getCriteria1 <em>Criteria1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria1</em>'.
	 * @see mcda.demo1.ComparisonPair#getCriteria1()
	 * @see #getComparisonPair()
	 * @generated
	 */
	EAttribute getComparisonPair_Criteria1();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.ComparisonPair#getCriteria2 <em>Criteria2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria2</em>'.
	 * @see mcda.demo1.ComparisonPair#getCriteria2()
	 * @see #getComparisonPair()
	 * @generated
	 */
	EAttribute getComparisonPair_Criteria2();

	/**
	 * Returns the meta object for the attribute '{@link mcda.demo1.ComparisonPair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mcda.demo1.ComparisonPair#getValue()
	 * @see #getComparisonPair()
	 * @generated
	 */
	EAttribute getComparisonPair_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	mcdaFactory getmcdaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.TaskImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Have Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAVE_OPERATION = eINSTANCE.getTask_HaveOperation();

		/**
		 * The meta object literal for the '<em><b>Define Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEFINE_TYPE = eINSTANCE.getTask_DefineType();

		/**
		 * The meta object literal for the '<em><b>Have Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAVE_OPTION = eINSTANCE.getTask_HaveOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.operationImpl <em>operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.operationImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getoperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getoperation();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.FilterImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__TARGET = eINSTANCE.getFilter_Target();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__OP = eINSTANCE.getFilter_Op();

		/**
		 * The meta object literal for the '<em><b>Criteria Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__CRITERIA_NAME = eINSTANCE.getFilter_CriteriaName();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER = eINSTANCE.getFilter_Filter();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.AnalyzeImpl <em>Analyze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.AnalyzeImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getAnalyze()
		 * @generated
		 */
		EClass ANALYZE = eINSTANCE.getAnalyze();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZE__METHOD = eINSTANCE.getAnalyze_Method();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.EvaluateImpl <em>Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.EvaluateImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getEvaluate()
		 * @generated
		 */
		EClass EVALUATE = eINSTANCE.getEvaluate();

		/**
		 * The meta object literal for the '<em><b>Contain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE__CONTAIN = eINSTANCE.getEvaluate_Contain();

		/**
		 * The meta object literal for the '<em><b>Criteria Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE__CRITERIA_NAME = eINSTANCE.getEvaluate_CriteriaName();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.FileImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__URL = eINSTANCE.getFile_URL();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__IMPORT = eINSTANCE.getFile_Import();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.OptionTypeImpl <em>Option Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.OptionTypeImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getOptionType()
		 * @generated
		 */
		EClass OPTION_TYPE = eINSTANCE.getOptionType();

		/**
		 * The meta object literal for the '<em><b>Compare Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_TYPE__COMPARE_WEIGHT = eINSTANCE.getOptionType_CompareWeight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_TYPE__NAME = eINSTANCE.getOptionType_Name();

		/**
		 * The meta object literal for the '<em><b>Define Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_TYPE__DEFINE_CRITERIA = eINSTANCE.getOptionType_DefineCriteria();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.optionImpl <em>option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.optionImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getoption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getoption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getoption_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__ATTRIBUTE = eINSTANCE.getoption_Attribute();

		/**
		 * The meta object literal for the '<em><b>Instanceof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__INSTANCEOF = eINSTANCE.getoption_Instanceof();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__DESCRIPTION = eINSTANCE.getoption_Description();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.ComparisonMatrixImpl <em>Comparison Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.ComparisonMatrixImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getComparisonMatrix()
		 * @generated
		 */
		EClass COMPARISON_MATRIX = eINSTANCE.getComparisonMatrix();

		/**
		 * The meta object literal for the '<em><b>Makeupof</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_MATRIX__MAKEUPOF = eINSTANCE.getComparisonMatrix_Makeupof();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.EvaluatePairImpl <em>Evaluate Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.EvaluatePairImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getEvaluatePair()
		 * @generated
		 */
		EClass EVALUATE_PAIR = eINSTANCE.getEvaluatePair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE_PAIR__NAME = eINSTANCE.getEvaluatePair_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE_PAIR__VALUE = eINSTANCE.getEvaluatePair_Value();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.CriteriaImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__NAME = eINSTANCE.getCriteria_Name();

		/**
		 * The meta object literal for the '{@link mcda.demo1.impl.ComparisonPairImpl <em>Comparison Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcda.demo1.impl.ComparisonPairImpl
		 * @see mcda.demo1.impl.mcdaPackageImpl#getComparisonPair()
		 * @generated
		 */
		EClass COMPARISON_PAIR = eINSTANCE.getComparisonPair();

		/**
		 * The meta object literal for the '<em><b>Criteria1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_PAIR__CRITERIA1 = eINSTANCE.getComparisonPair_Criteria1();

		/**
		 * The meta object literal for the '<em><b>Criteria2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_PAIR__CRITERIA2 = eINSTANCE.getComparisonPair_Criteria2();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_PAIR__VALUE = eINSTANCE.getComparisonPair_Value();

	}

} //mcdaPackage
