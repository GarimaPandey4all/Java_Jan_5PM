package com.brainmentors.java.oops;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Method method = Demo.class.getDeclaredMethod("show");
		method.setAccessible(true);
		method.invoke(null, null);
	}
}
