/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaLineBreak extends mcda.demo1.resource.mcda.grammar.McdaFormattingElement {
	
	private final int tabs;
	
	public McdaLineBreak(mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
