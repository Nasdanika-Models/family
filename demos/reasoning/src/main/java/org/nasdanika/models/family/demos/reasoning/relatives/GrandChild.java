package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;

public abstract class GrandChild extends Conclusion {

	public GrandChild(Person grandchild, Person grandparent, Relative... inputs) {
		super(grandchild, grandparent, inputs);
	}

}
