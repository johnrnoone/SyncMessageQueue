package messagePackage;

import messagePackage.messages.ModemMessage;

public class QueueClass {
	ModemMessage modemMessage;
	boolean valueSet = false;
	synchronized ModemMessage get() {
		if(!valueSet) 
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}

			valueSet = false;
			return modemMessage;
	}
	synchronized void put(ModemMessage modemMessage) {

		if(valueSet)
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}

			this.modemMessage = modemMessage;
			valueSet = true;
			System.out.println("Put ModemMessage");

			notify();
	}
}

