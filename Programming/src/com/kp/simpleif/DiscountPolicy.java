package com.kp.simpleif;

import java.util.Scanner;

public class DiscountPolicy {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total amount:");
		int a=scan.nextInt();
		discount(a);
		scan.close();

	}

	private static void discount(int a) {
		// TODO Auto-generated method stub
		if(a>200) {
			System.out.println("Discount of 20% applicable");
		}
	}
	

}
