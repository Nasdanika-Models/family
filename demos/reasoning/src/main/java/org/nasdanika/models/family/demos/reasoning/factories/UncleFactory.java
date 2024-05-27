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
import org.nasdanika.models.family.demos.reasoning.relatives.Uncle;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class UncleFactory extends ServiceCapabilityFactory<Person, Uncle> {

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(Uncle.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Uncle>>> createService(
			Class<Uncle> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			CompletionStage<Iterable<CapabilityProvider<Object>>> brothersCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Brother.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenCombine(brothersCS, (children, brothers) -> inferBrothers(serviceRequirement, children, brothers, resolver, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<Uncle>> inferBrothers(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			Iterable<CapabilityProvider<Object>> brotherCapabilityProviders,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Uncle>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<Uncle>() {
				
				@Override
				public Flux<Uncle> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(child -> uncles(person, (Child) child, brotherCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<Uncle> uncles(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> brotherCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<Uncle>> unclePublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> bcp: brotherCapabilityProviders) {
			Flux<Object> brotherPublisher = bcp.getPublisher();
			unclePublishers.add(brotherPublisher
				.map(Brother.class::cast)
				.filter(b -> child.getObject().equals(b.getObject())) // child's parent's brother
				.map(b -> new Uncle(b.getSubject(), child.getSubject(), child, b))
				.filter(b -> person == null || b.getObject().equals(person)));
		}
		
		return Flux.concat(unclePublishers).distinct();		
	}
}
