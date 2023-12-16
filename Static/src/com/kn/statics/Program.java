package com.kn.statics;

public class Program {
	
	//Static variable
	static int x,y;
	
	//Static block
	static {
		System.out.println("Static Block");
		x=10;
		y=20;
		System.out.println("*************");
	}
	
	//Static method
	public static void disp1() {
		System.out.println("Static Method");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("**************");
	}
	
	//Instance variable
	int a,b;
	
	//Instance block
	{
		System.out.println("Instance Block");
		a=11;
		b=22;
		x=100;
		y=200;
		System.out.println("**************");
	}
	
	//Instance method
	public void disp2() {
		System.out.println("Instance Method");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("**************");
	}

	//Constructor
	public Program() {
		System.out.println("Constructor");
	}
	

}
