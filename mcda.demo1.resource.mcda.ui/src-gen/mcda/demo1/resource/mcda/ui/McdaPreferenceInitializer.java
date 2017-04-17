/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

/**
 * A class used to initialize default preference values.
 */
public class McdaPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = mcda.demo1.resource.mcda.ui.McdaUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = mcda.demo1.resource.mcda.ui.McdaUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new mcda.demo1.resource.mcda.mopp.McdaMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = mcda.demo1.resource.mcda.ui.McdaUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new mcda.demo1.resource.mcda.mopp.McdaMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, mcda.demo1.resource.mcda.IMcdaMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		mcda.demo1.resource.mcda.ui.McdaBracketSet bracketSet = new mcda.demo1.resource.mcda.ui.McdaBracketSet(null, null);
		final java.util.Collection<mcda.demo1.resource.mcda.IMcdaBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (mcda.demo1.resource.mcda.IMcdaBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + mcda.demo1.resource.mcda.ui.McdaPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, mcda.demo1.resource.mcda.mopp.McdaMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			mcda.demo1.resource.mcda.IMcdaTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, mcda.demo1.resource.mcda.ui.McdaSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
