package org.nasdanika.models.family.util;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Util;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.util.MappingWorkbookResourceFactory;
import org.nasdanika.models.family.FamilyFactory;
import org.nasdanika.models.family.FamilyPackage;
import org.nasdanika.models.family.Man;
import org.nasdanika.models.family.Person;
import org.nasdanika.models.family.Woman;

public class FamilyResourceFactory extends MappingWorkbookResourceFactory {
	
	@Override
	protected EObject createRoot() {
		return FamilyFactory.eINSTANCE.createFamily();
	}
	
	@Override
	protected EObject createReferenceElement(
			EObject root, 
			EReference rootReference, 
			Row row, 
			Resource resource,
			BiConsumer<BiPredicate<Row, EObject>, Consumer<EObject>> elementProvider) {
		
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
		return super.createReferenceElement(root, rootReference, row, resource, elementProvider);
	}
	
	@Override
	protected void loadFeatureValue(
			EObject eObj, 
			EStructuralFeature feature, 
			String value, 
			Resource resource,
			BiConsumer<BiPredicate<Row, EObject>, Consumer<EObject>> elementProvider) {
		
		if (eObj instanceof Person && feature == FamilyPackage.Literals.PERSON__FATHER) {
			elementProvider.accept(
					(row, semanticElement) -> semanticElement instanceof Man && ((Man) semanticElement).getName().equals(value), 
					semanticElement -> ((Person) eObj).setFather((Man) semanticElement));
		} else if (eObj instanceof Person && feature == FamilyPackage.Literals.PERSON__MOTHER) {
			elementProvider.accept(
					(row, semanticElement) -> semanticElement instanceof Woman && ((Woman) semanticElement).getName().equals(value), 
					semanticElement -> ((Person) eObj).setMother((Woman) semanticElement));			
		} else {
			super.loadFeatureValue(eObj, feature, value, resource, elementProvider);
		}
	}
	
}
