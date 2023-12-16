package com.kn.aggregation;

public class Pilot {
	String pilotName;
	
	public Pilot(String pilotName) {
		
		this.pilotName = pilotName;
	}


	public  void fly() {
		System.out.println(pilotName+" is flying Tonight...............");
	}

}
