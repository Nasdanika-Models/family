import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.family.util.FamilyEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.family {
	exports org.nasdanika.models.family;
	exports org.nasdanika.models.family.impl;
	exports org.nasdanika.models.family.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.ncore;
	requires transitive org.nasdanika.models.excel;
	
	provides CapabilityFactory with FamilyEPackageResourceSetCapabilityFactory;
	
}