/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public mcda.demo1.resource.mcda.IMcdaTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Task".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("description".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Filter".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Analyze".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Evaluate".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("criteriaName".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("File".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OptionType".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Option".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ComparisonMatrix".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EvaluatePair".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Criteria".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ComparisonPair".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new mcda.demo1.resource.mcda.mopp.McdaTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
