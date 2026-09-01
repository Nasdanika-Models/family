/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Repository;
import org.nasdanika.models.family.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.SourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.SourceImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.SourceImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.SourceImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.SourceImpl#getCallNumber <em>Call Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends RecordImpl implements Source {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPublication() <em>Publication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublication()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCallNumber() <em>Call Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CALL_NUMBER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(FamilyPackage.SOURCE__TITLE, FamilyPackage.Literals.SOURCE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(FamilyPackage.SOURCE__TITLE, FamilyPackage.Literals.SOURCE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return (String)eDynamicGet(FamilyPackage.SOURCE__AUTHOR, FamilyPackage.Literals.SOURCE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		eDynamicSet(FamilyPackage.SOURCE__AUTHOR, FamilyPackage.Literals.SOURCE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublication() {
		return (String)eDynamicGet(FamilyPackage.SOURCE__PUBLICATION, FamilyPackage.Literals.SOURCE__PUBLICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublication(String newPublication) {
		eDynamicSet(FamilyPackage.SOURCE__PUBLICATION, FamilyPackage.Literals.SOURCE__PUBLICATION, newPublication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		return (Repository)eDynamicGet(FamilyPackage.SOURCE__REPOSITORY, FamilyPackage.Literals.SOURCE__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		return (Repository)eDynamicGet(FamilyPackage.SOURCE__REPOSITORY, FamilyPackage.Literals.SOURCE__REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		eDynamicSet(FamilyPackage.SOURCE__REPOSITORY, FamilyPackage.Literals.SOURCE__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallNumber() {
		return (String)eDynamicGet(FamilyPackage.SOURCE__CALL_NUMBER, FamilyPackage.Literals.SOURCE__CALL_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallNumber(String newCallNumber) {
		eDynamicSet(FamilyPackage.SOURCE__CALL_NUMBER, FamilyPackage.Literals.SOURCE__CALL_NUMBER, newCallNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.SOURCE__TITLE:
				return getTitle();
			case FamilyPackage.SOURCE__AUTHOR:
				return getAuthor();
			case FamilyPackage.SOURCE__PUBLICATION:
				return getPublication();
			case FamilyPackage.SOURCE__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case FamilyPackage.SOURCE__CALL_NUMBER:
				return getCallNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FamilyPackage.SOURCE__TITLE:
				setTitle((String)newValue);
				return;
			case FamilyPackage.SOURCE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case FamilyPackage.SOURCE__PUBLICATION:
				setPublication((String)newValue);
				return;
			case FamilyPackage.SOURCE__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case FamilyPackage.SOURCE__CALL_NUMBER:
				setCallNumber((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FamilyPackage.SOURCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FamilyPackage.SOURCE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case FamilyPackage.SOURCE__PUBLICATION:
				setPublication(PUBLICATION_EDEFAULT);
				return;
			case FamilyPackage.SOURCE__REPOSITORY:
				setRepository((Repository)null);
				return;
			case FamilyPackage.SOURCE__CALL_NUMBER:
				setCallNumber(CALL_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FamilyPackage.SOURCE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case FamilyPackage.SOURCE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? getAuthor() != null : !AUTHOR_EDEFAULT.equals(getAuthor());
			case FamilyPackage.SOURCE__PUBLICATION:
				return PUBLICATION_EDEFAULT == null ? getPublication() != null : !PUBLICATION_EDEFAULT.equals(getPublication());
			case FamilyPackage.SOURCE__REPOSITORY:
				return basicGetRepository() != null;
			case FamilyPackage.SOURCE__CALL_NUMBER:
				return CALL_NUMBER_EDEFAULT == null ? getCallNumber() != null : !CALL_NUMBER_EDEFAULT.equals(getCallNumber());
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
