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
import org.nasdanika.models.family.demos.reasoning.relatives.Cousin;
import org.nasdanika.models.family.demos.reasoning.relatives.Sibling;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class CousinFactory extends ServiceCapabilityFactory<Person, Cousin> {

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(Cousin.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Cousin>>> createService(
			Class<Cousin> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> childrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Child.class, null, serviceRequirement), progressMonitor);
			CompletionStage<Iterable<CapabilityProvider<Object>>> siblingsCS = resolver.apply(ServiceCapabilityFactory.createRequirement(Sibling.class, null, serviceRequirement), progressMonitor);
			return childrenCS.thenCombine(siblingsCS, (children, brothers) -> inferBrothers(serviceRequirement, children, brothers, resolver, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<Cousin>> inferBrothers(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			Iterable<CapabilityProvider<Object>> siblingCapabilityProviders,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<Cousin>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> scp: siblingCapabilityProviders) {
			ret.add(new CapabilityProvider<Cousin>() {
				
				@Override
				public Flux<Cousin> getPublisher() {
					return scp
							.getPublisher()
							.flatMap(sibling -> subjectChildren(person, (Sibling) sibling, childrenCapabilityProviders, progressMonitor));
				}
			});
		}
		
		return ret;
	}
	
	protected Flux<Cousin> subjectChildren(
			Person person,
			Sibling sibling,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<Cousin>> cousinPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> ccp: childrenCapabilityProviders) {
			Flux<Object> childrenPublisher = ccp.getPublisher();
			cousinPublishers.add(childrenPublisher
				.map(Child.class::cast)
				.filter(sc -> sc.getObject().equals(sibling.getSubject())) // Sibling's subject children
				.flatMap(sc -> objectChildren(person, sibling, sc, childrenCapabilityProviders, progressMonitor)));
		}
		
		return Flux.concat(cousinPublishers).distinct();		
	}
	
	protected Flux<Cousin> objectChildren(
			Person person,
			Sibling sibling,
			Child subjectChild,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<Flux<Cousin>> objectChildrenPublishers = new ArrayList<>();
		
		for (CapabilityProvider<Object> ccp: childrenCapabilityProviders) {
			Flux<Object> childrenPublisher = ccp.getPublisher();
			objectChildrenPublishers.add(childrenPublisher
				.map(Child.class::cast)
				.filter(oc -> oc.getObject().equals(sibling.getObject()))
				.map(oc -> new Cousin(oc.getSubject(), subjectChild.getSubject(), sibling, subjectChild, oc))
				.filter(cousin -> person == null || cousin.getObject().equals(person)));
		}
		
		return Flux.concat(objectChildrenPublishers).distinct();		
	}
	
}
