package org.nasdanika.models.family.demos.reasoning.relatives;

import java.util.Objects;

import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.demos.reasoning.Conclusion;

/**
 * Family relationships. E.g. "Alice is a sister of Bob" with "Alice" being the subject and "Bob" being the object.
 */
public abstract class Relative extends Conclusion {
	
	private Person subject;
	private Person object;

	protected Relative(Person subject, Person object) {
		this.subject = Objects.requireNonNull(subject);
		this.object = Objects.requireNonNull(object);
	}
	
	public Person getSubject() {
		return subject;
	}
	
	public Person getObject() {
		return object;
	}
	
	@Override
	public String toString() {
		String cn = getClass().getName().toLowerCase();
		int lastDot = cn.lastIndexOf(".");
		String rn = cn.substring(lastDot + 1);
		return subject.getName() + " is a " + rn + " of " + object.getName();
	}
	
}
