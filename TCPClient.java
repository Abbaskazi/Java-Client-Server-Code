import java.net.*;
import java.io.*;

//In this code The Message is Pass client to server

public class TCPClient{
	public static void main(String[] args)throws Exception{				Socket client = new Socket("localhost",111);
		PrintWriter outServer = new PrintWriter(client.getOutputStream());
		String msg = "Client Responds to Server";
		outServer.println(msg);
		outServer.flush();
	}
}