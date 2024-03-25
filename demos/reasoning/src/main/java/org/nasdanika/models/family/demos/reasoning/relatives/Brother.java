package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;

public class Brother extends Sibling {

	public Brother(Man brother, Person object, Relative... inputs) {
		super(brother, object, inputs);
	}
	
	@Override
	public Man getSubject() {
		return (Man) super.getSubject();
	}

}
