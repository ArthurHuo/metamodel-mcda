/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public McdaResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new mcda.demo1.resource.mcda.mopp.McdaResource(uri);
	}
	
}
