package com.brainmentors.java.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Connection Open");
		System.out.println("DB Query");
//		try means guarded region
		try {
			
			String t = null;
			t.toUpperCase(); // throw new NullPointerException
			
			int m[] = new int[10];
			m[11] = 100; // throw new ArrayIndexOutOfBoundsException
			
			int e = 100 / 0; // throw new ArithmeticException
		}
		//handling
		catch(ArithmeticException e)
		{
			System.out.println("Divide a number by zero "+e);
//			return;
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You Exceed the Limit");
			return;
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is NULL");
			return;
		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Connection Close");

	}

}
