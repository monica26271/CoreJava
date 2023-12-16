package com.kn.aggregation;

public class Airlines {
	String name;
	Pilot pilot;
	
	public Airlines(String name, Pilot pilot) {
		super();
		this.name = name;
		this.pilot = pilot;
	}
	
	public void operation() {
		System.out.println(name+" is operating sucessfully !!!");
		pilot.fly();
	}
	
	
	

}
