package org.nasdanika.models.family.processors;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.family.FamilyPackage;

@EPackageNodeProcessorFactory(nsURI = FamilyPackage.eNS_URI)
public class EcoreGenFamilyProcessorsFactory {

	private Context context;
	
	@Factory
	public final FamilyProcessorsFactory familyProcessorsFactory;

	@Factory
	public final PersonProcessorsFactory personProcessorsFactory;

	@Factory
	public final ManProcessorsFactory manProcessorsFactory;

	@Factory
	public final WomanProcessorsFactory womanProcessorsFactory;
	
	public EcoreGenFamilyProcessorsFactory(Context context) {
		this.context = context;
		familyProcessorsFactory = new FamilyProcessorsFactory(context);
		manProcessorsFactory = new ManProcessorsFactory(context);
		womanProcessorsFactory = new WomanProcessorsFactory(context);
		personProcessorsFactory = new PersonProcessorsFactory(context);
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Family Model",
			//actionPrototypeRef = "test-package.yml",
			actionPrototype = """
                    app-action:
                        text: Param
                        icon: fas fa-user					
					
					
					""",
			icon = "https://img.icons8.com/officel/30/family--v2.png",
			description = "My description",
			documentation =  """
				# Look at this!
				
				```drawio-resource
				family.drawio
				```
						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
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
