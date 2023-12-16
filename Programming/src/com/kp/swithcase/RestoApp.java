package com.kp.swithcase;

import java.util.Scanner;

public class RestoApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day to Know the menu");
		String day=scan.next();
		weekdays(day);
		
		
		scan.close();

	}

	 static void weekdays(String day) {
		 switch (day) {
			case "monday": {
				System.out.println(" heyy!! Its Pasta Today");
				break;
			}
			case "tuesday": {
				System.out.println(" heyy!! Its Tacos Today");
				break;
			}
			case "wednesday": {
				System.out.println(" heyy!! Its Sushi Today");
				break;
			}
			case "thursday": {
				System.out.println(" heyy!! Its Streak Today");
				break;
			}
			case "friday": {
				System.out.println(" heyy!! Its Pizza Today");
				break;
			}
			case "saturday": {
				System.out.println(" heyy!! Its Lobster Today");
				break;
			}
			case "sunday": {
				System.out.println(" heyy!! Its Brunch Today");
				break;
			}
			default:
				System.out.println("Enter the valid input to know the Menu For the Day");
			}
	}

}
