package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandChild;
import org.nasdanika.models.family.demos.reasoning.relatives.GrandFather;

import reactor.core.publisher.Flux;

/**
 * Provides father of a requirement person.
 */
public class GrandFatherFactory extends ServiceCapabilityFactory<Person, GrandFather> {

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(GrandFather.class);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<GrandFather>>> createService(
			Class<GrandFather> serviceType,
			Person serviceRequirement,
			BiFunction<Object, ProgressMonitor, CompletionStage<Iterable<CapabilityProvider<Object>>>> resolver,
			ProgressMonitor progressMonitor) {
			
			CompletionStage<Iterable<CapabilityProvider<Object>>> grandChildrenCS = resolver.apply(ServiceCapabilityFactory.createRequirement(GrandChild.class, null, serviceRequirement), progressMonitor);
			return grandChildrenCS.thenApply(children -> applyChildren(serviceRequirement, children, progressMonitor));
	}
	
	protected Iterable<CapabilityProvider<GrandFather>> applyChildren(
			Person person,
			Iterable<CapabilityProvider<Object>> childrenCapabilityProviders,
			ProgressMonitor progressMonitor) {
		
		Collection<CapabilityProvider<GrandFather>> ret = new ArrayList<>();
		
		for (CapabilityProvider<Object> pcp: childrenCapabilityProviders) {
			ret.add(new CapabilityProvider<GrandFather>() {
				
				@Override
				public Flux<GrandFather> getPublisher() {
					return pcp
							.getPublisher()
							.filter(GrandChild.class::isInstance)
							.map(GrandChild.class::cast)
							.filter(gp -> gp.getObject() instanceof Man)
							.map(gp -> new GrandFather((Man) gp.getObject(), gp.getSubject(), gp));
				}
			});
		}
		
		return ret;
	}

}
