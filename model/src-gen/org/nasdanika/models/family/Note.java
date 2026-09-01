/**
 */
package org.nasdanika.models.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A shared note record (GEDCOM NOTE); inline notes use nxcore documentation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Note#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends org.nasdanika.models.family.Record {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getNote_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Note#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Note
