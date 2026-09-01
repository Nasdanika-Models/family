/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.PersonalName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.nasdanika.models.family.impl.PersonalNameImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalNameImpl extends MinimalEObjectImpl.Container implements PersonalName {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGiven() <em>Given</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.PERSONAL_NAME;
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
	public String getValue() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__VALUE, FamilyPackage.Literals.PERSONAL_NAME__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__VALUE, FamilyPackage.Literals.PERSONAL_NAME__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGiven() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__GIVEN, FamilyPackage.Literals.PERSONAL_NAME__GIVEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiven(String newGiven) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__GIVEN, FamilyPackage.Literals.PERSONAL_NAME__GIVEN, newGiven);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__SURNAME, FamilyPackage.Literals.PERSONAL_NAME__SURNAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__SURNAME, FamilyPackage.Literals.PERSONAL_NAME__SURNAME, newSurname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__NICKNAME, FamilyPackage.Literals.PERSONAL_NAME__NICKNAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__NICKNAME, FamilyPackage.Literals.PERSONAL_NAME__NICKNAME, newNickname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__PREFIX, FamilyPackage.Literals.PERSONAL_NAME__PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__PREFIX, FamilyPackage.Literals.PERSONAL_NAME__PREFIX, newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuffix() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__SUFFIX, FamilyPackage.Literals.PERSONAL_NAME__SUFFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__SUFFIX, FamilyPackage.Literals.PERSONAL_NAME__SUFFIX, newSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(FamilyPackage.PERSONAL_NAME__TYPE, FamilyPackage.Literals.PERSONAL_NAME__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(FamilyPackage.PERSONAL_NAME__TYPE, FamilyPackage.Literals.PERSONAL_NAME__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.PERSONAL_NAME__VALUE:
				return getValue();
			case FamilyPackage.PERSONAL_NAME__GIVEN:
				return getGiven();
			case FamilyPackage.PERSONAL_NAME__SURNAME:
				return getSurname();
			case FamilyPackage.PERSONAL_NAME__NICKNAME:
				return getNickname();
			case FamilyPackage.PERSONAL_NAME__PREFIX:
				return getPrefix();
			case FamilyPackage.PERSONAL_NAME__SUFFIX:
				return getSuffix();
			case FamilyPackage.PERSONAL_NAME__TYPE:
				return getType();
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
			case FamilyPackage.PERSONAL_NAME__VALUE:
				setValue((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__GIVEN:
				setGiven((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__SURNAME:
				setSurname((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__NICKNAME:
				setNickname((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__PREFIX:
				setPrefix((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__SUFFIX:
				setSuffix((String)newValue);
				return;
			case FamilyPackage.PERSONAL_NAME__TYPE:
				setType((String)newValue);
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
			case FamilyPackage.PERSONAL_NAME__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__GIVEN:
				setGiven(GIVEN_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case FamilyPackage.PERSONAL_NAME__TYPE:
				setType(TYPE_EDEFAULT);
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
			case FamilyPackage.PERSONAL_NAME__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case FamilyPackage.PERSONAL_NAME__GIVEN:
				return GIVEN_EDEFAULT == null ? getGiven() != null : !GIVEN_EDEFAULT.equals(getGiven());
			case FamilyPackage.PERSONAL_NAME__SURNAME:
				return SURNAME_EDEFAULT == null ? getSurname() != null : !SURNAME_EDEFAULT.equals(getSurname());
			case FamilyPackage.PERSONAL_NAME__NICKNAME:
				return NICKNAME_EDEFAULT == null ? getNickname() != null : !NICKNAME_EDEFAULT.equals(getNickname());
			case FamilyPackage.PERSONAL_NAME__PREFIX:
				return PREFIX_EDEFAULT == null ? getPrefix() != null : !PREFIX_EDEFAULT.equals(getPrefix());
			case FamilyPackage.PERSONAL_NAME__SUFFIX:
				return SUFFIX_EDEFAULT == null ? getSuffix() != null : !SUFFIX_EDEFAULT.equals(getSuffix());
			case FamilyPackage.PERSONAL_NAME__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //PersonalNameImpl
