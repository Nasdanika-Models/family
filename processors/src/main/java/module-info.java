module org.nasdanika.models.family.processors {
		
	requires transitive org.nasdanika.models.family;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.family.processors;
	opens org.nasdanika.models.family.processors; // For loading resources
	
}
