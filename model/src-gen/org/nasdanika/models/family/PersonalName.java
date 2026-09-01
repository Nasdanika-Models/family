/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A personal name in GEDCOM structure: the value keeps the original
 * "Given /Surname/" form; parts are parsed for querying and display.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getGiven <em>Given</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.nasdanika.models.family.PersonalName#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName()
 * @model
 * @generated
 */
public interface PersonalName extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Original GEDCOM form, e.g. "Elizabeth Alexandra Mary /Windsor/".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Given</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' attribute.
	 * @see #setGiven(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Given()
	 * @model unique="false"
	 * @generated
	 */
	String getGiven();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getGiven <em>Given</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given</em>' attribute.
	 * @see #getGiven()
	 * @generated
	 */
	void setGiven(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Surname()
	 * @model unique="false"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Nickname()
	 * @model unique="false"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Suffix()
	 * @model unique="false"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name type per GEDCOM TYPE: birth, married, immigrant, aka.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getPersonalName_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.PersonalName#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // PersonalName
