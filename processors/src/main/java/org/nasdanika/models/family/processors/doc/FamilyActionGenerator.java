package org.nasdanika.models.family.processors.doc;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.common.Context;
import org.nasdanika.html.model.app.graph.emf.ActionGenerator;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.ncore.NcorePackage;

public class FamilyActionGenerator extends ActionGenerator {

	public FamilyActionGenerator(
			Collection<? extends EObject> sources, 
			Collection<? extends EObject> references,
			Function<? super EObject, URI> uriResolver,
			FamilyNodeProcessorFactory nodeProcessorFactory) {
		super(sources, references, uriResolver, nodeProcessorFactory);
	}
	
	private static Map<EPackage, URI> REFERENCES = Map.ofEntries(
			Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
			Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
			Map.entry(FamilyPackage.eINSTANCE, URI.createURI("https://family.models.nasdanika.org/")));
		
	public FamilyActionGenerator(
			EObject source,
			URI baseURI,
			FamilyNodeProcessorFactory nodeProcessorFactory) {
		super(
			Collections.singleton(source), 
			REFERENCES.keySet(), 
			eObj -> {
				if (eObj == source) {
					return baseURI;
				}
				return REFERENCES.get(eObj);
			},
			nodeProcessorFactory);
	}
		
	public FamilyActionGenerator(EObject source, FamilyNodeProcessorFactory nodeProcessorFactory) {
		this(source, URI.createURI("tmp://" + UUID.randomUUID() + "/" + UUID.randomUUID() + "/"), nodeProcessorFactory);
	}
	
	public FamilyActionGenerator(EObject source) {
		this(source, new FamilyNodeProcessorFactory(Context.EMPTY_CONTEXT, null));
	}
	
}
