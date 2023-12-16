package com.kp.swithcase;

import java.util.Scanner;

public class MonthCalender {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to know the month");
		int month=scan.nextInt();
		monthCalender(month);
		scan.close();

	}

	 static void monthCalender(int month) {
		 switch (month) {
			case 1: {
				System.out.println(" heyy!! 1st Month is January");
				break;
			}
			case 2: {
				System.out.println(" heyy!! 2nd Month is February");
				break;
			}
			case 3: {
				System.out.println(" heyy!! 3rd Month is March");
				break;
			}
			case 4: {
				System.out.println(" heyy!! 4th Month is April");
				break;
			}
			case 5: {
				System.out.println(" heyy!! 5th Month is May");
				break;
			}
			case 6: {
				System.out.println(" heyy!! 6th Month is June");
				break;
			}
			case 7: {
				System.out.println(" heyy!! 7th Month is July");
				break;
			}
			case 8: {
				System.out.println(" heyy!! 8th Month is August");
				break;
			}
			case 9: {
				System.out.println(" heyy!! 9th Month is September");
				break;
			}
			case 10: {
				System.out.println(" heyy!! 10th Month is October");
				break;
			}
			case 11: {
				System.out.println(" heyy!! 11th Month is November");
				break;
			}
			case 12: {
				System.out.println(" heyy!! 7th Month is December");
				break;
			}
			
			default:
				System.out.println("Enter the valid input to know the Months");
			}
			
	}

}
