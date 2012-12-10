package messagePackage.messages;

//import messagePackage.messages.ModemMessage.Direction;

public class StartMessage extends CommandMessage {
	public StartMessage(String messageProducerName, Direction direction) {
		super(messageProducerName, direction);
	}
}

