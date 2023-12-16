package com.kn.inheritance.overriding;

public class Wallet extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment via Wallet");
		
	}
	

}
