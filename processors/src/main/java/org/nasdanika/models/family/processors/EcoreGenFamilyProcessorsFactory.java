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
			description = "A model of a family",
			documentation =  """
				Family model is used to demonstrate different Nasdanika technologies such as:
				
				* Generating of metamodel (Ecore) documentation like this one
				* Loading of models from MS Excel and Drawio diagrams
				* Generation of HTML sites from loaded models		
				
				The model was created to mimic the model from [Eclipse Sirius Basic Family](https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily) tutorial. 
				This site uses fee icons from [Icons8](https://icons8.com/) and quotes [Wikipedia](https://www.wikipedia.org/) articles.
				
				The diagram below is interactive:
				
				 * Hover the mouse pointer over the shapes and connections to see tooltips
				 * Click on the shapes and connections to navigate to the pages of the respective model elements.
				   
				Click on the diagram to make it fullscreen. Then you may click on the pencil icon to edit it in the browser. 				 				
				
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
