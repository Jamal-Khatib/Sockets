package sock;
import java.net.*;
import java.io.*;
public class MyServer {
	public static void main(String[] args) throws IOException {
		
		int port = Integer.parseInt(args[0]);
		ServerSocket server = new ServerSocket(port);
		Socket socket = server.accept(); //blocking
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String messageIn, messageOut;
		
		messageOut = "Greetings client!";
		out.println(messageOut);
		
		while ((messageIn = in.readLine()) != null) {
			
			System.out.println("Client:"+messageIn);
			if (messageIn.equals("Bye"))
				break;
			messageOut = stdIn.readLine() ; 
			out.println(messageOut) ; 
			
		}
		
		System.out.println("Closing socket");
		server.close();
		socket.close();
	}
}