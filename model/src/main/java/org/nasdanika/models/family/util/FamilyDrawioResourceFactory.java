package org.nasdanika.models.family.util;

import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.drawio.model.ModelFactory;
import org.nasdanika.models.family.Person;
import org.nasdanika.persistence.Marker;

/**
 * Uses {@link FamilyDrawioFactory} to load family model from a Drawio diagram. 
 * @author Pavel
 *
 */
public class FamilyDrawioResourceFactory implements Resource.Factory {
	
	protected Function<URI,Person> uriResolver;
	
	public FamilyDrawioResourceFactory(Function<URI,Person> uriResolver) {
		this.uriResolver = uriResolver;
	}
		
	@Override
	public Resource createResource(URI uri) {
		return new FamilyDrawioResource(uri, uriResolver);
	}
	
	protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
		return null;
	}
	
	protected ModelFactory getDrawioFactory() {
		return org.nasdanika.drawio.model.ModelFactory.eINSTANCE;
	}
	
	protected ProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}
			
}
