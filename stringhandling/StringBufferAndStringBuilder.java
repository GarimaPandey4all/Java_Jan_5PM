package com.brainmentors.java.stringhandling;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Capacity Cross:
//			
//			Old Cap * 2 + 2 
//			16 * 2 + 2 = 34

//		StringBuilder is fast than StringBuffer.
		
		//StringBuffer sb = new StringBuffer(); // it is less efficient than StringBuilder
		//StringBuffer is synchronized in nature
		StringBuilder sb = new StringBuilder(); // it is more efficient than StringBuffer
//		StringBuilder is asynchronized in nature as it does't wait to complete the process
		
		System.out.println(sb.capacity() +" "+ sb.length());
		sb.append("Hello");
		System.out.println(sb.capacity() +" "+ sb.length());
		sb.append("How are you I am fine iubwefciuwiuihyluiylulreuitliueriu");
		System.out.println(sb.capacity() +" "+ sb.length());
		sb.append("How are");
		System.out.println(sb.capacity() +" "+ sb.length());
		
		
	}
}
