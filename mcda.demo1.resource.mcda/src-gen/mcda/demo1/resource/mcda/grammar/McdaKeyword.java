/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class McdaKeyword extends mcda.demo1.resource.mcda.grammar.McdaSyntaxElement {
	
	private final String value;
	
	public McdaKeyword(String value, mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
