/**
 */
package mcda.demo1.impl;

import mcda.demo1.Filter;
import mcda.demo1.mcdaPackage;
import mcda.demo1.option;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.FilterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mcda.demo1.impl.FilterImpl#getOp <em>Op</em>}</li>
 *   <li>{@link mcda.demo1.impl.FilterImpl#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link mcda.demo1.impl.FilterImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends operationImpl implements Filter {
	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected String op = OP_EDEFAULT;

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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected option filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.FILTER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(String newOp) {
		String oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.FILTER__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.FILTER__CRITERIA_NAME, oldCriteriaName, criteriaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public option getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (option)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mcdaPackage.FILTER__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public option basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(option newFilter) {
		option oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.FILTER__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case mcdaPackage.FILTER__TARGET:
				return getTarget();
			case mcdaPackage.FILTER__OP:
				return getOp();
			case mcdaPackage.FILTER__CRITERIA_NAME:
				return getCriteriaName();
			case mcdaPackage.FILTER__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
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
			case mcdaPackage.FILTER__TARGET:
				setTarget((String)newValue);
				return;
			case mcdaPackage.FILTER__OP:
				setOp((String)newValue);
				return;
			case mcdaPackage.FILTER__CRITERIA_NAME:
				setCriteriaName((String)newValue);
				return;
			case mcdaPackage.FILTER__FILTER:
				setFilter((option)newValue);
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
			case mcdaPackage.FILTER__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case mcdaPackage.FILTER__OP:
				setOp(OP_EDEFAULT);
				return;
			case mcdaPackage.FILTER__CRITERIA_NAME:
				setCriteriaName(CRITERIA_NAME_EDEFAULT);
				return;
			case mcdaPackage.FILTER__FILTER:
				setFilter((option)null);
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
			case mcdaPackage.FILTER__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case mcdaPackage.FILTER__OP:
				return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
			case mcdaPackage.FILTER__CRITERIA_NAME:
				return CRITERIA_NAME_EDEFAULT == null ? criteriaName != null : !CRITERIA_NAME_EDEFAULT.equals(criteriaName);
			case mcdaPackage.FILTER__FILTER:
				return filter != null;
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
		result.append(" (target: ");
		result.append(target);
		result.append(", op: ");
		result.append(op);
		result.append(", criteriaName: ");
		result.append(criteriaName);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
