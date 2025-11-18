package org.nasdanika.models.family.processors.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EmfUtil.EModelElementDocumentation;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.family.FamilyPackage;

@EClassifierNodeProcessorFactory(classifierID = FamilyPackage.FAMILY)
public class FamilyProcessorsFactory {
	private Context context;
	
	public FamilyProcessorsFactory(Context context) {
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
			icon = "https://img.icons8.com/officexs/24/family--v1.png", 
			description = "Family is a group of related people",
			documentation = 
                    """
                    [Family](https://en.wikipedia.org/wiki/Family) (from Latin: _familia_) is a group of people related either by consanguinity (by recognized birth) or affinity (by marriage or other relationship). 
                    It forms the basis for social order. The purpose of the family is to maintain the well-being of its members and of society. 
                    Ideally, families offer predictability, structure, and safety as members mature and learn to participate in the community.
                    Historically, most human societies use family as the primary locus of attachment, nurturance, and socialization.

                    Anthropologists classify most family organizations as matrifocal (a mother and her children), patrifocal (a father and his children), 
                    conjugal (a married couple with children, also called the nuclear family), avuncular (a man, his sister, and her children), 
                    or extended (in addition to parents and children, may include grandparents, aunts, uncles, or cousins).

                    The field of genealogy aims to trace family lineages through history. 
                    The family is also an important economic unit studied in family economics. 
                    The word "families" can be used metaphorically to create more inclusive categories such as community, nationhood, and global village.					
                    """
	)
	public EClassNodeProcessor createFamilyProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
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
			
			@Override
			protected EModelElementDocumentation getLoadDocumentation() {
				return new EModelElementDocumentation("""
						Load documentation with code snippets:
						
						```yaml
						key: value
						```
						
						""", 
						Util.createClassURI(getClass()));
			}			
			
		};
	}
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FamilyPackage.eNS_URI,
			classID = FamilyPackage.FAMILY,
			featureID = FamilyPackage.FAMILY__MEMBERS,
			label = "Members",
			description = "A collection of family members",
			documentation = "Some documentation about family members reference"
	)
	public EAttributeNodeProcessor createFamilyMembersProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EAttributeNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
			@Override
			public String getLoadDescription() {
				return "Description how to load family members. The description is shown in the load specification table. Details like snippets shall go to documentation";
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
