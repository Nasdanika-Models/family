package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandChild;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandMother;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class GrandMotherFactory extends ServiceCapabilityFactory<Person, GrandMother> {

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(GrandMother.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<GrandMother>>> createService(
			Class<GrandMother> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> grandChildrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(GrandChild.class, null, serviceRequirement), progressMonitor);
			return grandChildrenCS.thenApply(children -> applyChildren(serviceRequirement, children, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<GrandMother>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<GrandMother>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<GrandMother>() {
				
				@Override
				public Flux<GrandMother> getPublisher() {
					return pcp
							.getPublisher()
							.filter(GrandChild.class::isInstance)
							.map(GrandChild.class::cast)
							.filter(gp -> gp.getObject() instanceof Woman)
							.map(gp -> new GrandMother((Woman) gp.getObject(), gp.getSubject(), gp));
				}
			});
		}
		
		return ret;
	}

}
