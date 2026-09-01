/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.architecture.impl.RelationshipImpl;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.Event;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Kinship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kinship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.KinshipImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.KinshipImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.KinshipImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinshipImpl extends RelationshipImpl implements Kinship {
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
	protected KinshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.KINSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXref() {
		return (String)eDynamicGet(FamilyPackage.KINSHIP__XREF, FamilyPackage.Literals.RECORD__XREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(String newXref) {
		eDynamicSet(FamilyPackage.KINSHIP__XREF, FamilyPackage.Literals.RECORD__XREF, newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Citation> getCitations() {
		return (EList<Citation>)eDynamicGet(FamilyPackage.KINSHIP__CITATIONS, FamilyPackage.Literals.RECORD__CITATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eDynamicGet(FamilyPackage.KINSHIP__EVENTS, FamilyPackage.Literals.KINSHIP__EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.KINSHIP__CITATIONS:
				return ((InternalEList<?>)getCitations()).basicRemove(otherEnd, msgs);
			case FamilyPackage.KINSHIP__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case FamilyPackage.KINSHIP__XREF:
				return getXref();
			case FamilyPackage.KINSHIP__CITATIONS:
				return getCitations();
			case FamilyPackage.KINSHIP__EVENTS:
				return getEvents();
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
			case FamilyPackage.KINSHIP__XREF:
				setXref((String)newValue);
				return;
			case FamilyPackage.KINSHIP__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends Citation>)newValue);
				return;
			case FamilyPackage.KINSHIP__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case FamilyPackage.KINSHIP__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case FamilyPackage.KINSHIP__CITATIONS:
				getCitations().clear();
				return;
			case FamilyPackage.KINSHIP__EVENTS:
				getEvents().clear();
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
			case FamilyPackage.KINSHIP__XREF:
				return XREF_EDEFAULT == null ? getXref() != null : !XREF_EDEFAULT.equals(getXref());
			case FamilyPackage.KINSHIP__CITATIONS:
				return !getCitations().isEmpty();
			case FamilyPackage.KINSHIP__EVENTS:
				return !getEvents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.nasdanika.models.family.Record.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.KINSHIP__XREF: return FamilyPackage.RECORD__XREF;
				case FamilyPackage.KINSHIP__CITATIONS: return FamilyPackage.RECORD__CITATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.nasdanika.models.family.Record.class) {
			switch (baseFeatureID) {
				case FamilyPackage.RECORD__XREF: return FamilyPackage.KINSHIP__XREF;
				case FamilyPackage.RECORD__CITATIONS: return FamilyPackage.KINSHIP__CITATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //KinshipImpl
