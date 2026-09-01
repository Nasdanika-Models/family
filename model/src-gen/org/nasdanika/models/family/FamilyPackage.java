/**
 */
package org.nasdanika.models.family;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.architecture.ArchitecturePackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.orgdesign.OrgdesignPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.family.FamilyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='21' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface FamilyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "family";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://family.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.family";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamilyPackage eINSTANCE = org.nasdanika.models.family.impl.FamilyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.FamilyImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ID = OrgdesignPackage.ORGANIZATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DOCUMENTATION = OrgdesignPackage.ORGANIZATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DOC_REF = OrgdesignPackage.ORGANIZATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DOC_FORMAT = OrgdesignPackage.ORGANIZATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DOC_CONTENTS = OrgdesignPackage.ORGANIZATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DOC_SECTIONS = OrgdesignPackage.ORGANIZATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MARKERS = OrgdesignPackage.ORGANIZATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ICON = OrgdesignPackage.ORGANIZATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__URIS = OrgdesignPackage.ORGANIZATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = OrgdesignPackage.ORGANIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Top Level Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__TOP_LEVEL_UNITS = OrgdesignPackage.ORGANIZATION__TOP_LEVEL_UNITS;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PEOPLE = OrgdesignPackage.ORGANIZATION__PEOPLE;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__STRATEGIES = OrgdesignPackage.ORGANIZATION__STRATEGIES;

	/**
	 * The feature id for the '<em><b>Environment Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__ENVIRONMENT_FACTORS = OrgdesignPackage.ORGANIZATION__ENVIRONMENT_FACTORS;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__CAPABILITIES = OrgdesignPackage.ORGANIZATION__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__PROCESSES = OrgdesignPackage.ORGANIZATION__PROCESSES;

	/**
	 * The feature id for the '<em><b>Coordination Mechanisms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__COORDINATION_MECHANISMS = OrgdesignPackage.ORGANIZATION__COORDINATION_MECHANISMS;

	/**
	 * The feature id for the '<em><b>Decision Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__DECISION_RIGHTS = OrgdesignPackage.ORGANIZATION__DECISION_RIGHTS;

	/**
	 * The feature id for the '<em><b>Fit Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FIT_RULES = OrgdesignPackage.ORGANIZATION__FIT_RULES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MEMBERS = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__SOURCES = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__REPOSITORIES = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MEDIA = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NOTES = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__EVENT_KINDS = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = OrgdesignPackage.ORGANIZATION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY___COLLECT__OBJECT_EREFERENCE_ELIST = OrgdesignPackage.ORGANIZATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY___GET_REFERRERS__EREFERENCE = OrgdesignPackage.ORGANIZATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_OPERATION_COUNT = OrgdesignPackage.ORGANIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.RecordImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 1;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__XREF = 0;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CITATIONS = 1;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.MemberImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ID = OrgdesignPackage.PERSON__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOCUMENTATION = OrgdesignPackage.PERSON__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_REF = OrgdesignPackage.PERSON__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_FORMAT = OrgdesignPackage.PERSON__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_CONTENTS = OrgdesignPackage.PERSON__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DOC_SECTIONS = OrgdesignPackage.PERSON__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MARKERS = OrgdesignPackage.PERSON__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ICON = OrgdesignPackage.PERSON__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__URIS = OrgdesignPackage.PERSON__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = OrgdesignPackage.PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EMAIL = OrgdesignPackage.PERSON__EMAIL;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CAPABILITIES = OrgdesignPackage.PERSON__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Current Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CURRENT_ROLES = OrgdesignPackage.PERSON__CURRENT_ROLES;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CONTROL_APPLICATIONS = OrgdesignPackage.PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__RISKS = OrgdesignPackage.PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__WAIVERS = OrgdesignPackage.PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__WORK = OrgdesignPackage.PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__OUTGOING_RELATIONSHIPS = OrgdesignPackage.PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__KIND = OrgdesignPackage.PERSON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ELEMENTS = OrgdesignPackage.PERSON_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__XREF = OrgdesignPackage.PERSON_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CITATIONS = OrgdesignPackage.PERSON_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__SEX = OrgdesignPackage.PERSON_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAMES = OrgdesignPackage.PERSON_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EVENTS = OrgdesignPackage.PERSON_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__MEDIA = OrgdesignPackage.PERSON_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = OrgdesignPackage.PERSON_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___COLLECT__OBJECT_EREFERENCE_ELIST = OrgdesignPackage.PERSON___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER___GET_REFERRERS__EREFERENCE = OrgdesignPackage.PERSON___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = OrgdesignPackage.PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.KinshipImpl <em>Kinship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.KinshipImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getKinship()
	 * @generated
	 */
	int KINSHIP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__ID = ArchitecturePackage.RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__DOCUMENTATION = ArchitecturePackage.RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__DOC_REF = ArchitecturePackage.RELATIONSHIP__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__DOC_FORMAT = ArchitecturePackage.RELATIONSHIP__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__DOC_CONTENTS = ArchitecturePackage.RELATIONSHIP__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__DOC_SECTIONS = ArchitecturePackage.RELATIONSHIP__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__MARKERS = ArchitecturePackage.RELATIONSHIP__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__ICON = ArchitecturePackage.RELATIONSHIP__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__URIS = ArchitecturePackage.RELATIONSHIP__URIS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__KIND = ArchitecturePackage.RELATIONSHIP__KIND;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__TARGET = ArchitecturePackage.RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Carries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__CARRIES = ArchitecturePackage.RELATIONSHIP__CARRIES;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__XREF = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__CITATIONS = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP__EVENTS = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kinship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP_FEATURE_COUNT = ArchitecturePackage.RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP___COLLECT__OBJECT_EREFERENCE_ELIST = ArchitecturePackage.RELATIONSHIP___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP___GET_REFERRERS__EREFERENCE = ArchitecturePackage.RELATIONSHIP___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Kinship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINSHIP_OPERATION_COUNT = ArchitecturePackage.RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.PersonalNameImpl <em>Personal Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.PersonalNameImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getPersonalName()
	 * @generated
	 */
	int PERSONAL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Given</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__GIVEN = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__NICKNAME = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Personal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Personal Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.EventKindImpl <em>Event Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.EventKindImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getEventKind()
	 * @generated
	 */
	int EVENT_KIND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_KIND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_KIND__SUPER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_KIND__TAG = 2;

	/**
	 * The number of structural features of the '<em>Event Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_KIND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.EventImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = NxcorePackage.EVENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOCUMENTATION = NxcorePackage.EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOC_REF = NxcorePackage.EVENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOC_FORMAT = NxcorePackage.EVENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOC_CONTENTS = NxcorePackage.EVENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOC_SECTIONS = NxcorePackage.EVENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MARKERS = NxcorePackage.EVENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ICON = NxcorePackage.EVENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__URIS = NxcorePackage.EVENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NxcorePackage.EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BASE = NxcorePackage.EVENT__BASE;

	/**
	 * The feature id for the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INSTANT = NxcorePackage.EVENT__INSTANT;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DURATION = NxcorePackage.EVENT__DURATION;

	/**
	 * The feature id for the '<em><b>Lower Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LOWER_BOUNDS = NxcorePackage.EVENT__LOWER_BOUNDS;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UPPER_BOUNDS = NxcorePackage.EVENT__UPPER_BOUNDS;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__XREF = NxcorePackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CITATIONS = NxcorePackage.EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__KIND = NxcorePackage.EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = NxcorePackage.EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PLACE = NxcorePackage.EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALUE = NxcorePackage.EVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MEDIA = NxcorePackage.EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NxcorePackage.EVENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.EVENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_REFERRERS__EREFERENCE = NxcorePackage.EVENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NxcorePackage.EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.CitationImpl <em>Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.CitationImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getCitation()
	 * @generated
	 */
	int CITATION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__PAGE = 1;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__QUALITY = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION__TEXT = 3;

	/**
	 * The number of structural features of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.SourceImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 8;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__XREF = RECORD__XREF;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CITATIONS = RECORD__CITATIONS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TITLE = RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__AUTHOR = RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PUBLICATION = RECORD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__REPOSITORY = RECORD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Call Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CALL_NUMBER = RECORD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = RECORD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.RepositoryImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__XREF = RECORD__XREF;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CITATIONS = RECORD__CITATIONS;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ADDRESS = RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WEBSITE = RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.MediaImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 10;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__XREF = RECORD__XREF;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CITATIONS = RECORD__CITATIONS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__FILE = RECORD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__FORMAT = RECORD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__TITLE = RECORD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = RECORD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.impl.NoteImpl
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 11;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__XREF = RECORD__XREF;

	/**
	 * The feature id for the '<em><b>Citations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CITATIONS = RECORD__CITATIONS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TEXT = RECORD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = RECORD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.family.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.family.Sex
	 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 12;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see org.nasdanika.models.family.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.family.Family#getMembers()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.nasdanika.models.family.Family#getSources()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.nasdanika.models.family.Family#getRepositories()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Media</em>'.
	 * @see org.nasdanika.models.family.Family#getMedia()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Media();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.nasdanika.models.family.Family#getNotes()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Notes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Family#getEventKinds <em>Event Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Kinds</em>'.
	 * @see org.nasdanika.models.family.Family#getEventKinds()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_EventKinds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.nasdanika.models.family.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Record#getXref <em>Xref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xref</em>'.
	 * @see org.nasdanika.models.family.Record#getXref()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Xref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Record#getCitations <em>Citations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Citations</em>'.
	 * @see org.nasdanika.models.family.Record#getCitations()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Citations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.models.family.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Member#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see org.nasdanika.models.family.Member#getSex()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Sex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Member#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Names</em>'.
	 * @see org.nasdanika.models.family.Member#getNames()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Names();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Member#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.nasdanika.models.family.Member#getEvents()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Events();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.family.Member#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media</em>'.
	 * @see org.nasdanika.models.family.Member#getMedia()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Media();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Kinship <em>Kinship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinship</em>'.
	 * @see org.nasdanika.models.family.Kinship
	 * @generated
	 */
	EClass getKinship();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.family.Kinship#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.nasdanika.models.family.Kinship#getEvents()
	 * @see #getKinship()
	 * @generated
	 */
	EReference getKinship_Events();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.PersonalName <em>Personal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Name</em>'.
	 * @see org.nasdanika.models.family.PersonalName
	 * @generated
	 */
	EClass getPersonalName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getValue()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getGiven <em>Given</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Given</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getGiven()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Given();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getSurname()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Surname();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getNickname()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getPrefix()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getSuffix()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.PersonalName#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.family.PersonalName#getType()
	 * @see #getPersonalName()
	 * @generated
	 */
	EAttribute getPersonalName_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.EventKind <em>Event Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Kind</em>'.
	 * @see org.nasdanika.models.family.EventKind
	 * @generated
	 */
	EClass getEventKind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.EventKind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.family.EventKind#getName()
	 * @see #getEventKind()
	 * @generated
	 */
	EAttribute getEventKind_Name();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.family.EventKind#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.nasdanika.models.family.EventKind#getSuperType()
	 * @see #getEventKind()
	 * @generated
	 */
	EReference getEventKind_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.EventKind#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.nasdanika.models.family.EventKind#getTag()
	 * @see #getEventKind()
	 * @generated
	 */
	EAttribute getEventKind_Tag();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.nasdanika.models.family.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.family.Event#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.nasdanika.models.family.Event#getKind()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.family.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Event#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see org.nasdanika.models.family.Event#getPlace()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Place();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Event#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.family.Event#getValue()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.family.Event#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media</em>'.
	 * @see org.nasdanika.models.family.Event#getMedia()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Media();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Citation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation</em>'.
	 * @see org.nasdanika.models.family.Citation
	 * @generated
	 */
	EClass getCitation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.family.Citation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.family.Citation#getSource()
	 * @see #getCitation()
	 * @generated
	 */
	EReference getCitation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Citation#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page</em>'.
	 * @see org.nasdanika.models.family.Citation#getPage()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Page();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Citation#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see org.nasdanika.models.family.Citation#getQuality()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Quality();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Citation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.family.Citation#getText()
	 * @see #getCitation()
	 * @generated
	 */
	EAttribute getCitation_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.models.family.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Source#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.family.Source#getTitle()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Source#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.nasdanika.models.family.Source#getAuthor()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Source#getPublication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication</em>'.
	 * @see org.nasdanika.models.family.Source#getPublication()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Publication();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.family.Source#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.nasdanika.models.family.Source#getRepository()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Repository();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Source#getCallNumber <em>Call Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Number</em>'.
	 * @see org.nasdanika.models.family.Source#getCallNumber()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_CallNumber();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.nasdanika.models.family.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Repository#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.nasdanika.models.family.Repository#getAddress()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Repository#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see org.nasdanika.models.family.Repository#getWebsite()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Website();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see org.nasdanika.models.family.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Media#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.nasdanika.models.family.Media#getFile()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_File();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Media#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.models.family.Media#getFormat()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Media#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.family.Media#getTitle()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Title();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.family.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.nasdanika.models.family.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.family.Note#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.models.family.Note#getText()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Text();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.family.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see org.nasdanika.models.family.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamilyFactory getFamilyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.FamilyImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MEMBERS = eINSTANCE.getFamily_Members();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__SOURCES = eINSTANCE.getFamily_Sources();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__REPOSITORIES = eINSTANCE.getFamily_Repositories();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MEDIA = eINSTANCE.getFamily_Media();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__NOTES = eINSTANCE.getFamily_Notes();

		/**
		 * The meta object literal for the '<em><b>Event Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__EVENT_KINDS = eINSTANCE.getFamily_EventKinds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.RecordImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Xref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__XREF = eINSTANCE.getRecord_Xref();

		/**
		 * The meta object literal for the '<em><b>Citations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__CITATIONS = eINSTANCE.getRecord_Citations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.MemberImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__SEX = eINSTANCE.getMember_Sex();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__NAMES = eINSTANCE.getMember_Names();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__EVENTS = eINSTANCE.getMember_Events();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__MEDIA = eINSTANCE.getMember_Media();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.KinshipImpl <em>Kinship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.KinshipImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getKinship()
		 * @generated
		 */
		EClass KINSHIP = eINSTANCE.getKinship();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINSHIP__EVENTS = eINSTANCE.getKinship_Events();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.PersonalNameImpl <em>Personal Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.PersonalNameImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getPersonalName()
		 * @generated
		 */
		EClass PERSONAL_NAME = eINSTANCE.getPersonalName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__VALUE = eINSTANCE.getPersonalName_Value();

		/**
		 * The meta object literal for the '<em><b>Given</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__GIVEN = eINSTANCE.getPersonalName_Given();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__SURNAME = eINSTANCE.getPersonalName_Surname();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__NICKNAME = eINSTANCE.getPersonalName_Nickname();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__PREFIX = eINSTANCE.getPersonalName_Prefix();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__SUFFIX = eINSTANCE.getPersonalName_Suffix();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_NAME__TYPE = eINSTANCE.getPersonalName_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.EventKindImpl <em>Event Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.EventKindImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getEventKind()
		 * @generated
		 */
		EClass EVENT_KIND = eINSTANCE.getEventKind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_KIND__NAME = eINSTANCE.getEventKind_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_KIND__SUPER_TYPE = eINSTANCE.getEventKind_SuperType();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_KIND__TAG = eINSTANCE.getEventKind_Tag();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.EventImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__KIND = eINSTANCE.getEvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__PLACE = eINSTANCE.getEvent_Place();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VALUE = eINSTANCE.getEvent_Value();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__MEDIA = eINSTANCE.getEvent_Media();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.CitationImpl <em>Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.CitationImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getCitation()
		 * @generated
		 */
		EClass CITATION = eINSTANCE.getCitation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITATION__SOURCE = eINSTANCE.getCitation_Source();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__PAGE = eINSTANCE.getCitation_Page();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__QUALITY = eINSTANCE.getCitation_Quality();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITATION__TEXT = eINSTANCE.getCitation_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.SourceImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TITLE = eINSTANCE.getSource_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__AUTHOR = eINSTANCE.getSource_Author();

		/**
		 * The meta object literal for the '<em><b>Publication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PUBLICATION = eINSTANCE.getSource_Publication();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__REPOSITORY = eINSTANCE.getSource_Repository();

		/**
		 * The meta object literal for the '<em><b>Call Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__CALL_NUMBER = eINSTANCE.getSource_CallNumber();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.RepositoryImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ADDRESS = eINSTANCE.getRepository_Address();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__WEBSITE = eINSTANCE.getRepository_Website();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.MediaImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__FILE = eINSTANCE.getMedia_File();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__FORMAT = eINSTANCE.getMedia_Format();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__TITLE = eINSTANCE.getMedia_Title();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.impl.NoteImpl
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TEXT = eINSTANCE.getNote_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.family.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.family.Sex
		 * @see org.nasdanika.models.family.impl.FamilyPackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

	}

} //FamilyPackage
