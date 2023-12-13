module org.nasdanika.models.family.processors {
		
	requires transitive org.nasdanika.models.family;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.family.processors.ecore;
	opens org.nasdanika.models.family.processors.ecore; // For loading resources
	
	exports org.nasdanika.models.family.processors.doc;
	opens org.nasdanika.models.family.processors.doc; // For loading resources
	
}
