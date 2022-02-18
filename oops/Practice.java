package com.brainmentors.java.oops;

public class Practice {

	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	Practice()
	{
		this(1001, "Ram");
		collegeName = "SRCC";
	}
	
	Practice(int rollno, String name)
	{
		this("3240964683");
		this.rollno = rollno;
		this.name = name;
	}
	
	Practice(String phone)
	{
		this("MCA", 10000);
		this.phone = phone;
	}
	
	Practice(String course, double fees)
	{
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice p = new Practice();
		p.print();
	}

}
