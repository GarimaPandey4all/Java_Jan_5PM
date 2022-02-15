package com.brainmentors.java.oops;

public class Student {
	
	//Class variables, instance variables, data members
	//Data Security or Data Hiding
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	
	public void print()
	{
		System.out.println("Rollno is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("phone is: "+phone);
		System.out.println("course is: "+course);
		System.out.println("fees is: "+fees);
	}
	
//	int rollno, String name, String phone, String course, double fees: local variables
	public void takeInput(int rollno, String name, String phone, String course, double fees)
	{
//		instance variable = local variable
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(); // new: to allocate dynamic memory	
//		ram: reference variable
		ram.takeInput(1001, "Ram Kumar", "8234769832", "MCA", 10000);
		ram.print();
		

//		System.out.println("Rollno is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("phone is: "+ram.phone);
//		System.out.println("course is: "+ram.course);
//		System.out.println("fees is: "+ram.fees);
		
//		ram.rollno = 1001;
//		ram.name = "Ram Kumar";
//		ram.phone = "243873268";
//		ram.course = "MCA";
//		ram.fees = 10000;
		
//		System.out.println("**********************************************");
		
//		System.out.println("Rollno is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("phone is: "+ram.phone);
//		System.out.println("course is: "+ram.course);
//		System.out.println("fees is: "+ram.fees);
	}

}
