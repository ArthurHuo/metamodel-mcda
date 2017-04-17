/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

public class McdaWhiteSpace extends mcda.demo1.resource.mcda.grammar.McdaFormattingElement {
	
	private final int amount;
	
	public McdaWhiteSpace(int amount, mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
