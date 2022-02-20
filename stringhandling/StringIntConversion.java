package com.brainmentors.java.stringhandling;

public class StringIntConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		
//		int to String
		String s = Integer.toString(a);
		
		System.out.println(s);
		
//		String to int
		a = Integer.parseInt(s);
		
		System.out.println(a);

	}

}
