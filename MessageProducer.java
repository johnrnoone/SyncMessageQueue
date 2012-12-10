package messagePackage;

import java.util.Calendar;
import java.util.Scanner;

import messagePackage.messages.ConfigureMessage;
import messagePackage.messages.StartMessage;
import messagePackage.messages.StopMessage;
import messagePackage.messages.ModemMessage.Direction;

public class MessageProducer implements Runnable {
	QueueClass q;
	MessageProducer(QueueClass q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		Scanner in = new Scanner(System.in);
		boolean stopExit = false;

		System.out.format("messageProducer is executing at local time: %tT", Calendar.getInstance()); System.out.println("");
		while (!stopExit) {
			System.out.println("Select the message to send: "); 
			System.out.print("   1 = Configure message, 2 = Start message, 3 = Stop message  (type q to quit)..."); 
			String answer = in.next(); System.out.println();
			if (answer.equalsIgnoreCase("q")) {
				stopExit = true;
				
			} else if (answer.equalsIgnoreCase("1")) {
				System.out.println("MessageProducer sending Configure message to messageConsumer ");
				ConfigureMessage config = new ConfigureMessage("ConfigReq", Direction.DOWN);
				q.put(config);

			} else if (answer.equalsIgnoreCase("2")) {
				System.out.println("MessageProducer sending Start message to messageConsumer ");
				StartMessage start = new StartMessage("StartReq", Direction.DOWN);
				q.put(start);

			} else if (answer.equalsIgnoreCase("3")) {
				System.out.println("MessageProducer sending Stop message to messageConsumer ");
				StopMessage stop = new StopMessage("StopReq", Direction.DOWN);
				q.put(stop);
				
			} else {
				System.out.println("Invalid selection, "+answer+",  please try again. ");
			}
		}

		System.out.print("Exiting, thanks for playing. Please come again. ");
	}	
	
}

