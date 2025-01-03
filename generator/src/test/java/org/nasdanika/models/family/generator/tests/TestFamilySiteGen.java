package org.nasdanika.models.family.generator.tests;

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
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.family.processors.doc.FamilyHtmlAppGenerator;
import org.nasdanika.models.family.processors.doc.FamilyNodeProcessorFactory;
import org.nasdanika.models.family.util.FamilyWorkbookResourceFactory;

public class TestFamilySiteGen {
	
	@Test
	public void testGenerateFamilySite() throws Exception {		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new FamilyWorkbookResourceFactory());
		File familyWorkbook = new File("../model/family.xlsx").getCanonicalFile();
		Resource familyResource = resourceSet.getResource(URI.createFileURI(familyWorkbook.getAbsolutePath()), true);		
		
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
								
		File output = new File(actionModelsDir, "family-actions.xmi");
		
		FamilyHtmlAppGenerator htmlAppGenerator = new FamilyHtmlAppGenerator(
				familyResource.getContents().get(0),
				new FamilyNodeProcessorFactory(context, null));
		
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
		
		String rootActionResource = "family-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://family.models.nasdanika.org/demos/simple";		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTemplateURI, 
				siteMapDomain, 
				new File("../docs/demos/simple"), 
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
