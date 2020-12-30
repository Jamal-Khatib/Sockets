package sock;
import java.io.*;
import java.net.*;
public class MyClient {
	public static void main(String[] args) throws IOException {
		
		String ip = args[0];
		int port = Integer.parseInt(args[1]);
		Socket socket = new Socket(ip, port);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String messageIn, messageOut;
		messageIn = in.readLine() ; 
		while (messageIn!= null) {
			
			System.out.println("Server: " + messageIn); //will read the greeting message
			messageOut = stdIn.readLine();
			if (messageOut.equals("Bye")) {
					out.println(messageOut);
					break;
				}
			out.println(messageOut);
			messageIn = in.readLine() ; 
			
		}
		socket.close();
	}
}