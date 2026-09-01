/**
 */
package org.nasdanika.models.family.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.capability.CapabilityPackage;

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

import org.nasdanika.models.governance.GovernancePackage;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.lifecycle.LifecyclePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.orgdesign.OrgdesignPackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.SealPackage;

import org.nasdanika.models.work.WorkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FamilyPackageImpl extends EPackageImpl implements FamilyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personalNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sexEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.family.FamilyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FamilyPackageImpl() {
		super(eNS_URI, FamilyFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FamilyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FamilyPackage init() {
		if (isInited) return (FamilyPackage)EPackage.Registry.INSTANCE.getEPackage(FamilyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFamilyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FamilyPackageImpl theFamilyPackage = registeredFamilyPackage instanceof FamilyPackageImpl ? (FamilyPackageImpl)registeredFamilyPackage : new FamilyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OrgdesignPackage.eINSTANCE.eClass();
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ArchitecturePackage.eINSTANCE.eClass();
		GovernancePackage.eINSTANCE.eClass();
		WorkPackage.eINSTANCE.eClass();
		CapabilityPackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		SealPackage.eINSTANCE.eClass();
		LifecyclePackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFamilyPackage.createPackageContents();

		// Initialize created meta-data
		theFamilyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFamilyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FamilyPackage.eNS_URI, theFamilyPackage);
		return theFamilyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Members() {
		return (EReference)familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Sources() {
		return (EReference)familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Repositories() {
		return (EReference)familyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Media() {
		return (EReference)familyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Notes() {
		return (EReference)familyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_EventKinds() {
		return (EReference)familyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Xref() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Citations() {
		return (EReference)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Sex() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Names() {
		return (EReference)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Events() {
		return (EReference)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Media() {
		return (EReference)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKinship() {
		return kinshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKinship_Events() {
		return (EReference)kinshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonalName() {
		return personalNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Value() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Given() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Surname() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Nickname() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Prefix() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Suffix() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonalName_Type() {
		return (EAttribute)personalNameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventKind() {
		return eventKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventKind_Name() {
		return (EAttribute)eventKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventKind_SuperType() {
		return (EReference)eventKindEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventKind_Tag() {
		return (EAttribute)eventKindEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Kind() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Date() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Place() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Value() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Media() {
		return (EReference)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitation() {
		return citationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitation_Source() {
		return (EReference)citationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_Page() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_Quality() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitation_Text() {
		return (EAttribute)citationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Title() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Author() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Publication() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Repository() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_CallNumber() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Address() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Website() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_File() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Format() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Title() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Text() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSex() {
		return sexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyFactory getFamilyFactory() {
		return (FamilyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		familyEClass = createEClass(FAMILY);
		createEReference(familyEClass, FAMILY__MEMBERS);
		createEReference(familyEClass, FAMILY__SOURCES);
		createEReference(familyEClass, FAMILY__REPOSITORIES);
		createEReference(familyEClass, FAMILY__MEDIA);
		createEReference(familyEClass, FAMILY__NOTES);
		createEReference(familyEClass, FAMILY__EVENT_KINDS);

		recordEClass = createEClass(RECORD);
		createEAttribute(recordEClass, RECORD__XREF);
		createEReference(recordEClass, RECORD__CITATIONS);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__SEX);
		createEReference(memberEClass, MEMBER__NAMES);
		createEReference(memberEClass, MEMBER__EVENTS);
		createEReference(memberEClass, MEMBER__MEDIA);

		kinshipEClass = createEClass(KINSHIP);
		createEReference(kinshipEClass, KINSHIP__EVENTS);

		personalNameEClass = createEClass(PERSONAL_NAME);
		createEAttribute(personalNameEClass, PERSONAL_NAME__VALUE);
		createEAttribute(personalNameEClass, PERSONAL_NAME__GIVEN);
		createEAttribute(personalNameEClass, PERSONAL_NAME__SURNAME);
		createEAttribute(personalNameEClass, PERSONAL_NAME__NICKNAME);
		createEAttribute(personalNameEClass, PERSONAL_NAME__PREFIX);
		createEAttribute(personalNameEClass, PERSONAL_NAME__SUFFIX);
		createEAttribute(personalNameEClass, PERSONAL_NAME__TYPE);

		eventKindEClass = createEClass(EVENT_KIND);
		createEAttribute(eventKindEClass, EVENT_KIND__NAME);
		createEReference(eventKindEClass, EVENT_KIND__SUPER_TYPE);
		createEAttribute(eventKindEClass, EVENT_KIND__TAG);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__KIND);
		createEAttribute(eventEClass, EVENT__DATE);
		createEAttribute(eventEClass, EVENT__PLACE);
		createEAttribute(eventEClass, EVENT__VALUE);
		createEReference(eventEClass, EVENT__MEDIA);

		citationEClass = createEClass(CITATION);
		createEReference(citationEClass, CITATION__SOURCE);
		createEAttribute(citationEClass, CITATION__PAGE);
		createEAttribute(citationEClass, CITATION__QUALITY);
		createEAttribute(citationEClass, CITATION__TEXT);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__TITLE);
		createEAttribute(sourceEClass, SOURCE__AUTHOR);
		createEAttribute(sourceEClass, SOURCE__PUBLICATION);
		createEReference(sourceEClass, SOURCE__REPOSITORY);
		createEAttribute(sourceEClass, SOURCE__CALL_NUMBER);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__ADDRESS);
		createEAttribute(repositoryEClass, REPOSITORY__WEBSITE);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__FILE);
		createEAttribute(mediaEClass, MEDIA__FORMAT);
		createEAttribute(mediaEClass, MEDIA__TITLE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__TEXT);

		// Create enums
		sexEEnum = createEEnum(SEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OrgdesignPackage theOrgdesignPackage = (OrgdesignPackage)EPackage.Registry.INSTANCE.getEPackage(OrgdesignPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		familyEClass.getESuperTypes().add(theOrgdesignPackage.getOrganization());
		memberEClass.getESuperTypes().add(theOrgdesignPackage.getPerson());
		memberEClass.getESuperTypes().add(theArchitecturePackage.getElement());
		memberEClass.getESuperTypes().add(this.getRecord());
		kinshipEClass.getESuperTypes().add(theArchitecturePackage.getRelationship());
		kinshipEClass.getESuperTypes().add(this.getRecord());
		eventEClass.getESuperTypes().add(theNxcorePackage.getEvent());
		eventEClass.getESuperTypes().add(this.getRecord());
		sourceEClass.getESuperTypes().add(this.getRecord());
		repositoryEClass.getESuperTypes().add(this.getRecord());
		mediaEClass.getESuperTypes().add(this.getRecord());
		noteEClass.getESuperTypes().add(this.getRecord());

		// Initialize classes, features, and operations; add parameters
		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamily_Members(), this.getMember(), null, "members", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Sources(), this.getSource(), null, "sources", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Repositories(), this.getRepository(), null, "repositories", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Media(), this.getMedia(), null, "media", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Notes(), this.getNote(), null, "notes", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_EventKinds(), this.getEventKind(), null, "eventKinds", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordEClass, org.nasdanika.models.family.Record.class, "Record", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecord_Xref(), theEcorePackage.getEString(), "xref", null, 0, 1, org.nasdanika.models.family.Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecord_Citations(), this.getCitation(), null, "citations", null, 0, -1, org.nasdanika.models.family.Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Sex(), this.getSex(), "sex", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Names(), this.getPersonalName(), null, "names", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Events(), this.getEvent(), null, "events", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Media(), this.getMedia(), null, "media", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kinshipEClass, Kinship.class, "Kinship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKinship_Events(), this.getEvent(), null, "events", null, 0, -1, Kinship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personalNameEClass, PersonalName.class, "PersonalName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonalName_Value(), theEcorePackage.getEString(), "value", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Given(), theEcorePackage.getEString(), "given", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Surname(), theEcorePackage.getEString(), "surname", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Nickname(), theEcorePackage.getEString(), "nickname", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Suffix(), theEcorePackage.getEString(), "suffix", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonalName_Type(), theEcorePackage.getEString(), "type", null, 0, 1, PersonalName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventKindEClass, EventKind.class, "EventKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventKind_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EventKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventKind_SuperType(), this.getEventKind(), null, "superType", null, 0, 1, EventKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventKind_Tag(), theEcorePackage.getEString(), "tag", null, 0, 1, EventKind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Kind(), this.getEventKind(), null, "kind", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Date(), theEcorePackage.getEString(), "date", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Place(), theEcorePackage.getEString(), "place", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Media(), this.getMedia(), null, "media", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citationEClass, Citation.class, "Citation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitation_Source(), this.getSource(), null, "source", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitation_Page(), theEcorePackage.getEString(), "page", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitation_Quality(), theEcorePackage.getEIntegerObject(), "quality", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitation_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Citation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Author(), theEcorePackage.getEString(), "author", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Publication(), theEcorePackage.getEString(), "publication", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Repository(), this.getRepository(), null, "repository", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_CallNumber(), theEcorePackage.getEString(), "callNumber", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_Address(), theEcorePackage.getEString(), "address", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Website(), theEcorePackage.getEString(), "website", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_File(), theEcorePackage.getEString(), "file", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Format(), theEcorePackage.getEString(), "format", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sexEEnum, Sex.class, "Sex");
		addEEnumLiteral(sexEEnum, Sex.UNKNOWN);
		addEEnumLiteral(sexEEnum, Sex.MALE);
		addEEnumLiteral(sexEEnum, Sex.FEMALE);
		addEEnumLiteral(sexEEnum, Sex.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (familyEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Root ----"
		   });
		addAnnotation
		  (recordEClass,
		   source,
		   new String[] {
			   "documentation", " ---- GEDCOM record base ----"
		   });
		addAnnotation
		  (getRecord_Xref(),
		   source,
		   new String[] {
			   "documentation", " GEDCOM cross-reference id, e.g. \"@I1@\", preserved for round-tripping."
		   });
		addAnnotation
		  (sexEEnum,
		   source,
		   new String[] {
			   "documentation", " GEDCOM 5.5.1 SEX values plus the GEDCOM 7 X (other)."
		   });
		addAnnotation
		  (memberEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Members and kinship ----"
		   });
		addAnnotation
		  (kinshipEClass,
		   source,
		   new String[] {
			   "documentation", "A kinship tie: an architecture relationship between members, typed by\nRelationshipKind instance data (parent, spouse; biological, adoptive,\nstep, foster as kind taxonomy; the family-ties demo vocabulary loads\nas a catalog). Spouse kinships carry the GEDCOM FAM xref and family\nevents (marriage, divorce)."
		   });
		addAnnotation
		  (personalNameEClass,
		   source,
		   new String[] {
			   "documentation", "A personal name in GEDCOM structure: the value keeps the original\n\"Given /Surname/\" form; parts are parsed for querying and display."
		   });
		addAnnotation
		  (getPersonalName_Value(),
		   source,
		   new String[] {
			   "documentation", " Original GEDCOM form, e.g. \"Elizabeth Alexandra Mary /Windsor/\"."
		   });
		addAnnotation
		  (getPersonalName_Type(),
		   source,
		   new String[] {
			   "documentation", " Name type per GEDCOM TYPE: birth, married, immigrant, aka."
		   });
		addAnnotation
		  (eventKindEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Events ----"
		   });
		addAnnotation
		  (getEventKind_Tag(),
		   source,
		   new String[] {
			   "documentation", " GEDCOM tag, e.g. \"BIRT\", \"DEAT\", \"MARR\", \"OCCU\"."
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "documentation", "An event of a member or a kinship. Shrinks onto the planned NxCore\nEvent (named, documented Temporal): after that, this class contributes\nkind, place, and citations; name, documentation, and typed\napproximate/range dates come from the base."
		   });
		addAnnotation
		  (getEvent_Date(),
		   source,
		   new String[] {
			   "documentation", " Raw GEDCOM date value, e.g. \"ABT 1854\", \"BET 1912 AND 1914\"; collapses into nxcore temporals."
		   });
		addAnnotation
		  (getEvent_Value(),
		   source,
		   new String[] {
			   "documentation", " Free-form value for attribute-like events, e.g. occupation text."
		   });
		addAnnotation
		  (citationEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Sources: the domain\'s provenance ----"
		   });
		addAnnotation
		  (getCitation_Page(),
		   source,
		   new String[] {
			   "documentation", " Location within the source (GEDCOM PAGE): page, entry, film frame."
		   });
		addAnnotation
		  (getCitation_Quality(),
		   source,
		   new String[] {
			   "documentation", " GEDCOM QUAY 0..3: 0 unreliable, 1 questionable, 2 secondary, 3 primary evidence."
		   });
		addAnnotation
		  (getCitation_Text(),
		   source,
		   new String[] {
			   "documentation", " Quoted text from the source (GEDCOM DATA/TEXT)."
		   });
		addAnnotation
		  (sourceEClass,
		   source,
		   new String[] {
			   "documentation", " A source: parish register, census, photograph, family bible, interview."
		   });
		addAnnotation
		  (getSource_Publication(),
		   source,
		   new String[] {
			   "documentation", " Publication facts (GEDCOM PUBL)."
		   });
		addAnnotation
		  (getSource_CallNumber(),
		   source,
		   new String[] {
			   "documentation", " Call number within the repository (GEDCOM CALN)."
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "documentation", " An archive, library, registry office, or website holding sources."
		   });
		addAnnotation
		  (mediaEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Media and notes ----"
		   });
		addAnnotation
		  (getMedia_File(),
		   source,
		   new String[] {
			   "documentation", " URI of the file."
		   });
		addAnnotation
		  (noteEClass,
		   source,
		   new String[] {
			   "documentation", " A shared note record (GEDCOM NOTE); inline notes use nxcore documentation."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //FamilyPackageImpl
