package org.nasdanika.models.family.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.drawio.emf.DrawioResource;
import org.nasdanika.drawio.model.ModelFactory;
import org.nasdanika.drawio.model.util.AbstractDrawioFactory;
import org.nasdanika.models.family.Person;
import org.nasdanika.persistence.Marker;

/**
 * Loads Drawio model using {@link DrawioResource} and then transforms it to the family model.
 */
public class FamilyDrawioResource extends ResourceImpl {
	
	protected Function<URI,Person> uriResolver;
	
	public FamilyDrawioResource(Function<URI,Person> uriResolver) {
		super();
		this.uriResolver = uriResolver;
	}

	public FamilyDrawioResource(URI uri, Function<URI,Person> uriResolver) {
		super(uri);
		this.uriResolver = uriResolver;
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Resource diagramResource = new DrawioResource(getURI()) {

			@Override
			protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
				return FamilyDrawioResource.this.getMarkerFactory();
			}

			@Override
			protected ModelFactory getFactory() {
				return FamilyDrawioResource.this.getDrawioFactory();
			}
			
		};
		
		diagramResource.load(inputStream, options);
		
		FamilyDrawioFactory familyDrawioFactory = new FamilyDrawioFactory() {

			@Override
			protected Person getByRefId(String refId, int pass, Map<EObject, EObject> registry) {
				return FamilyDrawioResource.this.getByRefId(refId, pass, registry);
			}
			
			@Override
			protected URI getAppBase() {
				return FamilyDrawioResource.this.getAppBase();
			}
			
		};
		
		Transformer<EObject,EObject> familyFactory = new Transformer<>(familyDrawioFactory);
		Collection<EObject> diagramModelContents = new ArrayList<>();
		diagramResource.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.drawio.model.Document
					|| e instanceof org.nasdanika.drawio.model.Page
					|| e instanceof org.nasdanika.drawio.model.ModelElement) {
				diagramModelContents.add(e);
			}
		});
		
		Map<EObject, EObject> familyElements = familyFactory.transform(diagramModelContents, false, getProgressMonitor());
		
		diagramResource.getContents().stream().map(familyElements::get).forEach(getContents()::add);
	}

	protected ProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}

	protected Function<Marker, org.nasdanika.ncore.Marker> getMarkerFactory() {
		return null;
	}

	protected ModelFactory getDrawioFactory() {
		return org.nasdanika.drawio.model.ModelFactory.eINSTANCE;
	}	
	
	protected Person getByRefId(String refId, int pass, Map<EObject, EObject> registry) {
		if (uriResolver == null) {
			return null;
		}
		
		URI refURI = URI.createURI(refId);
		if(!getURI().isRelative()) {
			refURI = refURI.resolve(getURI());
		}
		return uriResolver.apply(refURI);
	}	

	protected URI getAppBase() {
		return AbstractDrawioFactory.DEFAULT_APP_BASE;
	}
	
}