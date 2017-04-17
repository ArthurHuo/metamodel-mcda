/**
 */
package mcda.demo1.impl;

import java.util.Collection;

import mcda.demo1.OptionType;
import mcda.demo1.Task;
import mcda.demo1.mcdaPackage;
import mcda.demo1.operation;
import mcda.demo1.option;

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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.TaskImpl#getHaveOperation <em>Have Operation</em>}</li>
 *   <li>{@link mcda.demo1.impl.TaskImpl#getDefineType <em>Define Type</em>}</li>
 *   <li>{@link mcda.demo1.impl.TaskImpl#getHaveOption <em>Have Option</em>}</li>
 *   <li>{@link mcda.demo1.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link mcda.demo1.impl.TaskImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getHaveOperation() <em>Have Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaveOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<operation> haveOperation;

	/**
	 * The cached value of the '{@link #getDefineType() <em>Define Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineType()
	 * @generated
	 * @ordered
	 */
	protected OptionType defineType;

	/**
	 * The cached value of the '{@link #getHaveOption() <em>Have Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaveOption()
	 * @generated
	 * @ordered
	 */
	protected EList<option> haveOption;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<operation> getHaveOperation() {
		if (haveOperation == null) {
			haveOperation = new EObjectContainmentEList<operation>(operation.class, this, mcdaPackage.TASK__HAVE_OPERATION);
		}
		return haveOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType getDefineType() {
		return defineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefineType(OptionType newDefineType, NotificationChain msgs) {
		OptionType oldDefineType = defineType;
		defineType = newDefineType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, mcdaPackage.TASK__DEFINE_TYPE, oldDefineType, newDefineType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefineType(OptionType newDefineType) {
		if (newDefineType != defineType) {
			NotificationChain msgs = null;
			if (defineType != null)
				msgs = ((InternalEObject)defineType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - mcdaPackage.TASK__DEFINE_TYPE, null, msgs);
			if (newDefineType != null)
				msgs = ((InternalEObject)newDefineType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - mcdaPackage.TASK__DEFINE_TYPE, null, msgs);
			msgs = basicSetDefineType(newDefineType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.TASK__DEFINE_TYPE, newDefineType, newDefineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<option> getHaveOption() {
		if (haveOption == null) {
			haveOption = new EObjectContainmentEList<option>(option.class, this, mcdaPackage.TASK__HAVE_OPTION);
		}
		return haveOption;
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
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mcdaPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mcdaPackage.TASK__HAVE_OPERATION:
				return ((InternalEList<?>)getHaveOperation()).basicRemove(otherEnd, msgs);
			case mcdaPackage.TASK__DEFINE_TYPE:
				return basicSetDefineType(null, msgs);
			case mcdaPackage.TASK__HAVE_OPTION:
				return ((InternalEList<?>)getHaveOption()).basicRemove(otherEnd, msgs);
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
			case mcdaPackage.TASK__HAVE_OPERATION:
				return getHaveOperation();
			case mcdaPackage.TASK__DEFINE_TYPE:
				return getDefineType();
			case mcdaPackage.TASK__HAVE_OPTION:
				return getHaveOption();
			case mcdaPackage.TASK__NAME:
				return getName();
			case mcdaPackage.TASK__DESCRIPTION:
				return getDescription();
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
			case mcdaPackage.TASK__HAVE_OPERATION:
				getHaveOperation().clear();
				getHaveOperation().addAll((Collection<? extends operation>)newValue);
				return;
			case mcdaPackage.TASK__DEFINE_TYPE:
				setDefineType((OptionType)newValue);
				return;
			case mcdaPackage.TASK__HAVE_OPTION:
				getHaveOption().clear();
				getHaveOption().addAll((Collection<? extends option>)newValue);
				return;
			case mcdaPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case mcdaPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
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
			case mcdaPackage.TASK__HAVE_OPERATION:
				getHaveOperation().clear();
				return;
			case mcdaPackage.TASK__DEFINE_TYPE:
				setDefineType((OptionType)null);
				return;
			case mcdaPackage.TASK__HAVE_OPTION:
				getHaveOption().clear();
				return;
			case mcdaPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case mcdaPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case mcdaPackage.TASK__HAVE_OPERATION:
				return haveOperation != null && !haveOperation.isEmpty();
			case mcdaPackage.TASK__DEFINE_TYPE:
				return defineType != null;
			case mcdaPackage.TASK__HAVE_OPTION:
				return haveOption != null && !haveOption.isEmpty();
			case mcdaPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case mcdaPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
