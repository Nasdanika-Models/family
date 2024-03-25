package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;
import org.nasdanika.models.family.demos.reasoning.relatives.Mother;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class MotherFactory extends FactFactory<Mother> {

	public MotherFactory(Resource familyResource) {
		super(familyResource);
	}

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(Mother.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Mother>>> createService(
			Class<Mother> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		if (serviceRequirement != null) {
			Woman mother = serviceRequirement.getMother();
			if (mother != null) {
				return CompletableFuture.completedStage(Collections.singleton(new CapabilityProvider<Mother>() {

					@Override
					public Flux<Mother> getPublisher() {
						return Flux.just(new Mother(mother, serviceRequirement));
					}
					
				}));
			}
		}
		
		return CompletableFuture.completedStage(Collections.emptyList());
	}

	@Override
	protected Stream<Mother> releativesStream(Person person) {
		return Stream.of(person.getMother()) 
				.filter(Objects::nonNull)
				.map(mother -> new Mother(mother, person));
	}

}
