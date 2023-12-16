package com.kn.exceptionhandling;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome!to Calculator Application ");
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Numerator value = ");
		int numerator=scan.nextInt();
		
		System.out.println("Enter the Denominator value = ");
		int denominator=scan.nextInt();
		double division=0.0;
		try {
			division=numerator/denominator;
		}catch(ArithmeticException ae) {
			System.out.println("Enter any non zero value for denominator");
		}
	
		System.out.println("Division = "+division);

	}

}
