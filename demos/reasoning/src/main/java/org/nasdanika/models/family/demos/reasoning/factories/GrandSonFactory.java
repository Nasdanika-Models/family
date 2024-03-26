package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandSon;
import org.nasdanika.models.family.demos.reasoning.relatives.Child;
import org.nasdanika.models.family.demos.reasoning.relatives.Son;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class GrandSonFactory extends ServiceCapabilityFactory<Person, GrandSon> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(GrandSon.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<GrandSon>>> createService(
			Class<GrandSon> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenApply(children -> applyChildren(serviceRequirement, children,  progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<GrandSon>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<GrandSon>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<GrandSon>() {
				
				@Override
				public Flux<GrandSon> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(child -> grandSons(person, (Child) child, childrenCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<GrandSon> grandSons(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<GrandSon>> grandSonPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> ccp: childrenCapabilityProviders) {
			Flux<Object> childPublisher = ccp.getPublisher();
			grandSonPublishers.add(childPublisher
				.filter(Son.class::isInstance) // only sons
				.map(Son.class::cast)
				.filter(s -> child.getSubject().equals(s.getObject())) 
				.map(s -> new GrandSon(s.getSubject(), child.getObject(), child, s))
				.filter(s -> person == null || s.getObject().equals(person)));
		}
		
		return Flux.concat(grandSonPublishers).distinct();		
	}
}
