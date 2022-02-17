package com.brainmentors.java.oops;

interface Additable {
	int add(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression: It is used to implement interface in a short hand way
		Additable obj = (a, b)->(a + b);
		System.out.println(obj.add(100, 200));
		
		Additable obj2 = (int a, int b)->(a + b);
		System.out.println(obj2.add(10, 20));

	}

}
