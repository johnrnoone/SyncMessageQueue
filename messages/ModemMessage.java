package messagePackage.messages;


//	A single abstract class can implement multiple interfaces
// public abstract class ModemMessage implements Message {
public abstract class ModemMessage implements Message, AnotherMessage {
	public static enum Direction{ UP, DOWN }; // Message Direction; UP( to Parent), DOWN( to Children)   

	private String threadName;
    private Direction direction;
	
	public ModemMessage(String messageProducerName, Direction direction) {
		this.threadName = messageProducerName;
		this.direction = direction;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String producerThreadName) {
		this.threadName = producerThreadName;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection (Direction direction) {
		this.direction = direction;
	}
}

