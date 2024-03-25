package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;

public class Son extends Child {

	public Son(Man son, Person parent) {
		super(son, parent);
	}
	
	@Override
	public Man getSubject() {
		return (Man) super.getSubject();
	}

}
