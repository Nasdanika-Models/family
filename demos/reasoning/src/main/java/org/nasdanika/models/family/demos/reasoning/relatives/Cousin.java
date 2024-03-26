package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;

/**
 * People are related with a type of cousin relationship if they share a common ancestor, and are separated from their most recent common ancestor by two or more generations.
 * In our case - a child of parent's sibling.
 */
public class Cousin extends Conclusion {

	public Cousin(Person cousin, Person object, Relative... inputs) {
		super(cousin, object, inputs);
	}

}
