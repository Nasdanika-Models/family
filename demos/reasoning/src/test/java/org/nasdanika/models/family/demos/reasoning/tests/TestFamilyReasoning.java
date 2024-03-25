package org.nasdanika.models.family.demos.reasoning.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.factories.DaughterFactory;
import org.nasdanika.models.family.demos.reasoning.factories.FatherFactory;
import org.nasdanika.models.family.demos.reasoning.factories.MotherFactory;
import org.nasdanika.models.family.demos.reasoning.factories.SisterFactory;
import org.nasdanika.models.family.demos.reasoning.factories.SonFactory;
import org.nasdanika.models.family.demos.reasoning.relatives.Daughter;
import org.nasdanika.models.family.demos.reasoning.relatives.Father;
import org.nasdanika.models.family.demos.reasoning.relatives.Relative;
import org.nasdanika.models.family.util.FamilyDrawioResource;
import org.nasdanika.models.family.util.FamilyDrawioResourceFactory;

import reactor.core.publisher.Flux;

public class TestFamilyReasoning {
	
	protected static Resource familyResource;
	
	@BeforeAll
	public static void loadFamilyResource() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("drawio", new FamilyDrawioResourceFactory(uri -> (Person) resourceSet.getEObject(uri, true)) {
			
			@Override
			protected void filterRepresentationElement(
					org.nasdanika.drawio.ModelElement representationElement, 
					EObject semanticElement,
					Map<EObject, EObject> registry,
					ProgressMonitor progressMonitor) {
				
				// Demo of representation filtering - adding a border to Isa
				org.nasdanika.drawio.ModelElement rme = (org.nasdanika.drawio.ModelElement) representationElement;
				if ("isa".equals(rme.getProperty("semantic-id"))) {
					rme.getStyle().put("imageBorder", "default");
				}
				
				
			}
			
			@Override
			protected String getProperty(FamilyDrawioResource resource, String name) {
				if ("alan".equals(name)) {
					return "Alan";
				}
				return super.getProperty(resource, name);
			}
			
		});
		
		File familyDiagramFile = new File("family.drawio").getCanonicalFile();
		familyResource = resourceSet.getResource(URI.createFileURI(familyDiagramFile.getAbsolutePath()), true);		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testFatherInference() {
		Collection<CapabilityFactory<Object,Object>> factories = new ArrayList<>();
		factories.add((CapabilityFactory) new FatherFactory(familyResource));
		CapabilityLoader capabilityLoader = new CapabilityLoader(factories);
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // PrintStreamProgressMonitor();
		
		TreeIterator<EObject> frit = familyResource.getAllContents();
		while (frit.hasNext()) {
			EObject next = frit.next();
			if (next instanceof Person) {
				System.out.println("--- " + ((Person) next).getName() + " ---");
				for (CapabilityProvider<?> cp: capabilityLoader.load(new ServiceCapabilityFactory.Requirement(Father.class, null, next), progressMonitor)) {
					Flux<?> publisher = cp.getPublisher();					
					publisher.subscribe(System.out::println);
				}				
			}
		}				
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testDaughterInference() {
		Collection<CapabilityFactory<Object,Object>> factories = new ArrayList<>();
		factories.add((CapabilityFactory) new DaughterFactory(familyResource));
		CapabilityLoader capabilityLoader = new CapabilityLoader(factories);
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // PrintStreamProgressMonitor();
		
		for (CapabilityProvider<?> cp: capabilityLoader.load(new ServiceCapabilityFactory.Requirement(Daughter.class, null, null), progressMonitor)) {
			Flux<?> publisher = cp.getPublisher();					
			publisher.subscribe(System.out::println);
		}				
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testRelativesInference() {
		Collection<CapabilityFactory<Object,Object>> factories = new ArrayList<>();
		factories.add((CapabilityFactory) new FatherFactory(familyResource));
		factories.add((CapabilityFactory) new MotherFactory(familyResource));
		factories.add((CapabilityFactory) new SonFactory(familyResource));
		factories.add((CapabilityFactory) new DaughterFactory(familyResource));
		factories.add((CapabilityFactory) new SisterFactory());
//		Aunt.java
//		Brother.java
//		Cousin.java
//		GrandDaughter.java
//		GrandFather.java
//		GrandMother.java
//		GrandSon.java
//		Sister.java
//		Uncle.java
		CapabilityLoader capabilityLoader = new CapabilityLoader(factories);
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // PrintStreamProgressMonitor();
		
		for (CapabilityProvider<?> cp: capabilityLoader.load(ServiceCapabilityFactory.createRequirement(Relative.class), progressMonitor)) {
			Flux<?> publisher = cp.getPublisher();					
			publisher.subscribe(System.out::println);
		}				
	}
	
}
