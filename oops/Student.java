package com.brainmentors.java.oops;

public class Student {
	
	//class variables, instance variables, data members
	// private member variables: Data Security or Data Hiding
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	//default constructor
	Student(){
		//Call Parametrized Constructor
		//this(1001, "Ram Kumar", "812364689", "MCA", 10000);
		collegeName = "SRCC";
	}
	
	//parameterized constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
		this(); // call default constructor
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}

	public void print()
	{
		System.out.println("Roll no is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}
	
	//getter
	public String getPhone() {
		return phone;
	}

	//setter
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Call Parameterized Constructor
		Student ram = new Student(1001, "Ram Kumar", "812364689", "MCA", 10000);	
		
		//Student ram = new Student(); // Call default constructor 
		
		// new - is used to allocate memory at runtime
		//ram.takeInput(1001, "Ram Kumar", "812364689", "MCA", 10000);
		
		ram.print();
		
//		ram.setPhone("8374987345");
//		ram.print();
//		System.out.println(ram.getPhone());
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
//		ram.rollno = 1001;
//		ram.name = "Ram Kumar";
//		ram.phone = "9326498693";
//		ram.course = "MCA";
//		ram.fees = 10000;
		
		//System.out.println("*************************************************");
		
		//ram.print();
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
	}
	
	// r, n, c, p, f = local variables
		//public void takeInput(int r, String n, String p, String c, double f) {
//		public void takeInput(int rollno, String name, String phone, String course, double fees) {
////			instance variable = local variable
//			
//			this.rollno = rollno;
//			this.name = name;
//			this.phone = phone;
//			this.course = course;
//			this.fees = fees;	
	//
////			rollno = r;
////			name = n;
////			phone = p;
////			course = c;
////			fees = f;
//		}

}
