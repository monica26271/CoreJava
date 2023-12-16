package com.kp.ifelse;

import java.util.Scanner;

public class MultiplesOfFive {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		tables(num);
		scan.close();

	}

	 static void tables(int num) {
		 if(num%5==0) {
				System.out.println("Multiple of 5");
			}
			else {
				System.out.println("Not-Multiple of 5");
			}
	}

}
