package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Relative;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public abstract class FactFactory<T extends Relative> extends ServiceCapabilityFactory<Person, T> {
	
	protected Resource familyResource;

	public FactFactory(Resource familyResource) {
		this.familyResource = familyResource;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected Iterable<Object> getResourceContents(Person serviceRequirement) {
		return serviceRequirement == null ? () -> (Iterator) familyResource.getAllContents() : Collections.singleton(serviceRequirement);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<T>>> createService(
			Class<T> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Iterable<Object> pit = getResourceContents(serviceRequirement);		
		
		return CompletableFuture.completedStage(Collections.singleton(new CapabilityProvider<T>() {

			@Override
			public Flux<T> getPublisher() {
				return Flux.fromIterable(pit)
					.filter(Person.class::isInstance)
					.map(Person.class::cast)
					.flatMap(person -> Flux.fromStream(releativesStream(person)));
			}
			
		}));
	}

	protected abstract Stream<T> releativesStream(Person person);

}
