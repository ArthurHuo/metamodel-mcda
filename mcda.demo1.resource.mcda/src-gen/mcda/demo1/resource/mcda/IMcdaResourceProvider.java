/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IMcdaResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public mcda.demo1.resource.mcda.IMcdaTextResource getResource();
	
}
