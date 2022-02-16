package com.brainmentors.java.oops;
class X
{
	private int x;
	X()
	{
		System.out.println("X Default Cons Call");
	}	
	X(int x)
	{
		this();
		this.x = x;
		System.out.println("X Param Cons Call "+x);
	}
}
class Y extends X
{
	private int y;
	Y()
	{
		this(99);
		//super(100);
		System.out.println("Y Default Cons Call");
	}	
	Y(int y)
	{
		super(100);
		this.y = y;
		System.out.println("Y Param Cons Call "+y);
	}
}
public class SupervsThis {
	public static void main(String[] args) {		
		Y obj = new Y();

	}

}
