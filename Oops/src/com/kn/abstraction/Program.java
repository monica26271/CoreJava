package com.kn.abstraction;

 abstract public class Program {
	//static variable
	static int i;
	
	//instance variable
	int j;
	
	//static block
	static {
		System.out.println("Static block");
		i=10;
	}
	
	//instance block
	{
		System.out.println("Instance block");
		j=20;
	}
	
	//static method
	public static void m1() {
		System.out.println("Static Method");
	}
	
	//instance method
	public void m2() {
		System.out.println("Instance Method");
	}
	
	//abstract method
	abstract public void m3();
	
	//final method
	public final void m4() {
		System.out.println("Final Method");
	}

	//constructor
	public Program() {
		System.out.println("Parent class constructor");
	}
	
	//main
	public static void main(String[] args) {
		System.out.println("Parent class main");
	}
	
	
	
	

}
