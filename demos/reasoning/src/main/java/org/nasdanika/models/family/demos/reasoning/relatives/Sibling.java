package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;

public abstract class Sibling extends Conclusion {

	protected Sibling(Person sibling, Person object, Relative... inputs) {
		super(sibling, object, inputs);
	}

}
