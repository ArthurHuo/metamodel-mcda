/**
 */
package mcda.demo1.impl;

import java.util.Collection;

import mcda.demo1.ComparisonMatrix;
import mcda.demo1.ComparisonPair;
import mcda.demo1.mcdaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcda.demo1.impl.ComparisonMatrixImpl#getMakeupof <em>Makeupof</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonMatrixImpl extends MinimalEObjectImpl.Container implements ComparisonMatrix {
	/**
	 * The cached value of the '{@link #getMakeupof() <em>Makeupof</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeupof()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonPair> makeupof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mcdaPackage.Literals.COMPARISON_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparisonPair> getMakeupof() {
		if (makeupof == null) {
			makeupof = new EObjectContainmentEList<ComparisonPair>(ComparisonPair.class, this, mcdaPackage.COMPARISON_MATRIX__MAKEUPOF);
		}
		return makeupof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mcdaPackage.COMPARISON_MATRIX__MAKEUPOF:
				return ((InternalEList<?>)getMakeupof()).basicRemove(otherEnd, msgs);
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
			case mcdaPackage.COMPARISON_MATRIX__MAKEUPOF:
				return getMakeupof();
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
			case mcdaPackage.COMPARISON_MATRIX__MAKEUPOF:
				getMakeupof().clear();
				getMakeupof().addAll((Collection<? extends ComparisonPair>)newValue);
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
			case mcdaPackage.COMPARISON_MATRIX__MAKEUPOF:
				getMakeupof().clear();
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
			case mcdaPackage.COMPARISON_MATRIX__MAKEUPOF:
				return makeupof != null && !makeupof.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComparisonMatrixImpl
