package com.brainmentors.java.stringhandling;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Amit";
		//String name = "   Amitt   ";
		
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.substring(1, 3));
//		1: index number (start 0)
//		3: position number (start 1)
		System.out.println(name.replace('t', 'y'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.contains("mi"));
		System.out.println(name.indexOf('t'));
		System.out.println(name.lastIndexOf('t'));
		System.out.println(name.concat(" Kumar"));
		System.out.println(name.trim());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		
		sb.reverse();
		
		System.out.println(sb);
		
//		char arr[] = name.toCharArray();
//		
//		for(int i = arr.length - 1; i >= 0; i--)
//		{
//			System.out.print(arr[i]);
//		}

	}

}
