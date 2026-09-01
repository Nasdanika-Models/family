/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.family.Citation;
import org.nasdanika.models.family.Event;
import org.nasdanika.models.family.EventKind;
import org.nasdanika.models.family.Family;
import org.nasdanika.models.family.FamilyFactory;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Kinship;
import org.nasdanika.models.family.Media;
import org.nasdanika.models.family.Member;
import org.nasdanika.models.family.Note;
import org.nasdanika.models.family.PersonalName;
import org.nasdanika.models.family.Repository;
import org.nasdanika.models.family.Sex;
import org.nasdanika.models.family.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilyFactoryImpl extends EFactoryImpl implements FamilyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyFactory init() {
		try {
			FamilyFactory theFamilyFactory = (FamilyFactory)EPackage.Registry.INSTANCE.getEFactory(FamilyPackage.eNS_URI);
			if (theFamilyFactory != null) {
				return theFamilyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FamilyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FamilyPackage.FAMILY: return createFamily();
			case FamilyPackage.MEMBER: return createMember();
			case FamilyPackage.KINSHIP: return createKinship();
			case FamilyPackage.PERSONAL_NAME: return createPersonalName();
			case FamilyPackage.EVENT_KIND: return createEventKind();
			case FamilyPackage.EVENT: return createEvent();
			case FamilyPackage.CITATION: return createCitation();
			case FamilyPackage.SOURCE: return createSource();
			case FamilyPackage.REPOSITORY: return createRepository();
			case FamilyPackage.MEDIA: return createMedia();
			case FamilyPackage.NOTE: return createNote();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FamilyPackage.SEX:
				return createSexFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FamilyPackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kinship createKinship() {
		KinshipImpl kinship = new KinshipImpl();
		return kinship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalName createPersonalName() {
		PersonalNameImpl personalName = new PersonalNameImpl();
		return personalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventKind createEventKind() {
		EventKindImpl eventKind = new EventKindImpl();
		return eventKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citation createCitation() {
		CitationImpl citation = new CitationImpl();
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
		Sex result = Sex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyPackage getFamilyPackage() {
		return (FamilyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FamilyPackage getPackage() {
		return FamilyPackage.eINSTANCE;
	}

} //FamilyFactoryImpl
