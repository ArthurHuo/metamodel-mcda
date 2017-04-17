/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IMcdaResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public mcda.demo1.resource.mcda.IMcdaResourcePostProcessor getResourcePostProcessor();
	
}
