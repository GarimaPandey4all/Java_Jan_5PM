package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			file.delete();
			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\example\\aa\\bb\\cc";
		
		file = new File(path);
		
		//file.mkdir(); // make directory: make one folder
		file.mkdirs(); // make directories: make more than one folder
		

	}

}
