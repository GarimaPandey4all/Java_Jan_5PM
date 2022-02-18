package com.brainmentors.java.oops;

class Parent {
	void show()
	{
		System.out.println("Parent Method");
	}
	
	void display()
	{
		System.out.println("Not for Overriding");
	}
}

class Child extends Parent {
	
	@Override
	void show()
	{
		System.out.println("Child Method");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting: child object to parent
		 Parent parent = new Child();
		 parent.show();
		 parent.display();
		 
		 //Downcasting: parent object to child
		 //Child child = new Parent(); // compile time error
		 Child child = (Child)parent;
		 child.display();
		 child.show();
	}

}
