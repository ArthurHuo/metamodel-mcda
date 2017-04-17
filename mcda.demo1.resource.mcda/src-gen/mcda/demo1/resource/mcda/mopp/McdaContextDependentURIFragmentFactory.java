/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class McdaContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements mcda.demo1.resource.mcda.IMcdaContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final mcda.demo1.resource.mcda.IMcdaReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public McdaContextDependentURIFragmentFactory(mcda.demo1.resource.mcda.IMcdaReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public mcda.demo1.resource.mcda.IMcdaContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new mcda.demo1.resource.mcda.mopp.McdaContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public mcda.demo1.resource.mcda.IMcdaReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
