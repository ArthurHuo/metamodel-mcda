/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.mopp;

/**
 * The McdaTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class McdaTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new mcda.demo1.resource.mcda.mopp.McdaMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<mcda.demo1.resource.mcda.mopp.McdaTaskItem> taskItems = new java.util.ArrayList<mcda.demo1.resource.mcda.mopp.McdaTaskItem>();
		mcda.demo1.resource.mcda.mopp.McdaTaskItemDetector taskItemDetector = new mcda.demo1.resource.mcda.mopp.McdaTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = mcda.demo1.resource.mcda.util.McdaStreamUtil.getContent(inputStream);
			mcda.demo1.resource.mcda.IMcdaTextScanner lexer = new mcda.demo1.resource.mcda.mopp.McdaMetaInformation().createLexer();
			lexer.setText(content);
			
			mcda.demo1.resource.mcda.IMcdaTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			mcda.demo1.resource.mcda.mopp.McdaPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			mcda.demo1.resource.mcda.mopp.McdaPlugin.logError("Exception while searching for task items", e);
		}
		
		for (mcda.demo1.resource.mcda.mopp.McdaTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new mcda.demo1.resource.mcda.mopp.McdaMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
