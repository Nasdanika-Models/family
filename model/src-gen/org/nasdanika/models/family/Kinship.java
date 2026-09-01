/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.architecture.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kinship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kinship tie: an architecture relationship between members, typed by
 * RelationshipKind instance data (parent, spouse; biological, adoptive,
 * step, foster as kind taxonomy; the family-ties demo vocabulary loads
 * as a catalog). Spouse kinships carry the GEDCOM FAM xref and family
 * events (marriage, divorce).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Kinship#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getKinship()
 * @model
 * @generated
 */
public interface Kinship extends Relationship, org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getKinship_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // Kinship
