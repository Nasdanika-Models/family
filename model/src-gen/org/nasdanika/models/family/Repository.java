/**
 */
package org.nasdanika.models.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  An archive, library, registry office, or website holding sources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Repository#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Repository#getWebsite <em>Website</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getRepository_Address()
	 * @model unique="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Repository#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getRepository_Website()
	 * @model unique="false"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Repository#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

} // Repository
