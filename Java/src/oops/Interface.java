package com.brainmentors.java.oops;

interface Add {
	void print();
}

interface Sub {
	void show();
}

class C implements Add, Sub { // Multiple Interface
	
	@Override
	public void print()
	{
		System.out.println("Hello");
	}

	@Override
	public void show() {
		System.out.println("How are you");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.print();
		obj.show();
	}

}
