//Write a program to find the GCD of two numbers.

package com.kn.forloop;

import java.util.Scanner;

public class GcdOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int gcd=findGcd(num1,num2);
		System.out.println("GCD of "+num1+","+num2+" is "+gcd);
		
		scan.close();

	}

	 static int findGcd(int num1, int num2) {
		 int gcd=1;
//		 int range=Math.min(num1, num2);
//		 for(int i=2;i<=range;i++) {
//			 if(num1%i==0&&num2%i==0) {
//				 gcd=i;
//				 
//			 }
//			
//		 }
		 
		 for(int i=1;i<=num1&&i<=num2;i++) {
			 if(num1%i==0&&num2%i==0) {
				 gcd=i;
			 }
		 }
		 return gcd;
	}
}
