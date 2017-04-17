/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class McdaPlaceholder extends mcda.demo1.resource.mcda.grammar.McdaTerminal {
	
	private final String tokenName;
	
	public McdaPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
