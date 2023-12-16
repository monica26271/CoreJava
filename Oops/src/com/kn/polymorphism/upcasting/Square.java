package com.kn.polymorphism.upcasting;

public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

	@Override
	public double calArea() {
		double side=2.5;
		return side*side;
	}
	

}
