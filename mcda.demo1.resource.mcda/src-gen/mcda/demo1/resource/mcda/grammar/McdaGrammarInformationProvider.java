/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static McdaGrammarInformationProvider INSTANCE = new McdaGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Task", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("{", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_0_0_0_2_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPERATION), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getoperation(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0_2_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_0_0_0_2_0_1_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DEFINE_TYPE), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0_2_0_1 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_1_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_0_0_0_2_0_2_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPTION), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getoption(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0_2_0_2 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_2_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_3_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("name", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_3_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_0_0_0_2_0_3_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_3_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0_2_0_3 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_3_0, MCDA_0_0_0_2_0_3_1, MCDA_0_0_0_2_0_3_2, MCDA_0_0_0_2_0_3_3);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_4_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("description", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_4_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_0_0_0_2_0_4_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DESCRIPTION), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_2_0_4_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0_2_0_4 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_4_0, MCDA_0_0_0_2_0_4_1, MCDA_0_0_0_2_0_4_2, MCDA_0_0_0_2_0_4_3);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_0_0_0_2_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_2_0_0, MCDA_0_0_0_2_0_1, MCDA_0_0_0_2_0_2, MCDA_0_0_0_2_0_3, MCDA_0_0_0_2_0_4);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_0_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_0_0_0_2_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_0_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("}", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0_0, MCDA_0_0_0_1, MCDA_0_0_0_2, MCDA_0_0_0_3);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_0_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_0 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getTask(), MCDA_0_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Filter", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_1_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getFilter().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__CRITERIA_NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_1_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getFilter().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__OP), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_1_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getFilter().getEStructuralFeature(mcda.demo1.mcdaPackage.FILTER__TARGET), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_7 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_1_0_0_8 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_1_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_1_0_0_0, MCDA_1_0_0_1, MCDA_1_0_0_2, MCDA_1_0_0_3, MCDA_1_0_0_4, MCDA_1_0_0_5, MCDA_1_0_0_6, MCDA_1_0_0_7, MCDA_1_0_0_8);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_1_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_1_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_1 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), MCDA_1_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_2_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Analyze", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_2_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_2_0_0_2_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze().getEStructuralFeature(mcda.demo1.mcdaPackage.ANALYZE__METHOD), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_2_0_0_2_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_2_0_0_2_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_2_0_0_2_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_2_0_0_2_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_2_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_2_0_0_2_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_2_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_2_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_2_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_2_0_0_0, MCDA_2_0_0_1, MCDA_2_0_0_2, MCDA_2_0_0_3, MCDA_2_0_0_4);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_2_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_2_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_2 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), MCDA_2_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Evaluate", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("criteriaName", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_3_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CRITERIA_NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_3_0_0_6_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CONTAIN), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_3_0_0_6_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_3_0_0_6_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_3_0_0_6_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_3_0_0_6_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_3_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_3_0_0_6_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_7 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_3_0_0_8 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_3_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_3_0_0_0, MCDA_3_0_0_1, MCDA_3_0_0_2, MCDA_3_0_0_3, MCDA_3_0_0_4, MCDA_3_0_0_5, MCDA_3_0_0_6, MCDA_3_0_0_7, MCDA_3_0_0_8);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_3_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_3_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_3 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), MCDA_3_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_4_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("File", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_4_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_4_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getFile().getEStructuralFeature(mcda.demo1.mcdaPackage.FILE__URL), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_4_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_4_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_4_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_4_0_0_0, MCDA_4_0_0_1, MCDA_4_0_0_2, MCDA_4_0_0_3, MCDA_4_0_0_4);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_4_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_4_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_4 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), MCDA_4_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("OptionType", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("name", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_5_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_5_0_0_6_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_5_0_0_6_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_5_0_0_6_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_5_0_0_6_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_5_0_0_6_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_5_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_5_0_0_6_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_5_0_0_7 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_8 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_5_0_0_9 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_5_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_5_0_0_0, MCDA_5_0_0_1, MCDA_5_0_0_2, MCDA_5_0_0_3, MCDA_5_0_0_4, MCDA_5_0_0_5, MCDA_5_0_0_6, MCDA_5_0_0_7, MCDA_5_0_0_8, MCDA_5_0_0_9);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_5_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_5_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_5 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), MCDA_5_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Option", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("name", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_6_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getoption().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_6_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getoption().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_7_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_6_0_0_7_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getoption().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__ATTRIBUTE), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_6_0_0_7_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0_7_0_0_0, MCDA_6_0_0_7_0_0_1);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_6_0_0_7_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0_7_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_6_0_0_7 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_6_0_0_7_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_8_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_8_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("description", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_8_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(":", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_6_0_0_8_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getoption().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION__DESCRIPTION), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_6_0_0_8_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0_8_0_0_0, MCDA_6_0_0_8_0_0_1, MCDA_6_0_0_8_0_0_2, MCDA_6_0_0_8_0_0_3);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_6_0_0_8_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0_8_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_6_0_0_8 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_6_0_0_8_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_9 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_10 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_6_0_0_11 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_6_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0_0, MCDA_6_0_0_1, MCDA_6_0_0_2, MCDA_6_0_0_3, MCDA_6_0_0_4, MCDA_6_0_0_5, MCDA_6_0_0_6, MCDA_6_0_0_7, MCDA_6_0_0_8, MCDA_6_0_0_9, MCDA_6_0_0_10, MCDA_6_0_0_11);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_6_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_6_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_6 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), MCDA_6_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_7_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("ComparisonMatrix", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_7_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaContainment MCDA_7_0_0_2_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaContainment(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_MATRIX__MAKEUPOF), mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), }, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_7_0_0_2_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_7_0_0_2_0_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_7_0_0_2_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_7_0_0_2_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaCompound MCDA_7_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaCompound(MCDA_7_0_0_2_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.STAR);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_7_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_7_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_7_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_7_0_0_0, MCDA_7_0_0_1, MCDA_7_0_0_2, MCDA_7_0_0_3, MCDA_7_0_0_4);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_7_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_7_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_7 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), MCDA_7_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_8_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("EvaluatePair", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_8_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_8_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_8_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_8_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE_PAIR__VALUE), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_8_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_8_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_8_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_8_0_0_0, MCDA_8_0_0_1, MCDA_8_0_0_2, MCDA_8_0_0_3, MCDA_8_0_0_4, MCDA_8_0_0_5, MCDA_8_0_0_6);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_8_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_8_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_8 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), MCDA_8_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_9_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("Criteria", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_9_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_9_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria().getEStructuralFeature(mcda.demo1.mcdaPackage.CRITERIA__NAME), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_9_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_9_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_9_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_9_0_0_0, MCDA_9_0_0_1, MCDA_9_0_0_2, MCDA_9_0_0_3, MCDA_9_0_0_4);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_9_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_9_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_9 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), MCDA_9_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_0 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("ComparisonPair", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_1 = new mcda.demo1.resource.mcda.grammar.McdaKeyword("(", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_10_0_0_2 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA1), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_3 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_10_0_0_4 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__CRITERIA2), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_5 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(",", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaPlaceholder MCDA_10_0_0_6 = new mcda.demo1.resource.mcda.grammar.McdaPlaceholder(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_PAIR__VALUE), "QUOTED_34_34", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, 0);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_7 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(")", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaKeyword MCDA_10_0_0_8 = new mcda.demo1.resource.mcda.grammar.McdaKeyword(";", mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	public final static mcda.demo1.resource.mcda.grammar.McdaSequence MCDA_10_0_0 = new mcda.demo1.resource.mcda.grammar.McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_10_0_0_0, MCDA_10_0_0_1, MCDA_10_0_0_2, MCDA_10_0_0_3, MCDA_10_0_0_4, MCDA_10_0_0_5, MCDA_10_0_0_6, MCDA_10_0_0_7, MCDA_10_0_0_8);
	public final static mcda.demo1.resource.mcda.grammar.McdaChoice MCDA_10_0 = new mcda.demo1.resource.mcda.grammar.McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE, MCDA_10_0_0);
	public final static mcda.demo1.resource.mcda.grammar.McdaRule MCDA_10 = new mcda.demo1.resource.mcda.grammar.McdaRule(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), MCDA_10_0, mcda.demo1.resource.mcda.grammar.McdaCardinality.ONE);
	
	public static String getSyntaxElementID(mcda.demo1.resource.mcda.grammar.McdaSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static mcda.demo1.resource.mcda.grammar.McdaSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (mcda.demo1.resource.mcda.grammar.McdaSyntaxElement) mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static mcda.demo1.resource.mcda.grammar.McdaRule[] RULES = new mcda.demo1.resource.mcda.grammar.McdaRule[] {
		MCDA_0,
		MCDA_1,
		MCDA_2,
		MCDA_3,
		MCDA_4,
		MCDA_5,
		MCDA_6,
		MCDA_7,
		MCDA_8,
		MCDA_9,
		MCDA_10,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (mcda.demo1.resource.mcda.grammar.McdaRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(mcda.demo1.resource.mcda.grammar.McdaSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof mcda.demo1.resource.mcda.grammar.McdaKeyword) {
			keywords.add(((mcda.demo1.resource.mcda.grammar.McdaKeyword) element).getValue());
		} else if (element instanceof mcda.demo1.resource.mcda.grammar.McdaBooleanTerminal) {
			keywords.add(((mcda.demo1.resource.mcda.grammar.McdaBooleanTerminal) element).getTrueLiteral());
			keywords.add(((mcda.demo1.resource.mcda.grammar.McdaBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof mcda.demo1.resource.mcda.grammar.McdaEnumerationTerminal) {
			mcda.demo1.resource.mcda.grammar.McdaEnumerationTerminal terminal = (mcda.demo1.resource.mcda.grammar.McdaEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (mcda.demo1.resource.mcda.grammar.McdaSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
