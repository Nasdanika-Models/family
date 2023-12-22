package org.nasdanika.models.family.demos.excel.tests;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.diagramgenerator.plantuml.PlantUMLDiagramGenerator;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.models.family.processors.doc.FamilyActionGenerator;
import org.nasdanika.models.family.processors.doc.FamilyNodeProcessorFactory;
import org.nasdanika.models.family.util.FamilyWorkbookResourceFactory;

public class TestFamilySiteGenFromWorkbook {
	
	@Test
	public void testGenerateFamilySiteFromWorkbook() throws Exception {
		
		// Loading of a family model from an MS Excel file using a resource factory
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new FamilyWorkbookResourceFactory());
		File familyWorkbook = new File("family.xlsx").getCanonicalFile();
		Resource familyResource = resourceSet.getResource(URI.createFileURI(familyWorkbook.getAbsolutePath()), true);		
		
		// Generating an action model
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
								
		File output = new File(actionModelsDir, "family-actions.xmi");
				
		FamilyActionGenerator actionGenerator = new FamilyActionGenerator(
				familyResource.getContents().get(0),
				new FamilyNodeProcessorFactory(context, null));
		
		actionGenerator.generateActionModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "family-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://family.models.nasdanika.org/demos/excel";		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTemplateURI, 
				siteMapDomain, 
				new File("../../docs/demos/excel"), // Publishing to the repository's docs directory for GitHub pages 
				new File("target/family-doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errors.size() != 11) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}
	
}
