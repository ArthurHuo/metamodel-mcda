/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private mcda.demo1.resource.mcda.IMcdaResourceProvider resourceProvider;
	private mcda.demo1.resource.mcda.ui.IMcdaBracketHandlerProvider bracketHandlerProvider;
	
	public McdaCompletionProcessor(mcda.demo1.resource.mcda.IMcdaResourceProvider resourceProvider, mcda.demo1.resource.mcda.ui.IMcdaBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		mcda.demo1.resource.mcda.IMcdaTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		mcda.demo1.resource.mcda.ui.McdaCodeCompletionHelper helper = new mcda.demo1.resource.mcda.ui.McdaCodeCompletionHelper();
		mcda.demo1.resource.mcda.ui.McdaCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		mcda.demo1.resource.mcda.ui.McdaProposalPostProcessor proposalPostProcessor = new mcda.demo1.resource.mcda.ui.McdaProposalPostProcessor();
		java.util.List<mcda.demo1.resource.mcda.ui.McdaCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<mcda.demo1.resource.mcda.ui.McdaCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<mcda.demo1.resource.mcda.ui.McdaCompletionProposal> finalProposalList = new java.util.ArrayList<mcda.demo1.resource.mcda.ui.McdaCompletionProposal>();
		for (mcda.demo1.resource.mcda.ui.McdaCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (mcda.demo1.resource.mcda.ui.McdaCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			mcda.demo1.resource.mcda.ui.IMcdaBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
