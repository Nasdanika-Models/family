/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.architecture.AbstractElement;
import org.nasdanika.models.architecture.ArchitecturePackage;
import org.nasdanika.models.architecture.Element;
import org.nasdanika.models.architecture.ElementKind;
import org.nasdanika.models.architecture.Relationship;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.Event;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Media;
import org.nasdanika.models.family.Member;
import org.nasdanika.models.family.PersonalName;
import org.nasdanika.models.family.Sex;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.orgdesign.impl.PersonImpl;

import org.nasdanika.models.work.AbstractWork;
import org.nasdanika.models.work.WorkPackage;
import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getOutgoingRelationships <em>Outgoing Relationships</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getXref <em>Xref</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getCitations <em>Citations</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getNames <em>Names</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MemberImpl#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends PersonImpl implements Member {
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
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final Sex SEX_EDEFAULT = Sex.UNKNOWN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(FamilyPackage.MEMBER__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(FamilyPackage.MEMBER__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(FamilyPackage.MEMBER__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractWork> getWork() {
		return (EList<AbstractWork>)eDynamicGet(FamilyPackage.MEMBER__WORK, WorkPackage.Literals.WORKABLE__WORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relationship> getOutgoingRelationships() {
		return (EList<Relationship>)eDynamicGet(FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS, ArchitecturePackage.Literals.ABSTRACT_ELEMENT__OUTGOING_RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementKind getKind() {
		return (ElementKind)eDynamicGet(FamilyPackage.MEMBER__KIND, ArchitecturePackage.Literals.ELEMENT__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementKind basicGetKind() {
		return (ElementKind)eDynamicGet(FamilyPackage.MEMBER__KIND, ArchitecturePackage.Literals.ELEMENT__KIND, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ElementKind newKind) {
		eDynamicSet(FamilyPackage.MEMBER__KIND, ArchitecturePackage.Literals.ELEMENT__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractElement> getElements() {
		return (EList<AbstractElement>)eDynamicGet(FamilyPackage.MEMBER__ELEMENTS, ArchitecturePackage.Literals.ELEMENT__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXref() {
		return (String)eDynamicGet(FamilyPackage.MEMBER__XREF, FamilyPackage.Literals.RECORD__XREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXref(String newXref) {
		eDynamicSet(FamilyPackage.MEMBER__XREF, FamilyPackage.Literals.RECORD__XREF, newXref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Citation> getCitations() {
		return (EList<Citation>)eDynamicGet(FamilyPackage.MEMBER__CITATIONS, FamilyPackage.Literals.RECORD__CITATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex getSex() {
		return (Sex)eDynamicGet(FamilyPackage.MEMBER__SEX, FamilyPackage.Literals.MEMBER__SEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(Sex newSex) {
		eDynamicSet(FamilyPackage.MEMBER__SEX, FamilyPackage.Literals.MEMBER__SEX, newSex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PersonalName> getNames() {
		return (EList<PersonalName>)eDynamicGet(FamilyPackage.MEMBER__NAMES, FamilyPackage.Literals.MEMBER__NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eDynamicGet(FamilyPackage.MEMBER__EVENTS, FamilyPackage.Literals.MEMBER__EVENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Media> getMedia() {
		return (EList<Media>)eDynamicGet(FamilyPackage.MEMBER__MEDIA, FamilyPackage.Literals.MEMBER__MEDIA, true, true);
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case FamilyPackage.MEMBER__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case FamilyPackage.MEMBER__WAIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWaivers()).basicAdd(otherEnd, msgs);
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS:
				return ((InternalEList<?>)getOutgoingRelationships()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__CITATIONS:
				return ((InternalEList<?>)getCitations()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__NAMES:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MEMBER__EVENTS:
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				return getControlApplications();
			case FamilyPackage.MEMBER__RISKS:
				return getRisks();
			case FamilyPackage.MEMBER__WAIVERS:
				return getWaivers();
			case FamilyPackage.MEMBER__WORK:
				return getWork();
			case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS:
				return getOutgoingRelationships();
			case FamilyPackage.MEMBER__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case FamilyPackage.MEMBER__ELEMENTS:
				return getElements();
			case FamilyPackage.MEMBER__XREF:
				return getXref();
			case FamilyPackage.MEMBER__CITATIONS:
				return getCitations();
			case FamilyPackage.MEMBER__SEX:
				return getSex();
			case FamilyPackage.MEMBER__NAMES:
				return getNames();
			case FamilyPackage.MEMBER__EVENTS:
				return getEvents();
			case FamilyPackage.MEMBER__MEDIA:
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case FamilyPackage.MEMBER__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case FamilyPackage.MEMBER__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case FamilyPackage.MEMBER__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends AbstractWork>)newValue);
				return;
			case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				getOutgoingRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case FamilyPackage.MEMBER__KIND:
				setKind((ElementKind)newValue);
				return;
			case FamilyPackage.MEMBER__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends AbstractElement>)newValue);
				return;
			case FamilyPackage.MEMBER__XREF:
				setXref((String)newValue);
				return;
			case FamilyPackage.MEMBER__CITATIONS:
				getCitations().clear();
				getCitations().addAll((Collection<? extends Citation>)newValue);
				return;
			case FamilyPackage.MEMBER__SEX:
				setSex((Sex)newValue);
				return;
			case FamilyPackage.MEMBER__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends PersonalName>)newValue);
				return;
			case FamilyPackage.MEMBER__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case FamilyPackage.MEMBER__MEDIA:
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case FamilyPackage.MEMBER__RISKS:
				getRisks().clear();
				return;
			case FamilyPackage.MEMBER__WAIVERS:
				getWaivers().clear();
				return;
			case FamilyPackage.MEMBER__WORK:
				getWork().clear();
				return;
			case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS:
				getOutgoingRelationships().clear();
				return;
			case FamilyPackage.MEMBER__KIND:
				setKind((ElementKind)null);
				return;
			case FamilyPackage.MEMBER__ELEMENTS:
				getElements().clear();
				return;
			case FamilyPackage.MEMBER__XREF:
				setXref(XREF_EDEFAULT);
				return;
			case FamilyPackage.MEMBER__CITATIONS:
				getCitations().clear();
				return;
			case FamilyPackage.MEMBER__SEX:
				setSex(SEX_EDEFAULT);
				return;
			case FamilyPackage.MEMBER__NAMES:
				getNames().clear();
				return;
			case FamilyPackage.MEMBER__EVENTS:
				getEvents().clear();
				return;
			case FamilyPackage.MEMBER__MEDIA:
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
			case FamilyPackage.MEMBER__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case FamilyPackage.MEMBER__RISKS:
				return !getRisks().isEmpty();
			case FamilyPackage.MEMBER__WAIVERS:
				return !getWaivers().isEmpty();
			case FamilyPackage.MEMBER__WORK:
				return !getWork().isEmpty();
			case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS:
				return !getOutgoingRelationships().isEmpty();
			case FamilyPackage.MEMBER__KIND:
				return basicGetKind() != null;
			case FamilyPackage.MEMBER__ELEMENTS:
				return !getElements().isEmpty();
			case FamilyPackage.MEMBER__XREF:
				return XREF_EDEFAULT == null ? getXref() != null : !XREF_EDEFAULT.equals(getXref());
			case FamilyPackage.MEMBER__CITATIONS:
				return !getCitations().isEmpty();
			case FamilyPackage.MEMBER__SEX:
				return getSex() != SEX_EDEFAULT;
			case FamilyPackage.MEMBER__NAMES:
				return !getNames().isEmpty();
			case FamilyPackage.MEMBER__EVENTS:
				return !getEvents().isEmpty();
			case FamilyPackage.MEMBER__MEDIA:
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
		if (baseClass == Governed.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.MEMBER__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case FamilyPackage.MEMBER__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case FamilyPackage.MEMBER__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.MEMBER__WORK: return WorkPackage.WORKABLE__WORK;
				default: return -1;
			}
		}
		if (baseClass == AbstractElement.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS: return ArchitecturePackage.ABSTRACT_ELEMENT__OUTGOING_RELATIONSHIPS;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.MEMBER__KIND: return ArchitecturePackage.ELEMENT__KIND;
				case FamilyPackage.MEMBER__ELEMENTS: return ArchitecturePackage.ELEMENT__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.models.family.Record.class) {
			switch (derivedFeatureID) {
				case FamilyPackage.MEMBER__XREF: return FamilyPackage.RECORD__XREF;
				case FamilyPackage.MEMBER__CITATIONS: return FamilyPackage.RECORD__CITATIONS;
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
		if (baseClass == Governed.class) {
			switch (baseFeatureID) {
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return FamilyPackage.MEMBER__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return FamilyPackage.MEMBER__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return FamilyPackage.MEMBER__WAIVERS;
				default: return -1;
			}
		}
		if (baseClass == Workable.class) {
			switch (baseFeatureID) {
				case WorkPackage.WORKABLE__WORK: return FamilyPackage.MEMBER__WORK;
				default: return -1;
			}
		}
		if (baseClass == AbstractElement.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.ABSTRACT_ELEMENT__OUTGOING_RELATIONSHIPS: return FamilyPackage.MEMBER__OUTGOING_RELATIONSHIPS;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case ArchitecturePackage.ELEMENT__KIND: return FamilyPackage.MEMBER__KIND;
				case ArchitecturePackage.ELEMENT__ELEMENTS: return FamilyPackage.MEMBER__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.models.family.Record.class) {
			switch (baseFeatureID) {
				case FamilyPackage.RECORD__XREF: return FamilyPackage.MEMBER__XREF;
				case FamilyPackage.RECORD__CITATIONS: return FamilyPackage.MEMBER__CITATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MemberImpl
