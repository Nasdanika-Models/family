/**
 */
package org.nasdanika.models.family;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Person#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Person#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Person#getMother <em>Mother</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Person#getFather <em>Father</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends org.nasdanika.models.party.Person {
	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(Date)
	 * @see org.nasdanika.models.family.FamilyPackage#getPerson_DateOfBirth()
	 * @model
	 * @generated
	 */
	Date getDateOfBirth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Person#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Person}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.family.Person#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getPerson_Children()
	 * @see org.nasdanika.models.family.Person#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Person}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.family.Person#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getPerson_Parents()
	 * @see org.nasdanika.models.family.Person#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Person> getParents();

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Woman)
	 * @see org.nasdanika.models.family.FamilyPackage#getPerson_Mother()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	Woman getMother();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Woman value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Man)
	 * @see org.nasdanika.models.family.FamilyPackage#getPerson_Father()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	Man getFather();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Man value);

} // Person
