package org.nasdanika.models.family.demos.reasoning.relatives;

import java.util.Objects;

import org.nasdanika.models.family.Person;

/**
 * Family relationships. E.g. "Alice is a sister of Bob" with "Alice" being the subject and "Bob" being the object.
 */
public abstract class Relative {
	
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

	@Override
	public int hashCode() {
		return Objects.hash(object, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Relative other = (Relative) obj;
		return Objects.equals(object, other.object) && Objects.equals(subject, other.subject);
	}
	
}
