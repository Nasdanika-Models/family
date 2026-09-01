/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.family.EventKind;
import org.nasdanika.models.family.FamilyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.EventKindImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventKindImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventKindImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventKindImpl extends MinimalEObjectImpl.Container implements EventKind {
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
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventKindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.EVENT_KIND;
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
	public String getName() {
		return (String)eDynamicGet(FamilyPackage.EVENT_KIND__NAME, FamilyPackage.Literals.EVENT_KIND__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(FamilyPackage.EVENT_KIND__NAME, FamilyPackage.Literals.EVENT_KIND__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind getSuperType() {
		return (EventKind)eDynamicGet(FamilyPackage.EVENT_KIND__SUPER_TYPE, FamilyPackage.Literals.EVENT_KIND__SUPER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind basicGetSuperType() {
		return (EventKind)eDynamicGet(FamilyPackage.EVENT_KIND__SUPER_TYPE, FamilyPackage.Literals.EVENT_KIND__SUPER_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(EventKind newSuperType) {
		eDynamicSet(FamilyPackage.EVENT_KIND__SUPER_TYPE, FamilyPackage.Literals.EVENT_KIND__SUPER_TYPE, newSuperType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return (String)eDynamicGet(FamilyPackage.EVENT_KIND__TAG, FamilyPackage.Literals.EVENT_KIND__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		eDynamicSet(FamilyPackage.EVENT_KIND__TAG, FamilyPackage.Literals.EVENT_KIND__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.EVENT_KIND__NAME:
				return getName();
			case FamilyPackage.EVENT_KIND__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case FamilyPackage.EVENT_KIND__TAG:
				return getTag();
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
			case FamilyPackage.EVENT_KIND__NAME:
				setName((String)newValue);
				return;
			case FamilyPackage.EVENT_KIND__SUPER_TYPE:
				setSuperType((EventKind)newValue);
				return;
			case FamilyPackage.EVENT_KIND__TAG:
				setTag((String)newValue);
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
			case FamilyPackage.EVENT_KIND__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FamilyPackage.EVENT_KIND__SUPER_TYPE:
				setSuperType((EventKind)null);
				return;
			case FamilyPackage.EVENT_KIND__TAG:
				setTag(TAG_EDEFAULT);
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
			case FamilyPackage.EVENT_KIND__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case FamilyPackage.EVENT_KIND__SUPER_TYPE:
				return basicGetSuperType() != null;
			case FamilyPackage.EVENT_KIND__TAG:
				return TAG_EDEFAULT == null ? getTag() != null : !TAG_EDEFAULT.equals(getTag());
		}
		return super.eIsSet(featureID);
	}

} //EventKindImpl
