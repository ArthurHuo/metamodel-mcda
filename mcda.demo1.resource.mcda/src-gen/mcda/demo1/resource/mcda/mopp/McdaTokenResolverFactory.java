/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * The McdaTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class McdaTokenResolverFactory implements mcda.demo1.resource.mcda.IMcdaTokenResolverFactory {
	
	private java.util.Map<String, mcda.demo1.resource.mcda.IMcdaTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, mcda.demo1.resource.mcda.IMcdaTokenResolver> featureName2CollectInTokenResolver;
	private static mcda.demo1.resource.mcda.IMcdaTokenResolver defaultResolver = new mcda.demo1.resource.mcda.analysis.McdaDefaultTokenResolver();
	
	public McdaTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, mcda.demo1.resource.mcda.IMcdaTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, mcda.demo1.resource.mcda.IMcdaTokenResolver>();
		registerTokenResolver("QUOTED_34_34", new mcda.demo1.resource.mcda.analysis.McdaQUOTED_34_34TokenResolver());
	}
	
	public mcda.demo1.resource.mcda.IMcdaTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public mcda.demo1.resource.mcda.IMcdaTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, mcda.demo1.resource.mcda.IMcdaTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, mcda.demo1.resource.mcda.IMcdaTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected mcda.demo1.resource.mcda.IMcdaTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private mcda.demo1.resource.mcda.IMcdaTokenResolver internalCreateResolver(java.util.Map<String, mcda.demo1.resource.mcda.IMcdaTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, mcda.demo1.resource.mcda.IMcdaTokenResolver> resolverMap, String key, mcda.demo1.resource.mcda.IMcdaTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
