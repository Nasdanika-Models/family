/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Media;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.MediaImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MediaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.MediaImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaImpl extends RecordImpl implements Media {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return (String)eDynamicGet(FamilyPackage.MEDIA__FILE, FamilyPackage.Literals.MEDIA__FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		eDynamicSet(FamilyPackage.MEDIA__FILE, FamilyPackage.Literals.MEDIA__FILE, newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return (String)eDynamicGet(FamilyPackage.MEDIA__FORMAT, FamilyPackage.Literals.MEDIA__FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		eDynamicSet(FamilyPackage.MEDIA__FORMAT, FamilyPackage.Literals.MEDIA__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(FamilyPackage.MEDIA__TITLE, FamilyPackage.Literals.MEDIA__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(FamilyPackage.MEDIA__TITLE, FamilyPackage.Literals.MEDIA__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.MEDIA__FILE:
				return getFile();
			case FamilyPackage.MEDIA__FORMAT:
				return getFormat();
			case FamilyPackage.MEDIA__TITLE:
				return getTitle();
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
			case FamilyPackage.MEDIA__FILE:
				setFile((String)newValue);
				return;
			case FamilyPackage.MEDIA__FORMAT:
				setFormat((String)newValue);
				return;
			case FamilyPackage.MEDIA__TITLE:
				setTitle((String)newValue);
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
			case FamilyPackage.MEDIA__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case FamilyPackage.MEDIA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case FamilyPackage.MEDIA__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case FamilyPackage.MEDIA__FILE:
				return FILE_EDEFAULT == null ? getFile() != null : !FILE_EDEFAULT.equals(getFile());
			case FamilyPackage.MEDIA__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case FamilyPackage.MEDIA__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
		}
		return super.eIsSet(featureID);
	}

} //MediaImpl
