package com.brainmentors.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the data to write in a file:");
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\songs\\sample.txt");
		fo.write(txt.getBytes());
		
		fo.close();
		
		System.out.println("Data write in a file");

	}

}
