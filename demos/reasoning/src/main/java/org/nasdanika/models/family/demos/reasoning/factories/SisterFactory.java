package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Child;
import org.nasdanika.models.family.demos.reasoning.relatives.Daughter;
import org.nasdanika.models.family.demos.reasoning.relatives.Sister;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class SisterFactory extends ServiceCapabilityFactory<Person, Sister> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(Sister.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Sister>>> createService(
			Class<Sister> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenApply(children -> applyChildren(serviceRequirement, children, resolver, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<Sister>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Sister>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<Sister>() {
				
				@Override
				public Flux<Sister> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(child -> sisters(person, (Child) child, childrenCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<Sister> sisters(
			Person person,
			Child child,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		System.out.println("--- " + child);
		childPublisher.subscribe(System.out::println);
		
//		return childPublisher
//			.filter(c -> {
//				System.out.println("\t" + c);
//				return true;
//			})	
//			.filter(Daughter.class::isInstance) // only daughters
//			.map(Daughter.class::cast)
//			.filter(d -> !d.getSubject().equals(child.getSubject())) // only siblings, not self
//			.filter(d -> child.getObject().equals(d.getObject())) // same parent
//			.map(d -> new Sister(d.getSubject(), child.getSubject(), child, d))
//			.filter(s -> person == null || s.getObject().equals(person));
		
		return Flux.empty();
	}
}
