package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\Java\\src\\com\\brainmentors\\java\\filehandling\\FileReadDemo.java";
		
		File file = new File(path);
		final int EOF = -1;
		
		if(file.exists())
		{
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read(); // 1 byte
			
			while(singleByte != EOF) // EOF: End of File
			{
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			
			fs.close();
		}
	}

}
