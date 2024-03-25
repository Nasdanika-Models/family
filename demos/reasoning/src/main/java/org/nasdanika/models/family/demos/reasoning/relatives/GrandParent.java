package org.nasdanika.models.family.demos.reasoning.relatives;

import org.nasdanika.models.family.Person;

public abstract class GrandParent extends Conclusion {

	public GrandParent(Person grandparent, Person grandchild) {
		super(grandparent, grandchild);
	}

}
