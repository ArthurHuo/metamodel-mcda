/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class McdaFollowSetProvider {
	
	public final static mcda.demo1.resource.mcda.IMcdaExpectedElement TERMINALS[] = new mcda.demo1.resource.mcda.IMcdaExpectedElement[87];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[7];
	
	public final static mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] LINKS = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[94];
	
	public final static mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] EMPTY_LINK_ARRAY = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_0);
		TERMINALS[1] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_1);
		TERMINALS[2] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_0);
		TERMINALS[3] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_0);
		TERMINALS[4] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_0);
		TERMINALS[5] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_0);
		TERMINALS[6] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_0);
		TERMINALS[7] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_0);
		TERMINALS[8] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_0);
		TERMINALS[9] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_0);
		TERMINALS[10] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_3);
		TERMINALS[11] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_1);
		TERMINALS[12] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_2);
		TERMINALS[13] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_3_3);
		TERMINALS[14] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_1);
		TERMINALS[15] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_2);
		TERMINALS[16] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_0_0_0_2_0_4_3);
		TERMINALS[17] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_1);
		TERMINALS[18] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_2);
		TERMINALS[19] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_3);
		TERMINALS[20] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_4);
		TERMINALS[21] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_5);
		TERMINALS[22] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_6);
		TERMINALS[23] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_7);
		TERMINALS[24] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_1_0_0_8);
		TERMINALS[25] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_1);
		TERMINALS[26] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_2_0_0_0);
		TERMINALS[27] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_3);
		TERMINALS[28] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_2_0_0_4);
		TERMINALS[29] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_1);
		TERMINALS[30] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_2);
		TERMINALS[31] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_3);
		TERMINALS[32] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_4);
		TERMINALS[33] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_5);
		TERMINALS[34] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_0);
		TERMINALS[35] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_7);
		TERMINALS[36] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_3_0_0_8);
		TERMINALS[37] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_1);
		TERMINALS[38] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_2);
		TERMINALS[39] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_3);
		TERMINALS[40] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_4_0_0_4);
		TERMINALS[41] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_1);
		TERMINALS[42] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_2);
		TERMINALS[43] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_3);
		TERMINALS[44] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_4);
		TERMINALS[45] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_5);
		TERMINALS[46] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_0);
		TERMINALS[47] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_0);
		TERMINALS[48] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_8);
		TERMINALS[49] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_5_0_0_9);
		TERMINALS[50] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_1);
		TERMINALS[51] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_2);
		TERMINALS[52] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_3);
		TERMINALS[53] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_4);
		TERMINALS[54] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_5);
		TERMINALS[55] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_6);
		TERMINALS[56] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_7_0_0_0);
		TERMINALS[57] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_0);
		TERMINALS[58] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_9);
		TERMINALS[59] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_7_0_0_1);
		TERMINALS[60] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_1);
		TERMINALS[61] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_2);
		TERMINALS[62] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_8_0_0_3);
		TERMINALS[63] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_10);
		TERMINALS[64] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_6_0_0_11);
		TERMINALS[65] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_1);
		TERMINALS[66] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_0);
		TERMINALS[67] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_3);
		TERMINALS[68] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_7_0_0_4);
		TERMINALS[69] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_1);
		TERMINALS[70] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_2);
		TERMINALS[71] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_3);
		TERMINALS[72] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_4);
		TERMINALS[73] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_5);
		TERMINALS[74] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_8_0_0_6);
		TERMINALS[75] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_1);
		TERMINALS[76] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_2);
		TERMINALS[77] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_3);
		TERMINALS[78] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_9_0_0_4);
		TERMINALS[79] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_1);
		TERMINALS[80] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_2);
		TERMINALS[81] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_3);
		TERMINALS[82] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_4);
		TERMINALS[83] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_5);
		TERMINALS[84] = new mcda.demo1.resource.mcda.mopp.McdaExpectedStructuralFeature(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_6);
		TERMINALS[85] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_7);
		TERMINALS[86] = new mcda.demo1.resource.mcda.mopp.McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaGrammarInformationProvider.MCDA_10_0_0_8);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPERATION);
		FEATURES[1] = mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__DEFINE_TYPE);
		FEATURES[2] = mcda.demo1.mcdaPackage.eINSTANCE.getTask().getEStructuralFeature(mcda.demo1.mcdaPackage.TASK__HAVE_OPTION);
		FEATURES[3] = mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate().getEStructuralFeature(mcda.demo1.mcdaPackage.EVALUATE__CONTAIN);
		FEATURES[4] = mcda.demo1.mcdaPackage.eINSTANCE.getOptionType().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__DEFINE_CRITERIA);
		FEATURES[5] = mcda.demo1.mcdaPackage.eINSTANCE.getOptionType().getEStructuralFeature(mcda.demo1.mcdaPackage.OPTION_TYPE__COMPARE_WEIGHT);
		FEATURES[6] = mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix().getEStructuralFeature(mcda.demo1.mcdaPackage.COMPARISON_MATRIX__MAKEUPOF);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[1] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[2] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[3] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[4] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[5] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[6] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[7] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[8] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[9] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[10] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[11] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[12] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[13] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[14] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[15] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[16] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[17] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[18] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[19] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[20] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[21] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[22] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[23] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[24] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[25] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[26] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[27] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[28] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[29] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[30] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[31] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[32] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[33] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[34] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[35] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[36] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[37] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[38] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[39] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[40] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[41] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[42] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[43] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[44] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[45] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[46] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[47] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[48] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[49] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[50] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[51] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[52] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[53] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[54] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]);
		LINKS[55] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]);
		LINKS[56] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]);
		LINKS[57] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[58] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[59] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[60] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[61] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[62] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[63] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[64] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[65] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[66] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[67] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[68] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[69] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]);
		LINKS[70] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]);
		LINKS[71] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]);
		LINKS[72] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]);
		LINKS[73] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]);
		LINKS[74] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]);
		LINKS[75] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[76] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[77] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[78] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[79] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[80] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[81] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]);
		LINKS[82] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]);
		LINKS[83] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]);
		LINKS[84] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]);
		LINKS[85] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]);
		LINKS[86] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]);
		LINKS[87] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]);
		LINKS[88] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]);
		LINKS[89] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]);
		LINKS[90] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]);
		LINKS[91] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]);
		LINKS[92] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]);
		LINKS[93] = new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[1].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[1].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[1].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[1].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[1].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[1].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[8].addFollower(TERMINALS[11], EMPTY_LINK_ARRAY);
		TERMINALS[11].addFollower(TERMINALS[12], EMPTY_LINK_ARRAY);
		TERMINALS[12].addFollower(TERMINALS[13], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[13].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[13].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[13].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[13].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[9].addFollower(TERMINALS[14], EMPTY_LINK_ARRAY);
		TERMINALS[14].addFollower(TERMINALS[15], EMPTY_LINK_ARRAY);
		TERMINALS[15].addFollower(TERMINALS[16], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[16].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[16].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[16].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[16].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[16].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[16].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[16].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[2].addFollower(TERMINALS[17], EMPTY_LINK_ARRAY);
		TERMINALS[17].addFollower(TERMINALS[18], EMPTY_LINK_ARRAY);
		TERMINALS[18].addFollower(TERMINALS[19], EMPTY_LINK_ARRAY);
		TERMINALS[19].addFollower(TERMINALS[20], EMPTY_LINK_ARRAY);
		TERMINALS[20].addFollower(TERMINALS[21], EMPTY_LINK_ARRAY);
		TERMINALS[21].addFollower(TERMINALS[22], EMPTY_LINK_ARRAY);
		TERMINALS[22].addFollower(TERMINALS[23], EMPTY_LINK_ARRAY);
		TERMINALS[23].addFollower(TERMINALS[24], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[24].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[24].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[24].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[24].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[24].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[24].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[24].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[3].addFollower(TERMINALS[25], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[25].addFollower(TERMINALS[27], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[26], EMPTY_LINK_ARRAY);
		TERMINALS[26].addFollower(TERMINALS[27], EMPTY_LINK_ARRAY);
		TERMINALS[27].addFollower(TERMINALS[28], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[28].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[28].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[28].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[28].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[28].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[28].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[28].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[4].addFollower(TERMINALS[29], EMPTY_LINK_ARRAY);
		TERMINALS[29].addFollower(TERMINALS[30], EMPTY_LINK_ARRAY);
		TERMINALS[30].addFollower(TERMINALS[31], EMPTY_LINK_ARRAY);
		TERMINALS[31].addFollower(TERMINALS[32], EMPTY_LINK_ARRAY);
		TERMINALS[32].addFollower(TERMINALS[33], EMPTY_LINK_ARRAY);
		TERMINALS[33].addFollower(TERMINALS[34], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]), });
		TERMINALS[33].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[35].addFollower(TERMINALS[36], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[36].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[36].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[36].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[36].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[36].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[36].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[36].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[5].addFollower(TERMINALS[37], EMPTY_LINK_ARRAY);
		TERMINALS[37].addFollower(TERMINALS[38], EMPTY_LINK_ARRAY);
		TERMINALS[38].addFollower(TERMINALS[39], EMPTY_LINK_ARRAY);
		TERMINALS[39].addFollower(TERMINALS[40], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[40].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[40].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[40].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[40].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[40].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[40].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[40].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[6].addFollower(TERMINALS[41], EMPTY_LINK_ARRAY);
		TERMINALS[41].addFollower(TERMINALS[42], EMPTY_LINK_ARRAY);
		TERMINALS[42].addFollower(TERMINALS[43], EMPTY_LINK_ARRAY);
		TERMINALS[43].addFollower(TERMINALS[44], EMPTY_LINK_ARRAY);
		TERMINALS[44].addFollower(TERMINALS[45], EMPTY_LINK_ARRAY);
		TERMINALS[45].addFollower(TERMINALS[46], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]), });
		TERMINALS[45].addFollower(TERMINALS[47], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]), });
		TERMINALS[48].addFollower(TERMINALS[49], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[49].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[49].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[49].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[49].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[49].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[49].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[49].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[7].addFollower(TERMINALS[50], EMPTY_LINK_ARRAY);
		TERMINALS[50].addFollower(TERMINALS[51], EMPTY_LINK_ARRAY);
		TERMINALS[51].addFollower(TERMINALS[52], EMPTY_LINK_ARRAY);
		TERMINALS[52].addFollower(TERMINALS[53], EMPTY_LINK_ARRAY);
		TERMINALS[53].addFollower(TERMINALS[54], EMPTY_LINK_ARRAY);
		TERMINALS[54].addFollower(TERMINALS[55], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[56], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[55].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[56].addFollower(TERMINALS[59], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[56], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[59].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[57].addFollower(TERMINALS[60], EMPTY_LINK_ARRAY);
		TERMINALS[60].addFollower(TERMINALS[61], EMPTY_LINK_ARRAY);
		TERMINALS[61].addFollower(TERMINALS[62], EMPTY_LINK_ARRAY);
		TERMINALS[62].addFollower(TERMINALS[57], EMPTY_LINK_ARRAY);
		TERMINALS[62].addFollower(TERMINALS[58], EMPTY_LINK_ARRAY);
		TERMINALS[58].addFollower(TERMINALS[63], EMPTY_LINK_ARRAY);
		TERMINALS[63].addFollower(TERMINALS[64], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[2], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFilter(), FEATURES[0]), });
		TERMINALS[64].addFollower(TERMINALS[3], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getAnalyze(), FEATURES[0]), });
		TERMINALS[64].addFollower(TERMINALS[4], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluate(), FEATURES[0]), });
		TERMINALS[64].addFollower(TERMINALS[5], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getFile(), FEATURES[0]), });
		TERMINALS[64].addFollower(TERMINALS[6], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getOptionType(), FEATURES[1]), });
		TERMINALS[64].addFollower(TERMINALS[7], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getoption(), FEATURES[2]), });
		TERMINALS[64].addFollower(TERMINALS[8], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[9], EMPTY_LINK_ARRAY);
		TERMINALS[64].addFollower(TERMINALS[10], EMPTY_LINK_ARRAY);
		TERMINALS[47].addFollower(TERMINALS[65], EMPTY_LINK_ARRAY);
		TERMINALS[65].addFollower(TERMINALS[66], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]), });
		TERMINALS[65].addFollower(TERMINALS[67], EMPTY_LINK_ARRAY);
		TERMINALS[67].addFollower(TERMINALS[68], EMPTY_LINK_ARRAY);
		TERMINALS[68].addFollower(TERMINALS[48], EMPTY_LINK_ARRAY);
		TERMINALS[34].addFollower(TERMINALS[69], EMPTY_LINK_ARRAY);
		TERMINALS[69].addFollower(TERMINALS[70], EMPTY_LINK_ARRAY);
		TERMINALS[70].addFollower(TERMINALS[71], EMPTY_LINK_ARRAY);
		TERMINALS[71].addFollower(TERMINALS[72], EMPTY_LINK_ARRAY);
		TERMINALS[72].addFollower(TERMINALS[73], EMPTY_LINK_ARRAY);
		TERMINALS[73].addFollower(TERMINALS[74], EMPTY_LINK_ARRAY);
		TERMINALS[74].addFollower(TERMINALS[34], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getEvaluatePair(), FEATURES[3]), });
		TERMINALS[74].addFollower(TERMINALS[35], EMPTY_LINK_ARRAY);
		TERMINALS[46].addFollower(TERMINALS[75], EMPTY_LINK_ARRAY);
		TERMINALS[75].addFollower(TERMINALS[76], EMPTY_LINK_ARRAY);
		TERMINALS[76].addFollower(TERMINALS[77], EMPTY_LINK_ARRAY);
		TERMINALS[77].addFollower(TERMINALS[78], EMPTY_LINK_ARRAY);
		TERMINALS[78].addFollower(TERMINALS[46], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getCriteria(), FEATURES[4]), });
		TERMINALS[78].addFollower(TERMINALS[47], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonMatrix(), FEATURES[5]), });
		TERMINALS[66].addFollower(TERMINALS[79], EMPTY_LINK_ARRAY);
		TERMINALS[79].addFollower(TERMINALS[80], EMPTY_LINK_ARRAY);
		TERMINALS[80].addFollower(TERMINALS[81], EMPTY_LINK_ARRAY);
		TERMINALS[81].addFollower(TERMINALS[82], EMPTY_LINK_ARRAY);
		TERMINALS[82].addFollower(TERMINALS[83], EMPTY_LINK_ARRAY);
		TERMINALS[83].addFollower(TERMINALS[84], EMPTY_LINK_ARRAY);
		TERMINALS[84].addFollower(TERMINALS[85], EMPTY_LINK_ARRAY);
		TERMINALS[85].addFollower(TERMINALS[86], EMPTY_LINK_ARRAY);
		TERMINALS[86].addFollower(TERMINALS[66], new mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] {new mcda.demo1.resource.mcda.mopp.McdaContainedFeature(mcda.demo1.mcdaPackage.eINSTANCE.getComparisonPair(), FEATURES[6]), });
		TERMINALS[86].addFollower(TERMINALS[67], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
