/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaAntlrScanner implements mcda.demo1.resource.mcda.IMcdaTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public McdaAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public mcda.demo1.resource.mcda.IMcdaTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		mcda.demo1.resource.mcda.IMcdaTextToken result = new mcda.demo1.resource.mcda.mopp.McdaANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
