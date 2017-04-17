/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaUIMetaInformation extends mcda.demo1.resource.mcda.mopp.McdaMetaInformation {
	
	public mcda.demo1.resource.mcda.IMcdaHoverTextProvider getHoverTextProvider() {
		return new mcda.demo1.resource.mcda.ui.McdaHoverTextProvider();
	}
	
	public mcda.demo1.resource.mcda.ui.McdaImageProvider getImageProvider() {
		return mcda.demo1.resource.mcda.ui.McdaImageProvider.INSTANCE;
	}
	
	public mcda.demo1.resource.mcda.ui.McdaColorManager createColorManager() {
		return new mcda.demo1.resource.mcda.ui.McdaColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(mcda.demo1.resource.mcda.IMcdaTextResource,
	 * mcda.demo1.resource.mcda.ui.McdaColorManager) instead.
	 */
	public mcda.demo1.resource.mcda.ui.McdaTokenScanner createTokenScanner(mcda.demo1.resource.mcda.ui.McdaColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public mcda.demo1.resource.mcda.ui.McdaTokenScanner createTokenScanner(mcda.demo1.resource.mcda.IMcdaTextResource resource, mcda.demo1.resource.mcda.ui.McdaColorManager colorManager) {
		return new mcda.demo1.resource.mcda.ui.McdaTokenScanner(resource, colorManager);
	}
	
	public mcda.demo1.resource.mcda.ui.McdaCodeCompletionHelper createCodeCompletionHelper() {
		return new mcda.demo1.resource.mcda.ui.McdaCodeCompletionHelper();
	}
	
}
