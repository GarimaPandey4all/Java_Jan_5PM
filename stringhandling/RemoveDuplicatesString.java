package com.brainmentors.java.stringhandling;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		"garima" = "garim"
		
		String str = "Exammple";
		
		String unique = new String();
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(unique.indexOf(ch) < 0) // -1
			{
				unique += ch;
			}			
		}

		System.out.println(unique);
	}

}
