package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class Sister extends Sibling {

	public Sister(Woman sister, Person object, Relative... inputs) {
		super(sister, object, inputs);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
