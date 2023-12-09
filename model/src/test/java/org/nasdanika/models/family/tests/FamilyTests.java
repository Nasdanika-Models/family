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
import org.nasdanika.models.family.Family;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.util.FamilyResourceFactory;

public class FamilyTests {
	
	@Test
	public void testLoadFamilyFromExcel() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new FamilyResourceFactory());
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
	}
	
}
