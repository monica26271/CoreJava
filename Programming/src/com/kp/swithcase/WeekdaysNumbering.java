package com.kp.swithcase;

import java.util.Scanner;

public class WeekdaysNumbering {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int day=scan.nextInt();
		weekdays(day);
		
		
		scan.close();

	}

	 static void weekdays(int day) {
		 switch (day) {
		case 1: {
			System.out.println(" heyy!! 1st day of week is Monday");
			break;
		}
		case 2: {
			System.out.println(" heyy!! 2nd day of week is Tuesday");
			break;
		}
		case 3: {
			System.out.println(" heyy!! 3rd day of week is Wednesday");
			break;
		}
		case 4: {
			System.out.println(" heyy!! 4th day of week is Thursday");
			break;
		}
		case 5: {
			System.out.println(" heyy!! 5th day of week is Friday");
			break;
		}
		case 6: {
			System.out.println(" heyy!! 6th day of week is Saturday");
			break;
		}
		case 7: {
			System.out.println(" heyy!! 7th day of week is Sunday");
			break;
		}
		default:
			System.out.println("Enter the valid input to know the weekdays");
		}
		
	}

}
