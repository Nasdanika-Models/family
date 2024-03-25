package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class Daughter extends Child {

	public Daughter(Woman daughter, Person parent) {
		super(daughter, parent);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
