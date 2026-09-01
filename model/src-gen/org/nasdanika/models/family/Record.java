/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- GEDCOM record base ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.Record#getXref <em>Xref</em>}</li>
 *   <li>{@link org.nasdanika.models.family.Record#getCitations <em>Citations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getRecord()
 * @model abstract="true"
 * @generated
 */
public interface Record extends EObject {
	/**
	 * Returns the value of the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  GEDCOM cross-reference id, e.g. "@I1@", preserved for round-tripping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xref</em>' attribute.
	 * @see #setXref(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getRecord_Xref()
	 * @model unique="false"
	 * @generated
	 */
	String getXref();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.Record#getXref <em>Xref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xref</em>' attribute.
	 * @see #getXref()
	 * @generated
	 */
	void setXref(String value);

	/**
	 * Returns the value of the '<em><b>Citations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.family.Citation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citations</em>' containment reference list.
	 * @see org.nasdanika.models.family.FamilyPackage#getRecord_Citations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Citation> getCitations();

} // Record
