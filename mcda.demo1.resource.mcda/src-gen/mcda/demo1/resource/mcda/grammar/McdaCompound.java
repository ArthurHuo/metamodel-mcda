/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaCompound extends mcda.demo1.resource.mcda.grammar.McdaSyntaxElement {
	
	public McdaCompound(mcda.demo1.resource.mcda.grammar.McdaChoice choice, mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality) {
		super(cardinality, new mcda.demo1.resource.mcda.grammar.McdaSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
