package org.nasdanika.models.family.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.emf.SpecLoadingDrawioFactory;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.ncore.NcorePackage;

/**
 * Factory for mapping drawio model to graph model
 * @param <F>
 * @param <P>
 */
public abstract class FamilyDrawioFactory extends SpecLoadingDrawioFactory<EObject> {
	
	public FamilyDrawioFactory(ResourceSet resourceSet) {
		super(resourceSet);
	}

	/**
	 * Returns a map with graph and ncore entries.
	 */
	@Override
	protected Map<String, EPackage> getEPackages() {
		Map<String, EPackage> ret = new LinkedHashMap<>();
		ret.put("family", FamilyPackage.eINSTANCE);
		ret.put("ncore", NcorePackage.eINSTANCE);
		return ret;
	}
		
}
