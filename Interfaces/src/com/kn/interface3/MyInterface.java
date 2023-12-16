package com.kn.interface3;

public interface MyInterface {
	
	//static variable
	public static final int j=0;
	
	//static block -Error
//	static {
//		System.out.println("Static block");
//	}
	
	//instance variable -Error
//	int i;
	
	//instance block -Error
//	{
//		System.out.println("Instance block");
//	}
	
	//instance method  -Error
//	public void m1() {
//		System.out.println("Instance Method");
//	}
	
	//Main method
	public static void main(String[] args) {
		System.out.println("Main method inside the interface");
	}
	
	//default method allowed from java-8 onwards
	public default void m2() {
		System.out.println("default method inside the interface");
	}
	
	//final method -Error
//	public static final void m3() {
//		
//	}
	
	//private method java-9 onwards
	private void m4() {
		
	}
	//static method java-8 onwards
	public static void m5() {
		
	}

}
