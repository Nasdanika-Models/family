package org.nasdanika.models.family.demos.reasoning.relatives;

import java.util.ArrayList;
import java.util.Collection;

import org.nasdanika.models.family.Person;

public class Conclusion extends Relative {
	
	protected Conclusion(Person subject, Person object, Relative... inputs) {
		super(subject, object);
		for (Relative input: inputs) {
			this.inputs.add(input);
		}
	}

	private Collection<Relative> inputs = new ArrayList<>();
	
	public Collection<Relative> getInputs() {
		return inputs;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getInputs();
	}

}
