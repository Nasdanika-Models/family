package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;
import org.nasdanika.models.family.demos.reasoning.relatives.Daughter;

/**
 * Provides father of a requirement person.
 */
public class DaughterFactory extends FactFactory<Daughter> {

	public DaughterFactory(Resource familyResource) {
		super(familyResource);
	}

	@Override
	public boolean isForServiceType(Class<?> type) {
		return type.isAssignableFrom(Daughter.class);
	}

	@Override
	protected Stream<Daughter> releativesStream(Person person) {
		return person
			.getChildren()
			.stream()
			.filter(Woman.class::isInstance)
			.map(Woman.class::cast)
			.map(daughter -> new Daughter(daughter, person));
	}

}
