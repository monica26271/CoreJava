package com.kn.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Input Digit");
		int input=scan.nextInt();
		System.out.println("Enter the Armstrong number ");
		int n=scan.nextInt();
		isArmstrongNumber(input,n);
		
		scan.close();

	}

	 static void isArmstrongNumber(int input, int n) {
		int digit,sum=1,value=0,temp=input;
		while(input>0) {
			digit=input%10;
			for(int i=1;i<=n;i++) {
				sum*=digit;
			}
			int store=sum;
			sum=1;
			value=store+value;
			input=input/10;
		}
		
		if(value==temp) {
			System.out.println("It is a Armstrong number");
		}
		else {
			System.out.println("It is not a Armstrong number");
		}
	}

}
