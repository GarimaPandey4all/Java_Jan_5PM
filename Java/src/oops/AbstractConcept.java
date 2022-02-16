package com.brainmentors.java.oops;

abstract class Per {
	
	private String name;
	private int age;
	
	Per(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(age+" "+name);
	}
	
	public abstract void contNumber(); // method declaration
	
}

class Stud extends Per {
	
	private int id;
	
	Stud(int id)
	{
		super("Ram", 25);
		this.id = id;
	}
	
	public void display()
	{
		System.out.println(id);
	}

	@Override
	public void contNumber() {
		
		System.out.println("Student Contact Number");		
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stud student = new Stud(100);
		student.contNumber();
		student.print();
		student.display();
		
		//Per person = new Per(); // error

	}

}
