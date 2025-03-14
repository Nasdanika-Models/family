import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.family.processors.doc.FamilyNodeProcessorFactoryCapabilityFactory;
import org.nasdanika.models.family.processors.ecore.ECoreGenFamilyProcessorsCapabilityFactory;

module org.nasdanika.models.family.processors {
		
	requires transitive org.nasdanika.models.family;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.family.processors.ecore;
	opens org.nasdanika.models.family.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.family.processors.doc;
	opens org.nasdanika.models.family.processors.doc; // For loading resources

	provides CapabilityFactory with 
		FamilyNodeProcessorFactoryCapabilityFactory,
		ECoreGenFamilyProcessorsCapabilityFactory; 	
	
}
