package com.brainmentors.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Employee()
	{
		id = 1001;
		name = "Ram";
		salary = 10000;
		System.out.println("Employee Default Cons");
	}
	
	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Param Cons");
	}
	
}

public class ObjectWriteDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee ram = new Employee(1002, "Ram Kumar", 10000);
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\songs\\sample.txt");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
//		Object data transfer into byte file: Serialization
		
		os.writeObject(ram);
		
		os.close();
		fo.close();
		
		System.out.println("Object Write Demo");
		
		//Byte File transfer into object Form: Deserialization
		
		FileInputStream fs = new FileInputStream("E:\\Java\\JavaProg_Jan_Eclipse_10AM\\File\\songs\\sample.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		
		Employee e = (Employee)oi.readObject();
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
		oi.close();
		fs.close();
		
	}

}
