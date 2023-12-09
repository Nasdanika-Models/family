package org.nasdanika.models.family.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Util;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.util.MappingWorkbookResourceFactory;
import org.nasdanika.models.family.FamilyFactory;
import org.nasdanika.models.family.FamilyPackage;

public class FamilyResourceFactory extends MappingWorkbookResourceFactory {
	
	@Override
	protected EObject createRoot() {
		return FamilyFactory.eINSTANCE.createFamily();
	}
	
	@Override
	protected EObject createReferenceElement(EObject root, EReference rootReference, Row row, Resource resource) {
		if (rootReference == FamilyPackage.Literals.FAMILY__MEMBERS) {			
			Cell typeCell = ((CellRow) row).getCells().get(1);
			if (typeCell instanceof StringCell) {
				String typeName = ((StringCell) typeCell).getValue();
				if (!Util.isBlank(typeName)) {
					return FamilyFactory.eINSTANCE.create((EClass) FamilyPackage.eINSTANCE.getEClassifier(typeName.trim()));
				}
			}
			return null;
		}
		
		return super.createReferenceElement(root, rootReference, row, resource);
	}
	
	
}
