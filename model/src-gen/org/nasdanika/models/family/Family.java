/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.orgdesign.Organization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Root ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Family#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Family#getSources <em>Sources</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Family#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Family#getMedia <em>Media</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Family#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Family#getEventKinds <em>Event Kinds</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends Organization {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Media()
	 * @model containment="true"
	 * @generated
	 */
	EList<Media> getMedia();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Note}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Event Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.EventKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Kinds</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_EventKinds()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventKind> getEventKinds();

} // Family
