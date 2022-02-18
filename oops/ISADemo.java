package com.brainmentors.java.oops;

class Person { // parent class
	private String name;
	
//	Person()
//	{
//		name = "Ram Kumar";
//	}	
	Person(String name)
	{
		this.name = name;
	}
	public void printName()
	{
		System.out.println(name);
	}
	
	public void contNumber()
	{
		System.out.println("Person Contact Number");
	}
}

//Child class
class Employee extends Person // extends : inheritance
{
	private int id;
	
	Employee()
	{
		super("Ram Kumar");
		//super(); // parent default cons call (implicit super call)
		id = 101;
	}
	
	public void printId()
	{
		System.out.println(id);
	}
	
	@Override
	public void contNumber()
	{
		super.contNumber();
		System.out.println("Employee Contact Number");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.printId();
		e.printName();
		e.contNumber();
		
//		Person p = new Person("Ram");
//		p.contNumber();
	}

}
