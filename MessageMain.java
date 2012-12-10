package messagePackage;

public class MessageMain {

	public static void main(String args[]) {
		System.out.println("This is MessageMain");
		QueueClass q = new QueueClass();
		new MessageProducer(q);
		new MessageConsumer(q);
		System.out.println("Press Control-C to stop.");
	}
}
