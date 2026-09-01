/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.Event;
import org.nasdanika.models.family.EventKind;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Media;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.EventImpl#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends org.nasdanika.models.nxcore.impl.EventImpl implements Event {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXref() {
		return (String)eDynamicGet(FamilyPackage.EVENT__XREF, FamilyPackage.Literals.RECORD__XREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(String newXref) {
		eDynamicSet(FamilyPackage.EVENT__XREF, FamilyPackage.Literals.RECORD__XREF, newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Citation> getCitations() {
		return (EList<Citation>)eDynamicGet(FamilyPackage.EVENT__CITATIONS, FamilyPackage.Literals.RECORD__CITATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind getKind() {
		return (EventKind)eDynamicGet(FamilyPackage.EVENT__KIND, FamilyPackage.Literals.EVENT__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind basicGetKind() {
		return (EventKind)eDynamicGet(FamilyPackage.EVENT__KIND, FamilyPackage.Literals.EVENT__KIND, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EventKind newKind) {
		eDynamicSet(FamilyPackage.EVENT__KIND, FamilyPackage.Literals.EVENT__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return (String)eDynamicGet(FamilyPackage.EVENT__DATE, FamilyPackage.Literals.EVENT__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		eDynamicSet(FamilyPackage.EVENT__DATE, FamilyPackage.Literals.EVENT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return (String)eDynamicGet(FamilyPackage.EVENT__PLACE, FamilyPackage.Literals.EVENT__PLACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		eDynamicSet(FamilyPackage.EVENT__PLACE, FamilyPackage.Literals.EVENT__PLACE, newPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(FamilyPackage.EVENT__VALUE, FamilyPackage.Literals.EVENT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(FamilyPackage.EVENT__VALUE, FamilyPackage.Literals.EVENT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Media> getMedia() {
		return (EList<Media>)eDynamicGet(FamilyPackage.EVENT__MEDIA, FamilyPackage.Literals.EVENT__MEDIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.EVENT__CITATIONS:
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
			case FamilyPackage.EVENT__XREF:
				return getXref();
			case FamilyPackage.EVENT__CITATIONS:
				return getCitations();
			case FamilyPackage.EVENT__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case FamilyPackage.EVENT__DATE:
				return getDate();
			case FamilyPackage.EVENT__PLACE:
				return getPlace();
			case FamilyPackage.EVENT__VALUE:
				return getValue();
			case FamilyPackage.EVENT__MEDIA:
				return getMedia();
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
			case FamilyPackage.EVENT__XREF:
				setXref((String)newValue);
				return;
			case FamilyPackage.EVENT__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends Citation>)newValue);
				return;
			case FamilyPackage.EVENT__KIND:
				setKind((EventKind)newValue);
				return;
			case FamilyPackage.EVENT__DATE:
				setDate((String)newValue);
				return;
			case FamilyPackage.EVENT__PLACE:
				setPlace((String)newValue);
				return;
			case FamilyPackage.EVENT__VALUE:
				setValue((String)newValue);
				return;
			case FamilyPackage.EVENT__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends Media>)newValue);
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
			case FamilyPackage.EVENT__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case FamilyPackage.EVENT__CITATIONS:
				getCitations().clear();
				return;
			case FamilyPackage.EVENT__KIND:
				setKind((EventKind)null);
				return;
			case FamilyPackage.EVENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FamilyPackage.EVENT__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case FamilyPackage.EVENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FamilyPackage.EVENT__MEDIA:
				getMedia().clear();
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
			case FamilyPackage.EVENT__XREF:
				return XREF_EDEFAULT == null ? getXref() != null : !XREF_EDEFAULT.equals(getXref());
			case FamilyPackage.EVENT__CITATIONS:
				return !getCitations().isEmpty();
			case FamilyPackage.EVENT__KIND:
				return basicGetKind() != null;
			case FamilyPackage.EVENT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case FamilyPackage.EVENT__PLACE:
				return PLACE_EDEFAULT == null ? getPlace() != null : !PLACE_EDEFAULT.equals(getPlace());
			case FamilyPackage.EVENT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case FamilyPackage.EVENT__MEDIA:
				return !getMedia().isEmpty();
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
				case FamilyPackage.EVENT__XREF: return FamilyPackage.RECORD__XREF;
				case FamilyPackage.EVENT__CITATIONS: return FamilyPackage.RECORD__CITATIONS;
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
				case FamilyPackage.RECORD__XREF: return FamilyPackage.EVENT__XREF;
				case FamilyPackage.RECORD__CITATIONS: return FamilyPackage.EVENT__CITATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EventImpl
