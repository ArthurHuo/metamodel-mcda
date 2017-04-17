/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class McdaDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private mcda.demo1.resource.mcda.debug.McdaDebugTarget debugTarget;
	
	private mcda.demo1.resource.mcda.debug.McdaDebugCommunicationHelper communicationHelper = new mcda.demo1.resource.mcda.debug.McdaDebugCommunicationHelper();
	
	public McdaDebugProxy(mcda.demo1.resource.mcda.debug.McdaDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.EXIT);
	}
	
	public mcda.demo1.resource.mcda.debug.McdaDebugMessage getStack() {
		return sendCommandAndRead(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage message = new mcda.demo1.resource.mcda.debug.McdaDebugMessage(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage message = new mcda.demo1.resource.mcda.debug.McdaDebugMessage(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage response = sendCommandAndRead(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage response = sendCommandAndRead(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		mcda.demo1.resource.mcda.debug.McdaDebugVariable[] variables  = new mcda.demo1.resource.mcda.debug.McdaDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = mcda.demo1.resource.mcda.util.McdaStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new mcda.demo1.resource.mcda.debug.McdaDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			mcda.demo1.resource.mcda.debug.McdaDebugVariable variable = new mcda.demo1.resource.mcda.debug.McdaDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes command, String... parameters) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage message = new mcda.demo1.resource.mcda.debug.McdaDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private mcda.demo1.resource.mcda.debug.McdaDebugMessage sendCommandAndRead(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes command, String... parameters) {
		mcda.demo1.resource.mcda.debug.McdaDebugMessage message = new mcda.demo1.resource.mcda.debug.McdaDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
