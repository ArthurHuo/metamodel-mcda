/**
 */
package mcda.demo1.impl;

import mcda.demo1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class mcdaFactoryImpl extends EFactoryImpl implements mcdaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static mcdaFactory init() {
		try {
			mcdaFactory themcdaFactory = (mcdaFactory)EPackage.Registry.INSTANCE.getEFactory(mcdaPackage.eNS_URI);
			if (themcdaFactory != null) {
				return themcdaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new mcdaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mcdaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case mcdaPackage.TASK: return createTask();
			case mcdaPackage.FILTER: return createFilter();
			case mcdaPackage.ANALYZE: return createAnalyze();
			case mcdaPackage.EVALUATE: return createEvaluate();
			case mcdaPackage.FILE: return createFile();
			case mcdaPackage.OPTION_TYPE: return createOptionType();
			case mcdaPackage.OPTION: return createoption();
			case mcdaPackage.COMPARISON_MATRIX: return createComparisonMatrix();
			case mcdaPackage.EVALUATE_PAIR: return createEvaluatePair();
			case mcdaPackage.CRITERIA: return createCriteria();
			case mcdaPackage.COMPARISON_PAIR: return createComparisonPair();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyze createAnalyze() {
		AnalyzeImpl analyze = new AnalyzeImpl();
		return analyze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluate createEvaluate() {
		EvaluateImpl evaluate = new EvaluateImpl();
		return evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public option createoption() {
		optionImpl option = new optionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonMatrix createComparisonMatrix() {
		ComparisonMatrixImpl comparisonMatrix = new ComparisonMatrixImpl();
		return comparisonMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluatePair createEvaluatePair() {
		EvaluatePairImpl evaluatePair = new EvaluatePairImpl();
		return evaluatePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criteria createCriteria() {
		CriteriaImpl criteria = new CriteriaImpl();
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonPair createComparisonPair() {
		ComparisonPairImpl comparisonPair = new ComparisonPairImpl();
		return comparisonPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mcdaPackage getmcdaPackage() {
		return (mcdaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static mcdaPackage getPackage() {
		return mcdaPackage.eINSTANCE;
	}

} //mcdaFactoryImpl
