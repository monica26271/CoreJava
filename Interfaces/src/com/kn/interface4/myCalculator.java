package com.kn.interface4;

public class myCalculator implements Calculator2 {

	@Override
	public void addition() {
		System.out.println("Addition");

	}

	@Override
	public void subtraction() {
		System.out.println("Subtraction");
	}

	@Override
	public void multiplication() {
		System.out.println("Multiplication");

	}

	@Override
	public void division() {
		System.out.println("Division");
	}

}
