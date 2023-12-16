package com.kn.exceptionhandling1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping Application");
		shop();
		System.out.println("***********main()ended*************");

	}

	public static void shop() {
		System.out.println("----> shop() started ");
		try {
			pay();
		}catch(InputMismatchException ime) {
			System.out.println("Shopping is failed due to the inappropriate input !");
		}
		System.out.println("****************** shop()ended**************** ");
	}
	//throw==>show warning to the method caller
	public static void pay()throws InputMismatchException {
		System.out.println("---> pay() started ");
		Scanner scan=null;
		try {
			System.out.println("Enter the amount");
			scan=new Scanner(System.in);
			double amount=scan.nextDouble();
			System.out.println("Amount paid = "+amount);
		}catch(InputMismatchException ime) {
			System.out.println("Exception handled");
			//re-throw exception
			throw ime;
		}
		scan.close();
		System.out.println("*************pay() ended******************");
	}

}
