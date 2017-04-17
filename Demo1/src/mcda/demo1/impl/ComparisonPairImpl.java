/**
 */
package mcda.demo1.impl;

import mcda.demo1.ComparisonPair;
import mcda.demo1.mcdaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.ComparisonPairImpl#getCriteria1 <em>Criteria1</em>}</li>
 *   <li>{@link mcda.demo1.impl.ComparisonPairImpl#getCriteria2 <em>Criteria2</em>}</li>
 *   <li>{@link mcda.demo1.impl.ComparisonPairImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonPairImpl extends MinimalEObjectImpl.Container implements ComparisonPair {
	/**
	 * The default value of the '{@link #getCriteria1() <em>Criteria1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria1()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteria1() <em>Criteria1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria1()
	 * @generated
	 * @ordered
	 */
	protected String criteria1 = CRITERIA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriteria2() <em>Criteria2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria2()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteria2() <em>Criteria2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria2()
	 * @generated
	 * @ordered
	 */
	protected String criteria2 = CRITERIA2_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.COMPARISON_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteria1() {
		return criteria1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria1(String newCriteria1) {
		String oldCriteria1 = criteria1;
		criteria1 = newCriteria1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.COMPARISON_PAIR__CRITERIA1, oldCriteria1, criteria1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteria2() {
		return criteria2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria2(String newCriteria2) {
		String oldCriteria2 = criteria2;
		criteria2 = newCriteria2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.COMPARISON_PAIR__CRITERIA2, oldCriteria2, criteria2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.COMPARISON_PAIR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mcdaPackage.COMPARISON_PAIR__CRITERIA1:
				return getCriteria1();
			case mcdaPackage.COMPARISON_PAIR__CRITERIA2:
				return getCriteria2();
			case mcdaPackage.COMPARISON_PAIR__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mcdaPackage.COMPARISON_PAIR__CRITERIA1:
				setCriteria1((String)newValue);
				return;
			case mcdaPackage.COMPARISON_PAIR__CRITERIA2:
				setCriteria2((String)newValue);
				return;
			case mcdaPackage.COMPARISON_PAIR__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case mcdaPackage.COMPARISON_PAIR__CRITERIA1:
				setCriteria1(CRITERIA1_EDEFAULT);
				return;
			case mcdaPackage.COMPARISON_PAIR__CRITERIA2:
				setCriteria2(CRITERIA2_EDEFAULT);
				return;
			case mcdaPackage.COMPARISON_PAIR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case mcdaPackage.COMPARISON_PAIR__CRITERIA1:
				return CRITERIA1_EDEFAULT == null ? criteria1 != null : !CRITERIA1_EDEFAULT.equals(criteria1);
			case mcdaPackage.COMPARISON_PAIR__CRITERIA2:
				return CRITERIA2_EDEFAULT == null ? criteria2 != null : !CRITERIA2_EDEFAULT.equals(criteria2);
			case mcdaPackage.COMPARISON_PAIR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Criteria1: ");
		result.append(criteria1);
		result.append(", Criteria2: ");
		result.append(criteria2);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ComparisonPairImpl
