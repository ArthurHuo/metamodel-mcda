/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaMetaInformation implements mcda.demo1.resource.mcda.IMcdaMetaInformation {
	
	public String getSyntaxName() {
		return "mcda";
	}
	
	public String getURI() {
		return "http://swen424/demo1";
	}
	
	public mcda.demo1.resource.mcda.IMcdaTextScanner createLexer() {
		return new mcda.demo1.resource.mcda.mopp.McdaAntlrScanner(new mcda.demo1.resource.mcda.mopp.McdaLexer());
	}
	
	public mcda.demo1.resource.mcda.IMcdaTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new mcda.demo1.resource.mcda.mopp.McdaParser().createInstance(inputStream, encoding);
	}
	
	public mcda.demo1.resource.mcda.IMcdaTextPrinter createPrinter(java.io.OutputStream outputStream, mcda.demo1.resource.mcda.IMcdaTextResource resource) {
		return new mcda.demo1.resource.mcda.mopp.McdaPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new mcda.demo1.resource.mcda.mopp.McdaSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new mcda.demo1.resource.mcda.mopp.McdaSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public mcda.demo1.resource.mcda.IMcdaReferenceResolverSwitch getReferenceResolverSwitch() {
		return new mcda.demo1.resource.mcda.mopp.McdaReferenceResolverSwitch();
	}
	
	public mcda.demo1.resource.mcda.IMcdaTokenResolverFactory getTokenResolverFactory() {
		return new mcda.demo1.resource.mcda.mopp.McdaTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "Demo1/metamodel/demo1.cs";
	}
	
	public String[] getTokenNames() {
		return mcda.demo1.resource.mcda.mopp.McdaParser.tokenNames;
	}
	
	public mcda.demo1.resource.mcda.IMcdaTokenStyle getDefaultTokenStyle(String tokenName) {
		return new mcda.demo1.resource.mcda.mopp.McdaTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaBracketPair> getBracketPairs() {
		return new mcda.demo1.resource.mcda.mopp.McdaBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new mcda.demo1.resource.mcda.mopp.McdaFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new mcda.demo1.resource.mcda.mopp.McdaResourceFactory();
	}
	
	public mcda.demo1.resource.mcda.mopp.McdaNewFileContentProvider getNewFileContentProvider() {
		return new mcda.demo1.resource.mcda.mopp.McdaNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new mcda.demo1.resource.mcda.mopp.McdaResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "mcda.demo1.resource.mcda.ui.launchConfigurationType";
	}
	
	public mcda.demo1.resource.mcda.IMcdaNameProvider createNameProvider() {
		return new mcda.demo1.resource.mcda.analysis.McdaDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		mcda.demo1.resource.mcda.mopp.McdaAntlrTokenHelper tokenHelper = new mcda.demo1.resource.mcda.mopp.McdaAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(mcda.demo1.resource.mcda.mopp.McdaTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
