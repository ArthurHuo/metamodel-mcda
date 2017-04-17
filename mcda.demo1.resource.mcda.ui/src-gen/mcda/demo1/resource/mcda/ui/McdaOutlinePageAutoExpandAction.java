/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaOutlinePageAutoExpandAction extends mcda.demo1.resource.mcda.ui.AbstractMcdaOutlinePageAction {
	
	public McdaOutlinePageAutoExpandAction(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
