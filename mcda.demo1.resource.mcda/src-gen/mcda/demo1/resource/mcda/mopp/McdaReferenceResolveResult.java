/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * A basic implementation of the
 * mcda.demo1.resource.mcda.IMcdaReferenceResolveResult interface that collects
 * mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class McdaReferenceResolveResult<ReferenceType> implements mcda.demo1.resource.mcda.IMcdaReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<mcda.demo1.resource.mcda.IMcdaReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<mcda.demo1.resource.mcda.IMcdaQuickFix> quickFixes;
	
	public McdaReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<mcda.demo1.resource.mcda.IMcdaQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(mcda.demo1.resource.mcda.IMcdaQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<mcda.demo1.resource.mcda.IMcdaQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<mcda.demo1.resource.mcda.IMcdaReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new mcda.demo1.resource.mcda.mopp.McdaElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<mcda.demo1.resource.mcda.IMcdaReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new mcda.demo1.resource.mcda.mopp.McdaURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
