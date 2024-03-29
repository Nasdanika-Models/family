package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class Aunt extends Conclusion {

	public Aunt(Woman aunt, Person object, Relative... inputs) {
		super(aunt, object, inputs);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
