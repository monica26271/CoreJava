package com.kn.whileloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the digits to find its sum");
		int num=scan.nextInt();
		int sum=sumOfDigits(num);
		System.out.println("The sum of "+num+" = "+sum);
		
		
		scan.close();

	}

	 static int sumOfDigits(int num) {
		 int digit,sum=0;
		 while(num>0) {
			 digit=num%10;
			 sum=sum+digit;
			 num=num/10;
		 }
		return sum;
	}

	

}
