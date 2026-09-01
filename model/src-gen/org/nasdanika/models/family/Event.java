/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An event of a member or a kinship. Shrinks onto the planned NxCore
 * Event (named, documented Temporal): after that, this class contributes
 * kind, place, and citations; name, documentation, and typed
 * approximate/range dates come from the base.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Event#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Event#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Event#getPlace <em>Place</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Event#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Event#getMedia <em>Media</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends org.nasdanika.models.nxcore.Event, org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(EventKind)
	 * @see org.nasdanika.models.family.FamilyPackage#getEvent_Kind()
	 * @model
	 * @generated
	 */
	EventKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Event#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EventKind value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Raw GEDCOM date value, e.g. "ABT 1854", "BET 1912 AND 1914"; collapses into nxcore temporals.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getEvent_Date()
	 * @model unique="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Event#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getEvent_Place()
	 * @model unique="false"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Event#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Free-form value for attribute-like events, e.g. occupation text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getEvent_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Event#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getEvent_Media()
	 * @model
	 * @generated
	 */
	EList<Media> getMedia();

} // Event
