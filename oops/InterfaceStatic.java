package com.brainmentors.java.oops;

interface Example {
	
	static void display()
	{
		System.out.println("Static Method in Interface");
	}
	
	void show();
}

public class InterfaceStatic implements Example{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceStatic obj = new InterfaceStatic();
		obj.show();
		Example.display();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method in Interface");
	}

}
