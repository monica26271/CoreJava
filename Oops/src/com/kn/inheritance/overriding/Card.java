package com.kn.inheritance.overriding;

public class Card extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment via Card");
	}
	

}
