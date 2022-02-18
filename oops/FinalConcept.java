package com.brainmentors.java.oops;

final class Base { // to prevent inheritance use final
	public final void display() // to prevent method overriding use final
	{
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	@Override
	public void display()
	{
		System.out.println("Derived Class");
	}
}

public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float pi = 3.14f;
		
		//pi = 45.6f; // error
		
		System.out.println(pi);

	}

}
