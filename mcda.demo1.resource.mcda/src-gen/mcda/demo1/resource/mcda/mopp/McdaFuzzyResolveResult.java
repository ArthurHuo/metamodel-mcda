/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * A FuzzyResolveResult is an implementation of the IMcdaReferenceResolveResult
 * interface that delegates all method calls to a given
 * IMcdaReferenceResolveResult with ReferenceType EObject. It is used by reference
 * resolver switches to collect results from different reference resolvers in a
 * type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class McdaFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements mcda.demo1.resource.mcda.IMcdaReferenceResolveResult<ReferenceType> {
	
	private mcda.demo1.resource.mcda.IMcdaReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public McdaFuzzyResolveResult(mcda.demo1.resource.mcda.IMcdaReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(mcda.demo1.resource.mcda.IMcdaQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
