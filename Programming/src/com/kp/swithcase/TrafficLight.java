package com.kp.swithcase;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Color");
		String color=scan.next();
		detectTrafficColor(color);
		
		
		
		scan.close();

	}

	static void detectTrafficColor(String color) {
		/*switch(color) {
		case "red":{
	
			System.out.println(" STOP ");
			break;
		}
		case "yellow":{
			
			System.out.println(" READY ");
			break;
		}
		case "green":{
			
			System.out.println(" GO ");
			break;
		}
		
	}*/
		if(color.equals("red")) {
			System.out.println(" STOP ");
		}
		else if(color.equals("yellow")) {
			System.out.println(" READY ");
		}
		else if(color.equals("green")) {
			System.out.println(" GO ");
		}
		else {
			System.out.println("Enter the valid color");
		}

}
}

