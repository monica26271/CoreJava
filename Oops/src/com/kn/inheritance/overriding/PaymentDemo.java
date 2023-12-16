package com.kn.inheritance.overriding;

public class PaymentDemo {

	public static void main(String[] args) {
		Upi u=new Upi();
		u.bill();
		u.offer();
		u.pay();
		System.out.println();
		
		Wallet w=new Wallet();
		w.bill();
		w.offer();
		w.pay();
		System.out.println();
		
		
		Card c=new Card();
		c.bill();
		c.offer();
		c.pay();
		System.out.println();
	

	}

}
