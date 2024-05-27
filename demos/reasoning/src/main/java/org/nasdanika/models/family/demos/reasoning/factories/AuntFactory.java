package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Aunt;
import org.nasdanika.models.family.demos.reasoning.relatives.Child;
import org.nasdanika.models.family.demos.reasoning.relatives.Sister;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class AuntFactory extends ServiceCapabilityFactory<Person, Aunt> {

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(Aunt.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Aunt>>> createService(
			Class<Aunt> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			CompletionStage<Iterable<CapabilityProvider<Object>>> sistersCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Sister.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenCombine(sistersCS, (children, sisters) -> inferSisters(serviceRequirement, children, sisters, resolver, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<Aunt>> inferSisters(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			Iterable<CapabilityProvider<Object>> sisterCapabilityProviders,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Aunt>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<Aunt>() {
				
				@Override
				public Flux<Aunt> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(child -> aunts(person, (Child) child, sisterCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<Aunt> aunts(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> sisterCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<Aunt>> auntPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> bcp: sisterCapabilityProviders) {
			Flux<Object> sisterPublisher = bcp.getPublisher();
			auntPublishers.add(sisterPublisher
				.map(Sister.class::cast)
				.filter(b -> child.getObject().equals(b.getObject())) // child's parent's sister
				.map(b -> new Aunt(b.getSubject(), child.getSubject(), child, b))
				.filter(b -> person == null || b.getObject().equals(person)));
		}
		
		return Flux.concat(auntPublishers).distinct();		
	}
}
