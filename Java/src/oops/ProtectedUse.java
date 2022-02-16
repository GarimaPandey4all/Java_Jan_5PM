package com.brainmentors.java.oops;

class Person_ {
	protected String name = "Ram Kumar";
}

class Student_ extends Person_ {
	public void print()
	{
		System.out.println(name);
	}
}

public class ProtectedUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_ student = new Student_();
		student.print();

	}

}
