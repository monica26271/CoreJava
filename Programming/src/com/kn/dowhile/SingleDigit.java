package com.kn.dowhile;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		scan.close();
		singleDigit(n);
	}

	 static void singleDigit(int n) {
		
		while(n>9) {
			int newSum = 0;
			while(n>0) {
				newSum = newSum + n%10 ;
				n = n/10;
			}
			n = newSum;
		}
		System.out.println(n);

		
		
		
		/* while(n>0) {
				int r=n%10;
				n=n/10;
				sum=sum+r;
		 } 
		 System.out.println(sum);*/
	 }
}

