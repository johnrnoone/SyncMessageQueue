package messagePackage.messages;

// Declare CommandMessage, a subclass of ModemMessage
public abstract class CommandMessage extends ModemMessage {
	
//  The following will not compile, an abstract class cannot implement an abstract class	
//  public abstract class CommandMessage implements ModemMessage {
	
//  The following does not compile, and abstract class cannot extend multiple abstract classes
//	public abstract class CommandMessage extends ModemMessage, AnotherModemMessage {

	public CommandMessage(String messageProducerName, Direction direction) {
		super(messageProducerName, direction);
	}
}
