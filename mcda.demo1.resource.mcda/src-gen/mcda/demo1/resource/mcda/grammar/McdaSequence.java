/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaSequence extends mcda.demo1.resource.mcda.grammar.McdaSyntaxElement {
	
	public McdaSequence(mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality, mcda.demo1.resource.mcda.grammar.McdaSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return mcda.demo1.resource.mcda.util.McdaStringUtil.explode(getChildren(), " ");
	}
	
}
