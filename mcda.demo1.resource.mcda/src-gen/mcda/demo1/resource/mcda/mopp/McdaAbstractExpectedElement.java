/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class McdaAbstractExpectedElement implements mcda.demo1.resource.mcda.IMcdaExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>> followers = new java.util.LinkedHashSet<mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>>();
	
	public McdaAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(mcda.demo1.resource.mcda.IMcdaExpectedElement follower, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[] path) {
		followers.add(new mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.util.McdaPair<mcda.demo1.resource.mcda.IMcdaExpectedElement, mcda.demo1.resource.mcda.mopp.McdaContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
