package com.kn.polymorphism.upcasting;

public class Rectange extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double calArea() {
		double l=10.5,d=5.5;
		return l*d ;
	}
	

}
