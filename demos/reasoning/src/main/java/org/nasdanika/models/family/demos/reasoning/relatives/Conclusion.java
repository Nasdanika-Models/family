package org.nasdanika.models.family.demos.reasoning.relatives;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.models.family.Person;

public class Conclusion extends Relative {
	
	protected Conclusion(Person subject, Person object) {
		super(subject, object);
	}

	private Collection<Object> inputs = new ArrayList<>();
	
	public Collection<Object> getInputs() {
		return inputs;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getInputs();
	}

}
