package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;
import org.nasdanika.models.family.demos.reasoning.relatives.Daughter;
import org.nasdanika.models.family.demos.reasoning.relatives.Parent;
import org.nasdanika.models.family.demos.reasoning.relatives.Sister;
import org.reactivestreams.Publisher;

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
		
		if (serviceRequirement != null) {			
			// Sister is a daughter of the same parent.
			// We can get parent directly, but we'll use parent requirement
			CompletionStage<Iterable<CapabilityProvider<Object>>> parentsCs = resolver.apply(ServiceCapabilityFactory.createRequirement(Parent.class, null, serviceRequirement), progressMonitor);
			return parentsCs.thenApply(parents -> applyParents(serviceRequirement, parents, resolver, progressMonitor));
			
//			return CompletableFuture.completedStage(Collections.singleton(new CapabilityProvider<Sister>() {
//
//				@Override
//				public Flux<Sister> getPublisher() {
//					return Flux.fromStream(
//							serviceRequirement
//								.getChildren()
//								.stream()
//								.filter(Woman.class::isInstance)
//								.map(Woman.class::cast)
//								.map(daughter -> new Daughter(daughter, serviceRequirement)));
//				}
//				
//			}));
		}
		
		return CompletableFuture.completedStage(Collections.emptyList());
	}
	
	protected Iterable<CapabilityProvider<Sister>> applyParents(
			Person person,
			Iterable<CapabilityProvider<Object>> parentsCapabilityProviders,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Sister>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: parentsCapabilityProviders) {
			ret.add(new CapabilityProvider<Sister>() {
				
				@Override
				public Flux<Sister> getPublisher() {
					return pcp
							.getPublisher()
							.flatMap(parent -> sisters((Parent) parent, resolver, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected Flux<Sister> sisters(
			Parent parent,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		// Getting subject's daughters and filtering for non-equality to object		
		CompletionStage<Iterable<CapabilityProvider<Object>>> daughtersCs = resolver.apply(ServiceCapabilityFactory.createRequirement(Daughter.class, null, parent.getSubject()), progressMonitor);
		Iterable<CapabilityProvider<Object>> daughtersCp = daughtersCs.toCompletableFuture().join();
		Collection<Publisher<Daughter>> dp = new ArrayList<>();
		for (CapabilityProvider<Object> dcp: daughtersCp) {
			dp.add((Publisher) dcp.getPublisher());
		}
		return Flux.concat(dp)
			.filter(d -> d.getSubject() != parent.getObject())
			.map(d -> new Sister((Woman) d.getSubject(), parent.getObject()));
	}
}
