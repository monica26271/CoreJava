package com.kn.exceptionhandling2;

import java.util.Scanner;

public class CalculatorApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome to calculator Application...!!!");
		System.out.println();
		System.out.println();
		System.out.println("Enter two numbers ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println();

		add(num1,num2);
		System.out.println();
		System.out.println();
		
		sub();
		System.out.println();
		System.out.println();
		try {
			mul();
		} catch (Exception e) {
			System.out.println("Exception of mul() is  Handled inside ===>main()");
		}
		System.out.println();
		System.out.println();
		

		System.out.println("\t\t\tThank you for using calculator Application...!!!");

	}

	private static void mul() throws Exception {
		System.out.println("mul() started...!!!");
		int multiplication = 0;
		System.out.println("Enter two numbers for multiplication");
		sc.nextLine();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		multiplication = num1 * num2;
		System.out.println("multiplication of " + num1 + " & " + num2 + " = " + multiplication);
		System.out.println("mul() ended...!!!");
	}

	private static void sub() {
		System.out.println("sub() started...!!!");

		int sub = 0, num1 = 0, num2 = 0;
		try {
			System.out.println("Enter two numbers for Substraction");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			sub = num1 - num2;
			System.out.println("Subtraction of " + num1 + " & " + num2 + " = " +sub);

		} catch (Exception e) {
			System.out.println("Exception handled inside ===>sub()");
			e.printStackTrace();
		} finally {

			System.out.println("sub() ended...!!!");
		}
	}

	private static void add(int num1,int num2) {
		System.out.println("add() started...!!!");
		System.out.println("Addition of " + num1 + " & " + num2 + " = " + (num1 + num2));
		System.out.println("add() ended...!!!");
	}

}
