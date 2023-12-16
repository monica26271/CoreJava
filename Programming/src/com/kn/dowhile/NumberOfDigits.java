//WAP to find number of digits in a given number

package com.kn.dowhile;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		findNumberOfDigits(num);
		scan.close();
	}
	 static void findNumberOfDigits(int num) {
		int counter=0,digit;
		do {
			digit=num%10;
			counter++;
			num/=10;
		}while(num>0);
		System.out.println(counter);
	}
}
