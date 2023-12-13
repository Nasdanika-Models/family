package org.nasdanika.models.family.processors.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil.EModelElementDocumentation;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.family.FamilyPackage;

@EClassifierNodeProcessorFactory(classifierID = FamilyPackage.MAN)
public class ManProcessorsFactory {
	
	private Context context;
	
	public ManProcessorsFactory(Context context) {
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
			// label = "Man",
			description = "An adult male human",
			documentation = """
					A man is an adult male human. Prior to adulthood, a male human is referred to as a boy (a male child or adolescent).
					
					
					## Etymology
					
					The English term "man" is derived from the Proto-Indo-European root *man- (see Sanskrit/Avestan manu-, Slavic mǫž "man, male").
					More directly, the word derives from Old English mann. 
					The Old English form primarily meant "person" or "human being" and referred to men, women, and children alike. 
					The Old English word for "man" as distinct from "woman" or "child" was wer. 
					Mann only came to mean "man" in Middle English, replacing wer, which survives today only in the compounds "werewolf" (from Old English werwulf, literally "man-wolf"), 
					and "wergild", literally "man-payment".
					
					""",
			icon = "https://img.icons8.com/officexs/16/user.png"
	)
	public EClassNodeProcessor createFoxProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
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
			
			@Override
			protected EModelElementDocumentation getLoadDocumentation() {
				return new EModelElementDocumentation("""
						Some ``documentation``:
						
						```yaml
						key: value
						```
						
						""", 
						Util.createClassURI(getClass()));
			}
						
		};
	}	

}
