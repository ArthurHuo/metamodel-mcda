/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.ui;

public abstract class AbstractMcdaOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer;
	
	public AbstractMcdaOutlinePageAction(mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = mcda.demo1.resource.mcda.ui.McdaImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = mcda.demo1.resource.mcda.ui.McdaUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			mcda.demo1.resource.mcda.ui.McdaUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (mcda.demo1.resource.mcda.ui.McdaOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
