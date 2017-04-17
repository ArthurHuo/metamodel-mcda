/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaChoice extends mcda.demo1.resource.mcda.grammar.McdaSyntaxElement {
	
	public McdaChoice(mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality, mcda.demo1.resource.mcda.grammar.McdaSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return mcda.demo1.resource.mcda.util.McdaStringUtil.explode(getChildren(), "|");
	}
	
}
