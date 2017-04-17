/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.util;

/**
 * Class McdaTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * mcda.demo1.resource.mcda.util.McdaResourceUtil.
 */
public class McdaTextResourceUtil {
	
	/**
	 * Use mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static mcda.demo1.resource.mcda.mopp.McdaResource getResource(org.eclipse.core.resources.IFile file) {
		return new mcda.demo1.resource.mcda.util.McdaEclipseProxy().getResource(file);
	}
	
	/**
	 * Use mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static mcda.demo1.resource.mcda.mopp.McdaResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static mcda.demo1.resource.mcda.mopp.McdaResource getResource(org.eclipse.emf.common.util.URI uri) {
		return mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource(uri);
	}
	
	/**
	 * Use mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static mcda.demo1.resource.mcda.mopp.McdaResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return mcda.demo1.resource.mcda.util.McdaResourceUtil.getResource(uri, options);
	}
	
}
