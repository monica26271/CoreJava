package com.kp.nestedif;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the year");
		int year=scan.nextInt();
		isLeapYearOrNonLeap(year);
		
		scan.close();
		

	}

	static void isLeapYearOrNonLeap(int year) {
		if(year%400==0||year%4==0 && year%100!=0) {
			if(year>=2000) {
				System.out.println("21st Century");
			}
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is a Non Leap year");
		}

		
	}


}
