/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mcda.demo1.resource.mcda.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class McdaDebugMessage {
	
	private static final char DELIMITER = ':';
	private mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes messageType;
	private String[] arguments;
	
	public McdaDebugMessage(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public McdaDebugMessage(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return mcda.demo1.resource.mcda.util.McdaStringUtil.encode(DELIMITER, parts);
	}
	
	public static McdaDebugMessage deserialize(String response) {
		java.util.List<String> parts = mcda.demo1.resource.mcda.util.McdaStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes type = mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes.valueOf(messageType);
		McdaDebugMessage message = new McdaDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(mcda.demo1.resource.mcda.debug.EMcdaDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + mcda.demo1.resource.mcda.util.McdaStringUtil.explode(arguments, ", ") + "]";
	}
	
}
