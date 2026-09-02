package org.nasdanika.models.family.gedcom.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gedcom4j.model.Gedcom;
import org.gedcom4j.model.Individual;
import org.gedcom4j.parser.GedcomParser;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;

public class FamilyTests {
		
	@Test
	public void testFamilyEcoreFamilyResource() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
        
		File markdownFile = new File("src/test/resources/family.ecore.md").getCanonicalFile();
		Resource markdownResource = resourceSet.getResource(URI.createFileURI(markdownFile.getAbsolutePath()), true);		
		EPackage ePackage = (EPackage) markdownResource.getContents().get(0);
		
		File ecoreFile = new File("target/family.ecore").getCanonicalFile();
		Resource ecoreResource = resourceSet.createResource(URI.createFileURI(ecoreFile.getAbsolutePath()));
		ecoreResource.getContents().add(EcoreUtil.copy(ePackage));
		ecoreResource.save(null);
	}
	
	@Test
	public void testGedcomParser() throws Exception {
        // 1. Instantiate the parser
        GedcomParser parser = new GedcomParser();

        try {
            // 2. Load the .ged file
            parser.load("gedcom4j/sample/5.5.1 sample 5.ged");

            // 3. Print out any warnings or errors encountered during parsing
            if (!parser.getErrors().isEmpty()) {
                System.out.println("Errors found: " + parser.getErrors().size());
            }
            if (!parser.getWarnings().isEmpty()) {
                System.out.println("Warnings found: " + parser.getWarnings().size());
            }

            // 4. Get the parsed Gedcom object
            Gedcom gedcom = parser.getGedcom();

            // 5. Access the data (e.g., counting individuals)
            int individualCount = gedcom.getIndividuals().size();
            System.out.println("Successfully loaded " + individualCount + " individuals.");

            // Iterate through individuals and print their IDs
            for (Individual ind : gedcom.getIndividuals().values()) {
                System.out.println("Found individual with ID: " + ind.getXref());
                ind.getNames().forEach(name -> System.out.println("\tName: " + name.getBasic()));
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}