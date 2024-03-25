package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;

public class Cousin extends Conclusion {

	public Cousin(Person cousin, Person object, Relative... inputs) {
		super(cousin, object, inputs);
	}

}
