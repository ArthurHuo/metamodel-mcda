/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.debug;

public class McdaSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof mcda.demo1.resource.mcda.debug.McdaStackFrame) {
			mcda.demo1.resource.mcda.debug.McdaStackFrame frame = (mcda.demo1.resource.mcda.debug.McdaStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
