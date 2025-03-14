package org.nasdanika.models.family.processors.doc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.models.app.graph.emf.OutgoingReferenceBuilder;
import org.nasdanika.models.family.Family;
import org.nasdanika.models.family.FamilyPackage;

public class FamilyNodeProcessor extends EObjectNodeProcessor<Family> {
	
	public FamilyNodeProcessor(
		NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
		Context context,
		java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}		
	
	/**
	* Suppressing default behavior, explicit specification of how to build.
	*/	
	@Override
	protected void addReferenceChildren(
		EReference eReference, 
		Collection<Label> labels, 
		Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
		ProgressMonitor progressMonitor) {
	}
		
	@OutgoingReferenceBuilder(
			nsURI = FamilyPackage.eNS_URI,
			classID = FamilyPackage.FAMILY,
			referenceID = FamilyPackage.FAMILY__MEMBERS)
	public void buildElementsOutgoingReference(
			EReference eReference,
			List<Entry<EReferenceConnection, WidgetFactory>> referenceOutgoingEndpoints, 
			Collection<Label> labels,
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {

		for (Label tLabel: labels) {
			for (Collection<Label> re: outgoingLabels.values()) { 
				tLabel.getChildren().addAll(re);
			}
		}
	}
	
	@Override
	public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
		super.configureLabel(source, label, progressMonitor);
		if (source == getTarget() && label instanceof Action) {
			String location = ((Action) label).getLocation();
			URI uri = getUri();
			if (uri != null && location != null && uri.toString().equals(location)) {
				label.setIcon("https://img.icons8.com/officexs/24/family--v1.png");
			}
		}		
	}
	
}
