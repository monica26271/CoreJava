
//Write a program to calculate the factorial of a given number.

package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find the factorial");
		int num=scan.nextInt();
		int res= findFactorial(num);
		System.out.println("Factorial of "+num+" is "+res);
		
		scan.close();
		

	}

	 static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {        //1*2*3*4*5
			fact*=i;
		}
		return fact;
		
	}

}
