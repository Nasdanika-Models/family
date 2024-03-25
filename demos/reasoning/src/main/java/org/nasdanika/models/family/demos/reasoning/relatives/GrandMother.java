package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class GrandMother extends GrandParent {

	public GrandMother(Woman grandmother, Person grandchild, Relative... inputs) {
		super(grandmother, grandchild, inputs);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
