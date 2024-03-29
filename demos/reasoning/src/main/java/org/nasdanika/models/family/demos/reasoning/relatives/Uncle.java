package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;

public class Uncle extends Conclusion {

	public Uncle(Man uncle, Person object, Relative... inputs) {
		super(uncle, object, inputs);
	}
	
	@Override
	public Man getSubject() {
		return (Man) super.getSubject();
	}

}
