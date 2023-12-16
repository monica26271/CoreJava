package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the digit");
		int num=scan.nextInt();
		isProduct(num);
		scan.close();

	}

	 static void isProduct(int num) {
		int digit,product=1,temp=num;
		while(num>0) {
			digit=num%10;
			product*=digit;
			num=num/10;
		}
		System.out.println("product of "+temp+" = " +product);
	}

}
