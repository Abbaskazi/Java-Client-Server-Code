import java.net.*;
import java.io.*;

//In this code The Message is Pass client to server

public class TCPServer{
	public static void main(String[] args)throws Exception{	
		ServerSocket server = new ServerSocket(111);
		Socket client = server.accept();
		InputStreamReader read = new InputStreamReader(client.getInputStream());
		BufferedReader r = new BufferedReader(read);
//		String msg = r.readLine();
		System.out.println(r.readLine());
	}
}