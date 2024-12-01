package org.nasdanika.models.family.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Family;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.util.FamilyWorkbookResourceFactory;

public class FamilyTests {
	
	@Test
	public void testLoadFamilyFromWorkbook() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new FamilyWorkbookResourceFactory());
		File test = new File("family.xlsx").getCanonicalFile();
		Resource familyResource = resourceSet.getResource(URI.createFileURI(test.getAbsolutePath()), true);
		assertEquals(1, familyResource.getContents().size());
		Family family = (Family) familyResource.getContents().get(0);
		assertEquals("Sample family", family.getName());
		EList<Person> members = family.getMembers();
		assertEquals(11, members.size());

		Person albert = members.get(0);
		assertTrue(albert instanceof Man);
		assertEquals("Albert", albert.getName());
		Date albertDOB = albert.getDateOfBirth();
		System.out.println(albertDOB);
		assertNotNull(albertDOB);
		Calendar calendar = Calendar.getInstance();
		calendar.set(1947, 2, 10);
		Date expectedDOB = calendar.getTime();
		System.out.println(expectedDOB);
		assertEquals(
				TimeUnit.DAYS.convert(expectedDOB.getTime(), TimeUnit.MILLISECONDS) , 
				TimeUnit.DAYS.convert(albertDOB.getTime(), TimeUnit.MILLISECONDS));
		
		Person dave = members.stream().filter(m -> m.getName().equals("Dave")).findAny().get();
		assertEquals("Elias", dave.getFather().getName());
		assertEquals(2, dave.getFather().getParents().size());
		assertEquals(4, dave.getFather().getChildren().size());
		assertEquals(1, dave.getChildren().size());
		assertEquals(1, dave.getParents().size());
	}
	
	@Test
	public void testLoadFamilyFromDrawioDiagram() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File familyDiagramFile = new File("family.drawio").getCanonicalFile();
		Resource familyResource = resourceSet.getResource(URI.createFileURI(familyDiagramFile.getAbsolutePath()), true);
		assertEquals(1, familyResource.getContents().size());
		Family family = (Family) familyResource.getContents().get(0);
		assertEquals("Sample Family", family.getName());

		EList<Person> members = family.getMembers();
		assertEquals(11, members.size());
		
		// Comparator
		assertEquals("alain", members.get(0).getId()); 
		assertEquals("albert", members.get(1).getId()); 
		assertEquals("bryan", members.get(2).getId()); 

		Person albert = members
				.stream()
				.filter(m -> "albert".equals(m.getId()))
				.findFirst().get();
		assertTrue(albert instanceof Man);
		assertEquals("Albert", albert.getName());
		
		Person dave = members
				.stream()
				.filter(m -> m.getName().equals("Dave"))
				.findAny()
				.get();
		assertEquals("Elias", dave.getFather().getName());
		assertEquals(2, dave.getFather().getParents().size());
		assertEquals(4, dave.getFather().getChildren().size());
		assertEquals(1, dave.getChildren().size());
		assertEquals(1, dave.getParents().size());
	}	
	
}
