/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class McdaExpectedCsString extends mcda.demo1.resource.mcda.mopp.McdaAbstractExpectedElement {
	
	private mcda.demo1.resource.mcda.grammar.McdaKeyword keyword;
	
	public McdaExpectedCsString(mcda.demo1.resource.mcda.grammar.McdaKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public mcda.demo1.resource.mcda.grammar.McdaSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof McdaExpectedCsString) {
			return getValue().equals(((McdaExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
