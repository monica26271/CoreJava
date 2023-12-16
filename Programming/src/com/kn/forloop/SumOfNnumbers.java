//WAP to calculate the sum of first n natural numbers
package com.kn.forloop;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		sumOfNNumbers(n);
		
		scan.close();

	}

	 static void sumOfNNumbers(int n) {
		 int sum=0;
		for(int i=0;i<=n;i++) {
			 sum+=i;
		
		}
		 System.out.println("the sum of first "+n+" natural numbers is "+sum);
	}

}
