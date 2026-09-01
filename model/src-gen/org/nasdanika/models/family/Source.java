/**
 */
package org.nasdanika.models.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A source: parish register, census, photograph, family bible, interview.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Source#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Source#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Source#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Source#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Source#getCallNumber <em>Call Number</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getSource_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Source#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getSource_Author()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Source#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Publication facts (GEDCOM PUBL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication</em>' attribute.
	 * @see #setPublication(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getSource_Publication()
	 * @model unique="false"
	 * @generated
	 */
	String getPublication();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Source#getPublication <em>Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication</em>' attribute.
	 * @see #getPublication()
	 * @generated
	 */
	void setPublication(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.nasdanika.models.family.FamilyPackage#getSource_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Source#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Call Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Call number within the repository (GEDCOM CALN).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Call Number</em>' attribute.
	 * @see #setCallNumber(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getSource_CallNumber()
	 * @model unique="false"
	 * @generated
	 */
	String getCallNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Source#getCallNumber <em>Call Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Number</em>' attribute.
	 * @see #getCallNumber()
	 * @generated
	 */
	void setCallNumber(String value);

} // Source
