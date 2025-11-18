package org.nasdanika.models.family.processors.doc;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.family.Man;

public class ManNodeProcessor extends PersonNodeProcessor<Man> {
	
	public ManNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		if (source == getTarget() && label instanceof Action) {
			String location = ((Action) label).getLocation();
			URI uri = getUri();
			if (uri != null && location != null && uri.toString().equals(location)) {
				label.setIcon("https://img.icons8.com/officexs/24/user.png");
			}
		}		
	}
	
}
