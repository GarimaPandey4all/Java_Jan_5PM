package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		return fileName.endsWith(".txt");
	}	
}
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\sample.txt";
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\sampleCopy.txt");
			file.renameTo(file2);
			//file.delete();
			//System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		path = "E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\example\\aa\\bb\\cc";
		
		file = new File(path);
		
		//file.mkdir(); // make directory: make one folder
		file.mkdirs(); // make directories: make more than one folder
		
		file = new File("E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\songs");
		MyFilter filter = new MyFilter();
		
		File files[] = file.listFiles(filter);
		
		System.out.println("No of files "+files.length);
		

	}
}
