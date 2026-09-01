/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.RepositoryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.RepositoryImpl#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends RecordImpl implements Repository {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return (String)eDynamicGet(FamilyPackage.REPOSITORY__ADDRESS, FamilyPackage.Literals.REPOSITORY__ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		eDynamicSet(FamilyPackage.REPOSITORY__ADDRESS, FamilyPackage.Literals.REPOSITORY__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return (String)eDynamicGet(FamilyPackage.REPOSITORY__WEBSITE, FamilyPackage.Literals.REPOSITORY__WEBSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		eDynamicSet(FamilyPackage.REPOSITORY__WEBSITE, FamilyPackage.Literals.REPOSITORY__WEBSITE, newWebsite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.REPOSITORY__ADDRESS:
				return getAddress();
			case FamilyPackage.REPOSITORY__WEBSITE:
				return getWebsite();
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
			case FamilyPackage.REPOSITORY__ADDRESS:
				setAddress((String)newValue);
				return;
			case FamilyPackage.REPOSITORY__WEBSITE:
				setWebsite((String)newValue);
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
			case FamilyPackage.REPOSITORY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case FamilyPackage.REPOSITORY__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
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
			case FamilyPackage.REPOSITORY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
			case FamilyPackage.REPOSITORY__WEBSITE:
				return WEBSITE_EDEFAULT == null ? getWebsite() != null : !WEBSITE_EDEFAULT.equals(getWebsite());
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
