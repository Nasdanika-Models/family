package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class Mother extends Parent {

	public Mother(Woman mother, Person child) {
		super(mother, child);
	}
	
	@Override
	public Woman getSubject() {
		return (Woman) super.getSubject();
	}

}
