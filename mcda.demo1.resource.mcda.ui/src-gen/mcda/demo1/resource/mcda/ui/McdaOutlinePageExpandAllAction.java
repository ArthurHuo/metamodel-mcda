/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaOutlinePageExpandAllAction extends mcda.demo1.resource.mcda.ui.AbstractMcdaOutlinePageAction {
	
	public McdaOutlinePageExpandAllAction(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
