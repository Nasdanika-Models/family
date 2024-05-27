package org.nasdanika.models.family.demos.reasoning.factories;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.relatives.Son;

/**
 * Provides father of a requirement person.
 */
public class SonFactory extends FactFactory<Son> {

	public SonFactory(Resource familyResource) {
		super(familyResource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return type.isAssignableFrom(Son.class);
	}

	@Override
	protected Stream<Son> releativesStream(Person person) {
		return person
				.getChildren()
				.stream()
				.filter(Man.class::isInstance)
				.map(Man.class::cast)
				.map(son -> new Son(son, person));
	}

}
