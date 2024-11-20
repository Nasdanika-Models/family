/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Polity#getConstituents <em>Constituents</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Polity#getResidents <em>Residents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getPolity()
 * @model
 * @generated
 */
public interface Polity extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Constituents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Polity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constituents</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getPolity_Constituents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Polity> getConstituents();

	/**
	 * Returns the value of the '<em><b>Residents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residents</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getPolity_Residents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getResidents();

} // Polity
