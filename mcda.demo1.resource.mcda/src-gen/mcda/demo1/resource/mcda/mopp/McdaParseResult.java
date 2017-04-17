/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaParseResult implements mcda.demo1.resource.mcda.IMcdaParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>> commands = new java.util.ArrayList<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>>();
	
	public McdaParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
