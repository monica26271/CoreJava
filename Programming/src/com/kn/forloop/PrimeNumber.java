//Write a program to print the first n prime numbers
package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		boolean n=isprime(num);
		if(n==true) {
			System.out.println("is prime");
		}
		else {
			System.out.println("is not prime");
		}
	     isprime1(num);
		isprime2(num);
	
	
		
		scan.close();

	}

	private static void isprime2(int num) {
		boolean isprime=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
				
				break;
			}
		}
		if(isprime==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

	  static void isprime1(int num) {
		 int counter=0;
		 
		 for(int i=2;i<=num;i++) {
			 
				if(num%i==0) {
					counter++;
				}}
				if(counter==1) {
					System.out.println("It is a Prime number");
				}
				else {
					System.out.println("it is not a prime number");
				}
	
	  }

	 static boolean isprime(int num) {
		  boolean prime=true;
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 prime=false;
				 break;
			 }
		 }
		return prime;
	}

}

