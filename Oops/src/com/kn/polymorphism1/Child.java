package com.kn.polymorphism1;

public class Child extends Parent {

	@Override
	public Porsche display() {
		System.out.println("Child");
		return new Porsche();
	}
	

}
