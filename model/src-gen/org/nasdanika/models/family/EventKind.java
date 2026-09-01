/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Events ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.EventKind#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.family.EventKind#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.nasdanika.models.family.EventKind#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.family.FamilyPackage#getEventKind()
 * @model
 * @generated
 */
public interface EventKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getEventKind_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.EventKind#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(EventKind)
	 * @see org.nasdanika.models.family.FamilyPackage#getEventKind_SuperType()
	 * @model
	 * @generated
	 */
	EventKind getSuperType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.EventKind#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(EventKind value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  GEDCOM tag, e.g. "BIRT", "DEAT", "MARR", "OCCU".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.nasdanika.models.family.FamilyPackage#getEventKind_Tag()
	 * @model unique="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.family.EventKind#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

} // EventKind
