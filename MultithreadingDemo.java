package com.brainmentors.java.oops;

//class Practice extends Thread {
class Practice implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is: "+Thread.currentThread().getId());
	}
	
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++)
		{
			//Practice obj = new Practice();
			Thread obj = new Thread(new Practice());
			obj.start();
			//obj.run();
		}
	}

}
