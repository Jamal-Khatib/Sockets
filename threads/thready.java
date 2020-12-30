package threads;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class thready extends Thread {

	private Socket socket ; 
	
	public thready(Socket s1)
	{
		socket = s1 ; 
	}
	public void run()
	{
		try {
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println("Connection Accepted") ; 
			
			out.println("Your name is "+in.readLine());
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
