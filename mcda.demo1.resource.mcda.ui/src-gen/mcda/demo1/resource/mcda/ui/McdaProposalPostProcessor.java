/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class McdaProposalPostProcessor {
	
	public java.util.List<mcda.demo1.resource.mcda.ui.McdaCompletionProposal> process(java.util.List<mcda.demo1.resource.mcda.ui.McdaCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
