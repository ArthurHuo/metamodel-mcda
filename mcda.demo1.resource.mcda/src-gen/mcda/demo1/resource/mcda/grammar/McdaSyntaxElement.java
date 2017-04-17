/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class McdaSyntaxElement {
	
	private McdaSyntaxElement[] children;
	private McdaSyntaxElement parent;
	private mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality;
	
	public McdaSyntaxElement(mcda.demo1.resource.mcda.grammar.McdaCardinality cardinality, McdaSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (McdaSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(McdaSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public McdaSyntaxElement getParent() {
		return parent;
	}
	
	public McdaSyntaxElement[] getChildren() {
		if (children == null) {
			return new McdaSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public mcda.demo1.resource.mcda.grammar.McdaCardinality getCardinality() {
		return cardinality;
	}
	
}
