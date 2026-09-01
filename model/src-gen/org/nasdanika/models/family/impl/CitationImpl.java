/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.CitationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.CitationImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.CitationImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.CitationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CitationImpl extends MinimalEObjectImpl.Container implements Citation {
	/**
	 * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUALITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.CITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)eDynamicGet(FamilyPackage.CITATION__SOURCE, FamilyPackage.Literals.CITATION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetSource() {
		return (Source)eDynamicGet(FamilyPackage.CITATION__SOURCE, FamilyPackage.Literals.CITATION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		eDynamicSet(FamilyPackage.CITATION__SOURCE, FamilyPackage.Literals.CITATION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPage() {
		return (String)eDynamicGet(FamilyPackage.CITATION__PAGE, FamilyPackage.Literals.CITATION__PAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(String newPage) {
		eDynamicSet(FamilyPackage.CITATION__PAGE, FamilyPackage.Literals.CITATION__PAGE, newPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQuality() {
		return (Integer)eDynamicGet(FamilyPackage.CITATION__QUALITY, FamilyPackage.Literals.CITATION__QUALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(Integer newQuality) {
		eDynamicSet(FamilyPackage.CITATION__QUALITY, FamilyPackage.Literals.CITATION__QUALITY, newQuality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(FamilyPackage.CITATION__TEXT, FamilyPackage.Literals.CITATION__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(FamilyPackage.CITATION__TEXT, FamilyPackage.Literals.CITATION__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.CITATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FamilyPackage.CITATION__PAGE:
				return getPage();
			case FamilyPackage.CITATION__QUALITY:
				return getQuality();
			case FamilyPackage.CITATION__TEXT:
				return getText();
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
			case FamilyPackage.CITATION__SOURCE:
				setSource((Source)newValue);
				return;
			case FamilyPackage.CITATION__PAGE:
				setPage((String)newValue);
				return;
			case FamilyPackage.CITATION__QUALITY:
				setQuality((Integer)newValue);
				return;
			case FamilyPackage.CITATION__TEXT:
				setText((String)newValue);
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
			case FamilyPackage.CITATION__SOURCE:
				setSource((Source)null);
				return;
			case FamilyPackage.CITATION__PAGE:
				setPage(PAGE_EDEFAULT);
				return;
			case FamilyPackage.CITATION__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case FamilyPackage.CITATION__TEXT:
				setText(TEXT_EDEFAULT);
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
			case FamilyPackage.CITATION__SOURCE:
				return basicGetSource() != null;
			case FamilyPackage.CITATION__PAGE:
				return PAGE_EDEFAULT == null ? getPage() != null : !PAGE_EDEFAULT.equals(getPage());
			case FamilyPackage.CITATION__QUALITY:
				return QUALITY_EDEFAULT == null ? getQuality() != null : !QUALITY_EDEFAULT.equals(getQuality());
			case FamilyPackage.CITATION__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
		}
		return super.eIsSet(featureID);
	}

} //CitationImpl
