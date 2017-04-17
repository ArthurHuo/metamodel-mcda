/**
 */
package mcda.demo1.impl;

import java.util.Collection;

import mcda.demo1.Evaluate;
import mcda.demo1.EvaluatePair;
import mcda.demo1.mcdaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.EvaluateImpl#getContain <em>Contain</em>}</li>
 *   <li>{@link mcda.demo1.impl.EvaluateImpl#getCriteriaName <em>Criteria Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluateImpl extends operationImpl implements Evaluate {
	/**
	 * The cached value of the '{@link #getContain() <em>Contain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContain()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluatePair> contain;

	/**
	 * The default value of the '{@link #getCriteriaName() <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaName()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteriaName() <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaName()
	 * @generated
	 * @ordered
	 */
	protected String criteriaName = CRITERIA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.EVALUATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvaluatePair> getContain() {
		if (contain == null) {
			contain = new EObjectContainmentEList<EvaluatePair>(EvaluatePair.class, this, mcdaPackage.EVALUATE__CONTAIN);
		}
		return contain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteriaName() {
		return criteriaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaName(String newCriteriaName) {
		String oldCriteriaName = criteriaName;
		criteriaName = newCriteriaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.EVALUATE__CRITERIA_NAME, oldCriteriaName, criteriaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mcdaPackage.EVALUATE__CONTAIN:
				return ((InternalEList<?>)getContain()).basicRemove(otherEnd, msgs);
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
			case mcdaPackage.EVALUATE__CONTAIN:
				return getContain();
			case mcdaPackage.EVALUATE__CRITERIA_NAME:
				return getCriteriaName();
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
			case mcdaPackage.EVALUATE__CONTAIN:
				getContain().clear();
				getContain().addAll((Collection<? extends EvaluatePair>)newValue);
				return;
			case mcdaPackage.EVALUATE__CRITERIA_NAME:
				setCriteriaName((String)newValue);
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
			case mcdaPackage.EVALUATE__CONTAIN:
				getContain().clear();
				return;
			case mcdaPackage.EVALUATE__CRITERIA_NAME:
				setCriteriaName(CRITERIA_NAME_EDEFAULT);
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
			case mcdaPackage.EVALUATE__CONTAIN:
				return contain != null && !contain.isEmpty();
			case mcdaPackage.EVALUATE__CRITERIA_NAME:
				return CRITERIA_NAME_EDEFAULT == null ? criteriaName != null : !CRITERIA_NAME_EDEFAULT.equals(criteriaName);
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
		result.append(" (criteriaName: ");
		result.append(criteriaName);
		result.append(')');
		return result.toString();
	}

} //EvaluateImpl
