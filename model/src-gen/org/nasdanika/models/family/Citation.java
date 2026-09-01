/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Sources: the domain's provenance ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Citation#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Citation#getPage <em>Page</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Citation#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Citation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getCitation()
 * @model
 * @generated
 */
public interface Citation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see org.nasdanika.models.family.FamilyPackage#getCitation_Source()
	 * @model
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Citation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Location within the source (GEDCOM PAGE): page, entry, film frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page</em>' attribute.
	 * @see #setPage(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getCitation_Page()
	 * @model unique="false"
	 * @generated
	 */
	String getPage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Citation#getPage <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' attribute.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  GEDCOM QUAY 0..3: 0 unreliable, 1 questionable, 2 secondary, 3 primary evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see #setQuality(Integer)
	 * @see org.nasdanika.models.family.FamilyPackage#getCitation_Quality()
	 * @model unique="false"
	 * @generated
	 */
	Integer getQuality();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Citation#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Quoted text from the source (GEDCOM DATA/TEXT).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getCitation_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Citation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Citation
