package com.kn.whileloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number whinch need to be reversed");
		int num=scan.nextInt();
		int reverse=isReverse(num);
		System.out.println("Reverse of "+num+" is "+reverse);
		scan.close();

	}

	 static int isReverse(int num) {
		int digit,sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		return sum;
	}

}
