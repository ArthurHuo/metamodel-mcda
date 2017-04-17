/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IMcdaExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public mcda.demo1.resource.mcda.grammar.McdaSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(mcda.demo1.resource.mcda.IMcdaExpectedElement follower, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>> getFollowers();
	
}
