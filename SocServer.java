package com.brainmentors.java.oops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("Server is Started");
		ServerSocket ss = new ServerSocket(9999);
		
		System.out.println("Server is Waiting for Client Request");
		Socket s = ss.accept();
		
		System.out.println("Client Connected");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println("Client Data: "+str);
		
		String subString = str.substring(0, 3);
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(subString);
		os.flush();
		System.out.println("Data sent from server to client");

	}

}
