package com.brainmentors.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Connection Open");
		System.out.println("DB Query");
//		try means guarded region
		try {
			
			String path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File12\\abc.txt";		
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes this file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
			}
		}
		
		catch(IOException e)
		{
			System.out.println("File Can't be Create");
			return;
		}
//		catch(Exception e)
//		{
//			System.out.println("System Error. Please connect to Admin");
//		}
		
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Connection Close");

	}

}
