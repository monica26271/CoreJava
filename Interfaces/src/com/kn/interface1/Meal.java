package com.kn.interface1;

public class Meal implements Dessert, Starter, Maincourse {
	//implementing multiple inheritance in interface

	@Override
	public void biriyani() {
		System.out.println("Mushroom biriyani");
	}

	@Override
	public void manchurian() {
		System.out.println("Gobi manchurian");
	}

	

	@Override
	public void gulabjamun() {
		System.out.println("2 gulabjamun's with ice cream");
		
	}
	@Override
	public void enjoy() {
		System.out.println("Enjoy the meal!!!");
	}
	

}
