package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;

public class GrandFather extends GrandParent {

	public GrandFather(Man grandfather, Person grandchild, Relative... inputs) {
		super(grandfather, grandchild, inputs);
	}
	
	@Override
	public Man getSubject() {
		return (Man) super.getSubject();
	}

}
