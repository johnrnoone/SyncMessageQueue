package messagePackage.messages;

import messagePackage.messages.ModemMessage.Direction;

public class StopMessage extends CommandMessage {
	public StopMessage(String messageProducerName, Direction direction) {
		super(messageProducerName, direction);
	}
}


