/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaOutlinePageTypeSortingAction extends mcda.demo1.resource.mcda.ui.AbstractMcdaOutlinePageAction {
	
	public McdaOutlinePageTypeSortingAction(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
