package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Brother;
import org.nasdanika.models.family.demos.reasoning.relatives.Child;
import org.nasdanika.models.family.demos.reasoning.relatives.Son;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class BrotherFactory extends ServiceCapabilityFactory<Person, Brother> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(Brother.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Brother>>> createService(
			Class<Brother> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenApply(children -> applyChildren(serviceRequirement, children,  progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<Brother>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Brother>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<Brother>() {
				
				@Override
				public Flux<Brother> getPublisher() {
					return pcp
						.getPublisher()
						.flatMap(child -> brothers(person, (Child) child, childrenCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<Brother> brothers(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<Brother>> brotherPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> ccp: childrenCapabilityProviders) {
			Flux<Object> childPublisher = ccp.getPublisher();
			brotherPublishers.add(childPublisher
				.filter(Son.class::isInstance) // only sons
				.map(Son.class::cast)
				.filter(s -> !s.getSubject().equals(child.getSubject())) // only siblings, not self
				.filter(s -> child.getObject().equals(s.getObject())) // same parent
				.map(s -> new Brother(s.getSubject(), child.getSubject(), child, s))
				.filter(s -> person == null || s.getObject().equals(person)));
		}
		
		return Flux.concat(brotherPublishers).distinct();		
	}
}
