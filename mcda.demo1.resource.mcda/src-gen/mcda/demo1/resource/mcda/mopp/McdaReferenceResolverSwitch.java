/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaReferenceResolverSwitch implements mcda.demo1.resource.mcda.IMcdaReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, mcda.demo1.resource.mcda.IMcdaReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public mcda.demo1.resource.mcda.IMcdaReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> mcda.demo1.resource.mcda.IMcdaReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, mcda.demo1.resource.mcda.IMcdaReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(mcda.demo1.resource.mcda.IMcdaOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new mcda.demo1.resource.mcda.util.McdaRuntimeUtil().logWarning("Found value with invalid type for option " + mcda.demo1.resource.mcda.IMcdaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof mcda.demo1.resource.mcda.IMcdaReferenceResolver) {
			mcda.demo1.resource.mcda.IMcdaReferenceResolver replacingResolver = (mcda.demo1.resource.mcda.IMcdaReferenceResolver) resolverValue;
			if (replacingResolver instanceof mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			mcda.demo1.resource.mcda.IMcdaReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof mcda.demo1.resource.mcda.IMcdaReferenceCache) {
					mcda.demo1.resource.mcda.IMcdaReferenceResolver nextResolver = (mcda.demo1.resource.mcda.IMcdaReferenceResolver) next;
					if (nextResolver instanceof mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new mcda.demo1.resource.mcda.util.McdaRuntimeUtil().logWarning("Found value with invalid type in value map for option " + mcda.demo1.resource.mcda.IMcdaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new mcda.demo1.resource.mcda.util.McdaRuntimeUtil().logWarning("Found value with invalid type in value map for option " + mcda.demo1.resource.mcda.IMcdaOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + mcda.demo1.resource.mcda.IMcdaDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
