package org.nasdanika.models.family.processors.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.family.FamilyPackage;

@EClassifierNodeProcessorFactory(classifierID = FamilyPackage.WOMAN)
public class WomanProcessorsFactory {
	
	private Context context;
	
	public WomanProcessorsFactory(Context context) {
		this.context = context;
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			// label = "Woman",
			description = "An adult female human",
			documentation = """
					A woman is an adult female human. Prior to adulthood, one is referred to as a girl (a female child or adolescent).
					
					## Etymology
					
					The spelling of "woman" in English has progressed over the past millennium from wīfmann to wīmmann to wumman, and finally, 
					the modern spelling woman. In Old English, wīfmann meant 'woman' (literally 'woman-person'), whereas wermann meant '[man](../Man/index.html)'. 
					Mann had a gender-neutral meaning of 'human', corresponding to Modern English '[person](../Person/index.html)' or 'someone'; 
					however, subsequent to the Norman Conquest, man began to be used more in reference to 'male human', and by the late 13th century it had begun 
					to eclipse usage of the older term wer. The medial labial consonants f and m in wīfmann coalesced into the modern form "woman", 
					while the initial element wīf, which had also meant 'woman', underwent semantic narrowing to the sense of a married woman ('wife').
					""",
			icon = "https://img.icons8.com/officexs/24/guest-female.png"
	)
	public EClassNodeProcessor createFoxProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
						
		};
	}	

}
