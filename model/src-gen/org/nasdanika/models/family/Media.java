/**
 */
package org.nasdanika.models.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Media and notes ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Media#getFile <em>File</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Media#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Media#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getMedia()
 * @model
 * @generated
 */
public interface Media extends org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI of the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getMedia_File()
	 * @model unique="false"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Media#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getMedia_Format()
	 * @model unique="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Media#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getMedia_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Media#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Media
