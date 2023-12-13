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
import org.nasdanika.models.ecore.graph.processors.EAttributeNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.ecore.graph.processors.EStructuralFeatureNodeProcessorFactory;
import org.nasdanika.models.family.FamilyPackage;

@EClassifierNodeProcessorFactory(classifierID = FamilyPackage.PERSON)
public class PersonProcessorsFactory {
	
	private Context context;
	
	public PersonProcessorsFactory(Context context) {
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
			label = "Person",
			description = "In this model a person is an abstract supertype of Man and Woman",
			documentation = 
					"""
					A person (pl.: people or persons, depending on context) is a being who has certain capacities or attributes such as reason, morality, 
					consciousness or self-consciousness, and being a part of a culturally established form of social relations such as kinship, 
					ownership of property, or legal responsibility. The defining features of personhood and, consequently, what makes a person count as a person, 
					differ widely among cultures and contexts.

					In addition to the question of personhood, of what makes a being count as a person to begin with, there are further questions about personal identity and self: 
					both about what makes any particular person that particular person instead of another, 
					and about what makes a person at one time the same person as they were or will be at another time despite any intervening changes.

					The plural form "people" is often used to refer to an entire nation or ethnic group (as in "a people"), and this was the original meaning of the word; 
					it subsequently acquired its use as a plural form of person. The plural form "persons" is often used in philosophical and legal writing.
					""",
			icon = "fas fa-user"
	)
	public EClassNodeProcessor createPersonProcessor(
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
	
	@EStructuralFeatureNodeProcessorFactory(
			nsURI = FamilyPackage.eNS_URI,
			classID = FamilyPackage.PERSON,
			featureID = FamilyPackage.PERSON__MOTHER,
			description = "A woman parent of this person",
			documentation = """
					A mother is the female parent of a child. In this model the "mother" reference is derived (computed) from the parents reference.  
					A woman may be considered a mother by virtue of having given birth, by raising a child who may or may not be her biological offspring, or by supplying her ovum for fertilisation in the case of gestational surrogacy.

					A biological mother is the female genetic contributor to the creation of the infant, through sexual intercourse or egg donation. 
					A biological mother may have legal obligations to a child not raised by her, such as an obligation of monetary support. 
					An adoptive mother is a female who has become the child's parent through the legal process of adoption. 
					A putative mother is a female whose biological relationship to a child is alleged but has not been established. 
					A stepmother is a non-biological female parent married to a child's preexisting parent, and may form a family unit but generally does not have the legal rights and responsibilities of a parent in relation to the child.
					"""
	)
	public EAttributeNodeProcessor createAnimalNameProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
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
			
		};
	}	

}
