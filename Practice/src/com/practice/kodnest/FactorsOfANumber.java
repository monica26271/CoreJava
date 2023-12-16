package com.practice.kodnest;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {

		System.out.println("Enter the number to find its factors:");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		findingFactors(num);
	}

	private static void findingFactors(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
