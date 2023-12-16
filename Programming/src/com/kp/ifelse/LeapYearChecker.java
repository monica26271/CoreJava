package com.kp.ifelse;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=scan.nextInt();
		check(year);
		scan.close();

	}

	 static void check(int year) {
		if((year%400==0)||(year%4==0)&&(year%100!=0)) {
			System.out.println("Its a leap year");
		}
		else {
			System.out.println("Its non leap year");
		}
	}
	

}
