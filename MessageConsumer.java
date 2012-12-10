package messagePackage;

import messagePackage.messages.ConfigureMessage;
import messagePackage.messages.ModemMessage;
import messagePackage.messages.StartMessage;
import messagePackage.messages.StopMessage;

class MessageConsumer implements Runnable {
	QueueClass q;
	MessageConsumer(QueueClass q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		while(true) {
			ModemMessage modemMessage = q.get();
			if (modemMessage instanceof ConfigureMessage) {
				System.out.println ("MessageConsumer gets a ConfigureMessage");
			} else if (modemMessage instanceof StartMessage) {
				System.out.println ("MessageConsumer gets a StartMessage");
			} else if (modemMessage instanceof StopMessage) {
				System.out.println ("MessageConsumer gets a StopMessage");
			} else {
				System.out.println ("MessageConsumer gets an unknown message");
			}
		}
	}
}
