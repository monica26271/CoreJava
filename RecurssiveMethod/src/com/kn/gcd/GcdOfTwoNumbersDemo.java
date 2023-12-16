package com.kn.gcd;

import java.util.Scanner;

public class GcdOfTwoNumbersDemo {

	public static void main(String[] args) {
		
		//input 
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2=scan.nextInt();
		//object creation
		GcdOfTwoNumbers gcdOfTwoNumbers=new GcdOfTwoNumbers();
		//calling findGcd method using object
		int result=gcdOfTwoNumbers.findGcd(num1,num2);
		//printing the result
		System.out.println("GCD of "+num1+" & "+num2+" = "+result);
		//Releasing the resource
		scan.close();
		

	}

}
