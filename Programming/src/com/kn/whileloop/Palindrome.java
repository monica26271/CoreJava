package com.kn.whileloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number To check whether it is palindrome or not");
		int num=scan.nextInt();
		isPalindrome(num);
		
		scan.close();

	}

	 static void isPalindrome(int num) {
		int digit,num1=num,sum=0;
		while(num>0) {
			digit=num%10;
			//System.out.print(digit);
			sum=sum*10+digit;
			num=num/10;
			
		}
		System.out.println();
	    if(num1==sum) {
			System.out.println(num1+" is a Palindrome");
		}else {
			System.out.println(num1+" is not a Palindrome");
		}
	}

}
