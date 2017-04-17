/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IMcdaCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
