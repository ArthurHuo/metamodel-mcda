/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaOutlinePageCollapseAllAction extends mcda.demo1.resource.mcda.ui.AbstractMcdaOutlinePageAction {
	
	public McdaOutlinePageCollapseAllAction(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
