package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientU {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Socket me  = new Socket(args[0],Integer.parseInt(args[1])) ; 
		PrintWriter out = new PrintWriter(me.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(me.getInputStream()));
		
		System.out.println("Server: "+in.readLine());
		Scanner s = new Scanner(System.in) ; 
		
		out.println(s.next()) ; 
		
		System.out.println(in.readLine());
		
		me.close(); 
		
		

	}

}
