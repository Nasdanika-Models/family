package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Father;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class FatherFactory implements ServiceCapabilityFactory<Person, Father> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type == Father.class;
	}

	@Override
	public CompletionStage<Iterable<CapabilityProvider<Father>>> createService(
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		if (serviceRequirement != null) {
			Man father = serviceRequirement.getFather();
			if (father != null) {
				return CompletableFuture.completedStage(Collections.singleton(new CapabilityProvider<Father>() {

					@Override
					public Flux<Father> getPublisher() {
						return Flux.just(new Father(father, serviceRequirement));
					}
					
				}));
			}
		}
		
		return CompletableFuture.completedStage(Collections.emptyList());
	}

}
