package org.nasdanika.models.family.processors.doc;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.family.Woman;

public class WomanNodeProcessor extends PersonNodeProcessor<Woman> {
	
	public WomanNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
		Context context,
		java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	

//	@Override
//	protected Action createAction(EObject eObject, ProgressMonitor progressMonitor) {
//		Action action = super.createAction(eObject, progressMonitor);
//		action.setIcon("https://img.icons8.com/officexs/24/guest-female.png");		
//		return action;
//	}
	
}
