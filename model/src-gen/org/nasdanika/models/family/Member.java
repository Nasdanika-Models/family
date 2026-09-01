/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.architecture.Element;

import org.nasdanika.models.orgdesign.Person;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Members and kinship ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Member#getSex <em>Sex</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Member#getNames <em>Names</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Member#getEvents <em>Events</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Member#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends Person, Element, org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.family.Sex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see org.nasdanika.models.family.Sex
	 * @see #setSex(Sex)
	 * @see org.nasdanika.models.family.FamilyPackage#getMember_Sex()
	 * @model unique="false"
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Member#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see org.nasdanika.models.family.Sex
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.PersonalName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getMember_Names()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersonalName> getNames();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getMember_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getMember_Media()
	 * @model
	 * @generated
	 */
	EList<Media> getMedia();

} // Member
