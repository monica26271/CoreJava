//Write a program to calculate the power of a number

package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Base number");
		int base=scan.nextInt();
		System.out.println("Enter the exponent value");
		int exponent=scan.nextInt();
		
		int res=findPowerOfNumber(base,exponent);
		System.out.println(base+" ^ "+exponent+" = "+res);
		
		scan.close();

	}

	 static int findPowerOfNumber(int base, int exponent) {
		 int power=1;
		 
		for(int i=1;i<=exponent;i++) {
			power=power*base;
		}
		return power;
	}

}
