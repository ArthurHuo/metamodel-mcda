/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public class McdaOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new mcda.demo1.resource.mcda.ui.McdaOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
