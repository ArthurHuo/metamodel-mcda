/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			mcda.demo1.mcdaPackage.eINSTANCE.getTask(),
			mcda.demo1.mcdaPackage.eINSTANCE.getFilter(),
			mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(),
			mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(),
			mcda.demo1.mcdaPackage.eINSTANCE.getFile(),
			mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(),
			mcda.demo1.mcdaPackage.eINSTANCE.getoption(),
			mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(),
			mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(),
			mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(),
			mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			mcda.demo1.mcdaPackage.eINSTANCE.getTask(),
		};
	}
	
}
