package com.brainmentors.java.oops;

public class Enemy {
	
	private String name;
	private int attack;
	private boolean weapon;
	static int counter;
	
	Enemy(String name, int attack, boolean weapon)
	{
		this.name = name;
		this.attack = attack;
		this.weapon = weapon;
		counter++; // 1
		
		System.out.println("Enemy Created "+counter+" "+name+" "+attack+" "+weapon);
	}

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			Enemy obj = new Enemy("L"+i, i, true);
		}

	}

}
