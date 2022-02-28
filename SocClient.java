package com.brainmentors.java.oops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {

	public static void main(String[] args) throws Exception {
		
		String ip = "localhost";
		int port = 9999;
		Socket s = new Socket(ip, port);
		
		String str = "Sonal";
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.println(str);
		os.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String subString = br.readLine();
		
		System.out.println("Data from Server: "+subString);
		

	}

}
