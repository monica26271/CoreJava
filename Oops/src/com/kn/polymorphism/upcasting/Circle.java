package com.kn.polymorphism.upcasting;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

	@Override
	public double calArea() {
		double r=2.5;
		return Math.PI*r*r;
	}
	
	

}
