package com.kp.swithcase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1- Coke, 2-Pepsi, 3-Water, 4-Juice, 5-Tea");
		System.out.println("what is your option?");
		int option=scan.nextInt();
		favDrink(option);
		scan.close();

	}

	static void favDrink(int option) {
		switch (option) {
		case 1: {
			System.out.println("Its a Coke");
			break;
		}
		case 2: {
			System.out.println("Its a Pepsi");
			break;
		}
		case 3: {
			System.out.println("Its a Water");
			break;
		}
		case 4: {
			System.out.println("Its a Juice");
			break;
		}
		case 5: {
			System.out.println("Its a Tea");
			break;
		}
		default:
			System.out.println("Enter the valid option to get the drink..");
		}
		
	}

}
