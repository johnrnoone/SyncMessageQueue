package messagePackage.messages;

// Declare ConfigureMessage, a subclass of CommandMessage
public class ConfigureMessage extends CommandMessage {
	public ConfigureMessage(String messageProducerName, Direction direction) {

// ConfigureMessage cannot directly implement Message unless Direction is defined as it is in ModemMessage		
//public class ConfigureMessage implements Message {
//	public ConfigureMessage(String messageProducerName, Direction direction) {
		super(messageProducerName, direction);
	}
}
