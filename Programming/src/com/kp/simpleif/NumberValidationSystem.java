package com.kp.simpleif;

import java.util.Scanner;

public class NumberValidationSystem {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Data to be validated");
		int n=scan.nextInt();
		validate(n);
		
		scan.close();


	}

	 static void validate(int n) {
		 if(n>0) {
				System.out.println(" positive number-processing");
			}
	}

}
