/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.PersonImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonImpl#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends DocumentedNamedStringIdentityImpl implements Person {
	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateOfBirth() {
		return (Date)eDynamicGet(FamilyPackage.PERSON__DATE_OF_BIRTH, FamilyPackage.Literals.PERSON__DATE_OF_BIRTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateOfBirth(Date newDateOfBirth) {
		eDynamicSet(FamilyPackage.PERSON__DATE_OF_BIRTH, FamilyPackage.Literals.PERSON__DATE_OF_BIRTH, newDateOfBirth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getChildren() {
		return (EList<Person>)eDynamicGet(FamilyPackage.PERSON__CHILDREN, FamilyPackage.Literals.PERSON__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getParents() {
		return (EList<Person>)eDynamicGet(FamilyPackage.PERSON__PARENTS, FamilyPackage.Literals.PERSON__PARENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Woman getMother() {
		return basicGetMother();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Woman basicGetMother() {
		return getParents()
				.stream()
				.filter(Woman.class::isInstance)
				.map(Woman.class::cast)
				.findFirst()
				.orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMother(Woman newMother) {
		Woman oldMother = getMother();
		if (newMother != oldMother) {
			EList<Person> parents = getParents();
			if (newMother == null) {
				parents.remove(oldMother);
			} else if (oldMother == null) {
				parents.add(newMother);
			} else {
				parents.set(parents.indexOf(oldMother), newMother);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Man getFather() {
		return basicGetFather();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Man basicGetFather() {
		return getParents()
				.stream()
				.filter(Man.class::isInstance)
				.map(Man.class::cast)
				.findFirst()
				.orElse(null);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFather(Man newFather) {
		Man oldFather = getFather();
		if (newFather != oldFather) {
			EList<Person> parents = getParents();
			if (newFather == null) {
				parents.remove(oldFather);
			} else if (oldFather == null) {
				parents.add(newFather);
			} else {
				parents.set(parents.indexOf(oldFather), newFather);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.PERSON__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case FamilyPackage.PERSON__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.PERSON__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FamilyPackage.PERSON__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
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
			case FamilyPackage.PERSON__DATE_OF_BIRTH:
				return getDateOfBirth();
			case FamilyPackage.PERSON__CHILDREN:
				return getChildren();
			case FamilyPackage.PERSON__PARENTS:
				return getParents();
			case FamilyPackage.PERSON__MOTHER:
				if (resolve) return getMother();
				return basicGetMother();
			case FamilyPackage.PERSON__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
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
			case FamilyPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth((Date)newValue);
				return;
			case FamilyPackage.PERSON__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Person>)newValue);
				return;
			case FamilyPackage.PERSON__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Person>)newValue);
				return;
			case FamilyPackage.PERSON__MOTHER:
				setMother((Woman)newValue);
				return;
			case FamilyPackage.PERSON__FATHER:
				setFather((Man)newValue);
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
			case FamilyPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case FamilyPackage.PERSON__CHILDREN:
				getChildren().clear();
				return;
			case FamilyPackage.PERSON__PARENTS:
				getParents().clear();
				return;
			case FamilyPackage.PERSON__MOTHER:
				setMother((Woman)null);
				return;
			case FamilyPackage.PERSON__FATHER:
				setFather((Man)null);
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
			case FamilyPackage.PERSON__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? getDateOfBirth() != null : !DATE_OF_BIRTH_EDEFAULT.equals(getDateOfBirth());
			case FamilyPackage.PERSON__CHILDREN:
				return !getChildren().isEmpty();
			case FamilyPackage.PERSON__PARENTS:
				return !getParents().isEmpty();
			case FamilyPackage.PERSON__MOTHER:
				return basicGetMother() != null;
			case FamilyPackage.PERSON__FATHER:
				return basicGetFather() != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
