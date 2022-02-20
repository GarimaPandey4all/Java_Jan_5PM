package com.brainmentors.java.exceptionhandling;

public class ExceptionConcept3 {
	
	public static void DB() throws ArithmeticException
	{
		System.out.println("Connection Open");
		try {
			int e = 100 / 0; // exception
			System.out.println("Query and Get result of the Query");
			System.out.println("Send result to Helper");
		}
//		finally is a block that always execute
		finally {
			System.out.println("Connection Close");
		}
	}
	
	public static void helper() throws ArithmeticException
	{
		System.out.println("Call DB");
		DB();
		System.out.println("Get result from DB");
		System.out.println("Send result to View");
	}
	
	public static void view()
	{
		System.out.println("Call Helper");
		try {
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Get result from Helper");
		System.out.println("Print result to User");
	}
	
	public static void main(String[] args) {
		
		view();
		
	}

}
