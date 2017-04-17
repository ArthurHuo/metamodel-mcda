/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IMcdaParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaCommand<mcda.demo1.resource.mcda.IMcdaTextResource>> getPostParseCommands();
	
}
