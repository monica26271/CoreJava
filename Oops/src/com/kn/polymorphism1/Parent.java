package com.kn.polymorphism1;

public class Parent {
	
	public Car display() {
		System.out.println("Parent");
		return new Audi();
	}
}
