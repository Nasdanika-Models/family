/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.FamilyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.RecordImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.RecordImpl#getCitations <em>Citations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RecordImpl extends MinimalEObjectImpl.Container implements org.nasdanika.models.family.Record {
	/**
	 * The default value of the '{@link #getXref() <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXref()
	 * @generated
	 * @ordered
	 */
	protected static final String XREF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXref() {
		return (String)eDynamicGet(FamilyPackage.RECORD__XREF, FamilyPackage.Literals.RECORD__XREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(String newXref) {
		eDynamicSet(FamilyPackage.RECORD__XREF, FamilyPackage.Literals.RECORD__XREF, newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Citation> getCitations() {
		return (EList<Citation>)eDynamicGet(FamilyPackage.RECORD__CITATIONS, FamilyPackage.Literals.RECORD__CITATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.RECORD__CITATIONS:
				return ((InternalEList<?>)getCitations()).basicRemove(otherEnd, msgs);
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
			case FamilyPackage.RECORD__XREF:
				return getXref();
			case FamilyPackage.RECORD__CITATIONS:
				return getCitations();
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
			case FamilyPackage.RECORD__XREF:
				setXref((String)newValue);
				return;
			case FamilyPackage.RECORD__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends Citation>)newValue);
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
			case FamilyPackage.RECORD__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case FamilyPackage.RECORD__CITATIONS:
				getCitations().clear();
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
			case FamilyPackage.RECORD__XREF:
				return XREF_EDEFAULT == null ? getXref() != null : !XREF_EDEFAULT.equals(getXref());
			case FamilyPackage.RECORD__CITATIONS:
				return !getCitations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordImpl
