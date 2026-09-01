/**
 */
package org.nasdanika.models.family.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.family.EventKind;
import org.nasdanika.models.family.Family;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Media;
import org.nasdanika.models.family.Member;
import org.nasdanika.models.family.Note;
import org.nasdanika.models.family.Repository;
import org.nasdanika.models.family.Source;

import org.nasdanika.models.orgdesign.impl.OrganizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.FamilyImpl#getEventKinds <em>Event Kinds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyImpl extends OrganizationImpl implements Family {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(FamilyPackage.FAMILY__MEMBERS, FamilyPackage.Literals.FAMILY__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Source> getSources() {
		return (EList<Source>)eDynamicGet(FamilyPackage.FAMILY__SOURCES, FamilyPackage.Literals.FAMILY__SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Repository> getRepositories() {
		return (EList<Repository>)eDynamicGet(FamilyPackage.FAMILY__REPOSITORIES, FamilyPackage.Literals.FAMILY__REPOSITORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Media> getMedia() {
		return (EList<Media>)eDynamicGet(FamilyPackage.FAMILY__MEDIA, FamilyPackage.Literals.FAMILY__MEDIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Note> getNotes() {
		return (EList<Note>)eDynamicGet(FamilyPackage.FAMILY__NOTES, FamilyPackage.Literals.FAMILY__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventKind> getEventKinds() {
		return (EList<EventKind>)eDynamicGet(FamilyPackage.FAMILY__EVENT_KINDS, FamilyPackage.Literals.FAMILY__EVENT_KINDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FAMILY__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FAMILY__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FAMILY__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FAMILY__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FAMILY__EVENT_KINDS:
				return ((InternalEList<?>)getEventKinds()).basicRemove(otherEnd, msgs);
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
			case FamilyPackage.FAMILY__MEMBERS:
				return getMembers();
			case FamilyPackage.FAMILY__SOURCES:
				return getSources();
			case FamilyPackage.FAMILY__REPOSITORIES:
				return getRepositories();
			case FamilyPackage.FAMILY__MEDIA:
				return getMedia();
			case FamilyPackage.FAMILY__NOTES:
				return getNotes();
			case FamilyPackage.FAMILY__EVENT_KINDS:
				return getEventKinds();
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
			case FamilyPackage.FAMILY__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case FamilyPackage.FAMILY__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case FamilyPackage.FAMILY__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case FamilyPackage.FAMILY__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends Media>)newValue);
				return;
			case FamilyPackage.FAMILY__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case FamilyPackage.FAMILY__EVENT_KINDS:
				getEventKinds().clear();
				getEventKinds().addAll((Collection<? extends EventKind>)newValue);
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
			case FamilyPackage.FAMILY__MEMBERS:
				getMembers().clear();
				return;
			case FamilyPackage.FAMILY__SOURCES:
				getSources().clear();
				return;
			case FamilyPackage.FAMILY__REPOSITORIES:
				getRepositories().clear();
				return;
			case FamilyPackage.FAMILY__MEDIA:
				getMedia().clear();
				return;
			case FamilyPackage.FAMILY__NOTES:
				getNotes().clear();
				return;
			case FamilyPackage.FAMILY__EVENT_KINDS:
				getEventKinds().clear();
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
			case FamilyPackage.FAMILY__MEMBERS:
				return !getMembers().isEmpty();
			case FamilyPackage.FAMILY__SOURCES:
				return !getSources().isEmpty();
			case FamilyPackage.FAMILY__REPOSITORIES:
				return !getRepositories().isEmpty();
			case FamilyPackage.FAMILY__MEDIA:
				return !getMedia().isEmpty();
			case FamilyPackage.FAMILY__NOTES:
				return !getNotes().isEmpty();
			case FamilyPackage.FAMILY__EVENT_KINDS:
				return !getEventKinds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyImpl
