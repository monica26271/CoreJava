package com.kn.polymorphism.upcasting;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calArea());
	}

}
