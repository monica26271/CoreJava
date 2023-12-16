package com.kn.constructor;

public class Child extends Parent{
	String name;
	int age;
	
	public Child() {
		this("Monica", 22);
	}

	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	

}
