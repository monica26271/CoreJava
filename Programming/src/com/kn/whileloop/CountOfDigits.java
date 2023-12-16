//WAP to find the count of digits in a number

package com.kn.whileloop;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		numberOfdigit(num);
		
		scan.close();

	}

	 static void numberOfdigit(int num) {
		int counter=0,temp=num;
		
		while(num>0) {
			counter++;
			num=num/10;
		}
		System.out.println("Number of digits in the "+temp+" is "+counter);
	}

}
