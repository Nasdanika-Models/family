package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class GrandDaughter extends GrandChild {

	public GrandDaughter(Woman granddaughter, Person grandparent, Relative... inputs) {
		super(granddaughter, grandparent, inputs);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
