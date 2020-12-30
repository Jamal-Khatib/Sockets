package threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerU {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		int port = Integer.parseInt(args[0]) ; 
		ServerSocket server = new ServerSocket(port) ; 
		System.out.println("Waiting for clients");
		while(true)
		{
			Socket client = server.accept() ; 
			new thready(client).start(); 
			
		}
		
		
	}

}
