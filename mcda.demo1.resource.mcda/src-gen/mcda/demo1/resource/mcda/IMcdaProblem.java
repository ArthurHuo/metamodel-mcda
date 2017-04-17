/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda;

public interface IMcdaProblem {
	public String getMessage();
	public mcda.demo1.resource.mcda.McdaEProblemSeverity getSeverity();
	public mcda.demo1.resource.mcda.McdaEProblemType getType();
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> getQuickFixes();
}
