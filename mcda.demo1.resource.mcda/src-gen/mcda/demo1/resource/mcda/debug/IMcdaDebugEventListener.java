/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.debug;

public interface IMcdaDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(mcda.demo1.resource.mcda.debug.McdaDebugMessage message);
}
