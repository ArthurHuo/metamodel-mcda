/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

public class McdaProblem implements mcda.demo1.resource.mcda.IMcdaProblem {
	
	private String message;
	private mcda.demo1.resource.mcda.McdaEProblemType type;
	private mcda.demo1.resource.mcda.McdaEProblemSeverity severity;
	private java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> quickFixes;
	
	public McdaProblem(String message, mcda.demo1.resource.mcda.McdaEProblemType type, mcda.demo1.resource.mcda.McdaEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<mcda.demo1.resource.mcda.IMcdaQuickFix>emptySet());
	}
	
	public McdaProblem(String message, mcda.demo1.resource.mcda.McdaEProblemType type, mcda.demo1.resource.mcda.McdaEProblemSeverity severity, mcda.demo1.resource.mcda.IMcdaQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public McdaProblem(String message, mcda.demo1.resource.mcda.McdaEProblemType type, mcda.demo1.resource.mcda.McdaEProblemSeverity severity, java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<mcda.demo1.resource.mcda.IMcdaQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public mcda.demo1.resource.mcda.McdaEProblemType getType() {
		return type;
	}
	
	public mcda.demo1.resource.mcda.McdaEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<mcda.demo1.resource.mcda.IMcdaQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
