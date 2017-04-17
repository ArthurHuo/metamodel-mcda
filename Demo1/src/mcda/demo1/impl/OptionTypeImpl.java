/**
 */
package mcda.demo1.impl;

import java.util.Collection;

import mcda.demo1.ComparisonMatrix;
import mcda.demo1.Criteria;
import mcda.demo1.OptionType;
import mcda.demo1.mcdaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.OptionTypeImpl#getCompareWeight <em>Compare Weight</em>}</li>
 *   <li>{@link mcda.demo1.impl.OptionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link mcda.demo1.impl.OptionTypeImpl#getDefineCriteria <em>Define Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionTypeImpl extends MinimalEObjectImpl.Container implements OptionType {
	/**
	 * The cached value of the '{@link #getCompareWeight() <em>Compare Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareWeight()
	 * @generated
	 * @ordered
	 */
	protected ComparisonMatrix compareWeight;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefineCriteria() <em>Define Criteria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> defineCriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.OPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonMatrix getCompareWeight() {
		return compareWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareWeight(ComparisonMatrix newCompareWeight, NotificationChain msgs) {
		ComparisonMatrix oldCompareWeight = compareWeight;
		compareWeight = newCompareWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT, oldCompareWeight, newCompareWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareWeight(ComparisonMatrix newCompareWeight) {
		if (newCompareWeight != compareWeight) {
			NotificationChain msgs = null;
			if (compareWeight != null)
				msgs = ((InternalEObject)compareWeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT, null, msgs);
			if (newCompareWeight != null)
				msgs = ((InternalEObject)newCompareWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT, null, msgs);
			msgs = basicSetCompareWeight(newCompareWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT, newCompareWeight, newCompareWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.OPTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getDefineCriteria() {
		if (defineCriteria == null) {
			defineCriteria = new EObjectContainmentEList<Criteria>(Criteria.class, this, mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA);
		}
		return defineCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT:
				return basicSetCompareWeight(null, msgs);
			case mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA:
				return ((InternalEList<?>)getDefineCriteria()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT:
				return getCompareWeight();
			case mcdaPackage.OPTION_TYPE__NAME:
				return getName();
			case mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA:
				return getDefineCriteria();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT:
				setCompareWeight((ComparisonMatrix)newValue);
				return;
			case mcdaPackage.OPTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA:
				getDefineCriteria().clear();
				getDefineCriteria().addAll((Collection<? extends Criteria>)newValue);
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
			case mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT:
				setCompareWeight((ComparisonMatrix)null);
				return;
			case mcdaPackage.OPTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA:
				getDefineCriteria().clear();
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
			case mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT:
				return compareWeight != null;
			case mcdaPackage.OPTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA:
				return defineCriteria != null && !defineCriteria.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OptionTypeImpl
