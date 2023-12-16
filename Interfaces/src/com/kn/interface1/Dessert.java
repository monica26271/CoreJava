package com.kn.interface1;

public interface Dessert {
	void enjoy();
	void gulabjamun();
	
	public static void m1() {
		mouthFreshner();
	}
	
	private static void mouthFreshner() {
		System.out.println("Mint");
	}
	
}
