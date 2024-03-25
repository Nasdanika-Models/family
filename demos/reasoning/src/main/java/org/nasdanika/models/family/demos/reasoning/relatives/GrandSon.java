package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;

public class GrandSon extends GrandChild {

	public GrandSon(Man grandson, Person grandparent, Relative... inputs) {
		super(grandson, grandparent, inputs);
	}
	
	@Override
	public Man getSubject() {
		return (Man) super.getSubject();
	}

}
