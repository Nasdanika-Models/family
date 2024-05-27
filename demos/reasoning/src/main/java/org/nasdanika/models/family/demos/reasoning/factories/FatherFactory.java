package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.Objects;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Father;

/**
 * Provides father of a requirement person.
 */
public class FatherFactory extends FactFactory<Father> {

	public FatherFactory(Resource familyResource) {
		super(familyResource);
	}

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(Father.class);
	}

	@Override
	protected Stream<Father> releativesStream(Person person) {
		return Stream.of(person.getFather()) 
				.filter(Objects::nonNull)
				.map(father -> new Father(father, person));
	}

}
