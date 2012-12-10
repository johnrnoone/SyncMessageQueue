package messagePackage;

import java.io.*;
import java.net.*;

public class MessageServer {

	String[] adviceList={"Take smaller bites.", "Go for the tight jeans.", "One word: inappropriate", "Just for today, be honest", "You might rethink that haircut"};

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket (4242);
			while (true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				System.out.println (advice);
				writer.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}

	public static void main (String[] args) {
		MessageServer server = new MessageServer();
		server.go();
	}
}


