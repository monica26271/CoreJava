package com.kp.swithcase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the planet's name to know the order from the sun");
		String planetName=scan.next();
		orderOfPlanet(planetName);
		
		scan.close();

	}

	 static void orderOfPlanet(String planetName) {
		switch (planetName) {
		case "Mercury": {
			System.out.println(1);
			break;
		}
		case "Venus": {
			System.out.println(2);
			break;
		}
		case "Earth": {
			System.out.println(3);
			break;
		}
		case "Mars": {
			System.out.println(4);
			break;
		}
		case "Jupiter": {
			System.out.println(5);
			break;
		}
		case "Saturn": {
			System.out.println(6);
			break;
		}
		case "Uranus": {
			System.out.println(7);
			break;
		}
		case "Neptune": {
			System.out.println(8);
			break;
		}
		default:
			System.out.println("enter the valid planet");
		}
		 /*if(planetName.equalsIgnoreCase("mercury")) {
			 System.out.println(1); 
		 }
		 else if(planetName.equalsIgnoreCase("venus")) {
			 System.out.println(2); 
		 }
		 else if(planetName.equalsIgnoreCase("earth")) {
			 System.out.println(3); 
		 }
		 else if(planetName.equalsIgnoreCase("Mars")) {
			 System.out.println(4); 
		 }
		 else if(planetName.equalsIgnoreCase("jupiter")) {
			 System.out.println(5); 
		 }
		 else if(planetName.equalsIgnoreCase("saturn")) {
			 System.out.println(6); 
		 }
		 else if(planetName.equalsIgnoreCase("uranus")) {
			 System.out.println(7); 
		 }
		 else if(planetName.equalsIgnoreCase("neptune")) {
			 System.out.println(8); 
		 }
		 else {
			 System.out.println("enter the valid planet");
			 
		 }*/
		
	}

}
