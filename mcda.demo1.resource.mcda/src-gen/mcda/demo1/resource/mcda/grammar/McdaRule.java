/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class McdaRule extends mcda.demo1.resource.mcda.grammar.McdaSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public McdaRule(org.eclipse.emf.ecore.EClass metaclass, mcda.demo1.resource.mcda.grammar.McdaChoice choice, mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality) {
		super(cardinality, new mcda.demo1.resource.mcda.grammar.McdaSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public mcda.demo1.resource.mcda.grammar.McdaChoice getDefinition() {
		return (mcda.demo1.resource.mcda.grammar.McdaChoice) getChildren()[0];
	}
	
}

