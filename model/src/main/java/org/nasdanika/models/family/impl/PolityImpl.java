/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Polity;
import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.PolityImpl#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PolityImpl#getResidents <em>Residents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolityImpl extends DocumentedNamedElementImpl implements Polity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.POLITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Polity> getConstituents() {
		return (EList<Polity>)eDynamicGet(FamilyPackage.POLITY__CONSTITUENTS, FamilyPackage.Literals.POLITY__CONSTITUENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getResidents() {
		return (EList<Person>)eDynamicGet(FamilyPackage.POLITY__RESIDENTS, FamilyPackage.Literals.POLITY__RESIDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.POLITY__CONSTITUENTS:
				return ((InternalEList<?>)getConstituents()).basicRemove(otherEnd, msgs);
			case FamilyPackage.POLITY__RESIDENTS:
				return ((InternalEList<?>)getResidents()).basicRemove(otherEnd, msgs);
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
			case FamilyPackage.POLITY__CONSTITUENTS:
				return getConstituents();
			case FamilyPackage.POLITY__RESIDENTS:
				return getResidents();
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
			case FamilyPackage.POLITY__CONSTITUENTS:
				getConstituents().clear();
				getConstituents().addAll((Collection<? extends Polity>)newValue);
				return;
			case FamilyPackage.POLITY__RESIDENTS:
				getResidents().clear();
				getResidents().addAll((Collection<? extends Person>)newValue);
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
			case FamilyPackage.POLITY__CONSTITUENTS:
				getConstituents().clear();
				return;
			case FamilyPackage.POLITY__RESIDENTS:
				getResidents().clear();
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
			case FamilyPackage.POLITY__CONSTITUENTS:
				return !getConstituents().isEmpty();
			case FamilyPackage.POLITY__RESIDENTS:
				return !getResidents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PolityImpl
