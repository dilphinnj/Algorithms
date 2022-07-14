package com.dilip.basics;

public class InitBlock {
	int speed;

	InitBlock() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	{
		System.out.println("instance initializer block invoked");
	}

	public static void main(String args[]) {
		InitBlock b1 = new InitBlock();
		InitBlock b2 = new InitBlock();
	}

}
