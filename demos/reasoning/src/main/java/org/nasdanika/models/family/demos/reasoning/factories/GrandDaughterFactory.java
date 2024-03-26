package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandDaughter;
import org.nasdanika.models.family.demos.reasoning.relatives.Child;
import org.nasdanika.models.family.demos.reasoning.relatives.Daughter;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class GrandDaughterFactory extends ServiceCapabilityFactory<Person, GrandDaughter> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(GrandDaughter.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<GrandDaughter>>> createService(
			Class<GrandDaughter> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenApply(children -> applyChildren(serviceRequirement, children,  progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<GrandDaughter>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<GrandDaughter>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<GrandDaughter>() {
				
				@Override
				public Flux<GrandDaughter> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(child -> grandDaughters(person, (Child) child, childrenCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<GrandDaughter> grandDaughters(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<GrandDaughter>> grandDaughterPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> ccp: childrenCapabilityProviders) {
			Flux<Object> childPublisher = ccp.getPublisher();
			grandDaughterPublishers.add(childPublisher
				.filter(Daughter.class::isInstance) // only sons
				.map(Daughter.class::cast)
				.filter(s -> child.getSubject().equals(s.getObject())) 
				.map(s -> new GrandDaughter(s.getSubject(), child.getObject(), child, s))
				.filter(s -> person == null || s.getObject().equals(person)));
		}
		
		return Flux.concat(grandDaughterPublishers).distinct();		
	}
}
