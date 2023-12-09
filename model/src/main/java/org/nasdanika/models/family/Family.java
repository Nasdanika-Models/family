/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Family#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends DocumentedNamedElement {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getFamily_Members()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Person> getMembers();
} // Family
