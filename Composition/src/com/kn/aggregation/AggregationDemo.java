package com.kn.aggregation;

public class AggregationDemo {
	public static void main(String[] args) {
		Pilot pilot=new Pilot("Flying Beast");
		Airlines airlines =new Airlines("AirIndia", pilot);
		
		airlines.operation();
		//shutdown Airlines
		airlines=null;
		System.out.println("-----------> Airline has been SHUTDOWN.");
		pilot.fly();
		
		
	}
	
}
