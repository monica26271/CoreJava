	//Write a program to print the Fibonacci series up to n terms.


package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the range of the number to find the Series");
		int range=scan.nextInt();
		findSeries(range);
		
		scan.close();

	}

	 static void findSeries(int range) {
		int firstNumber=0,secondNumber=1;
		System.out.println(firstNumber+" "+secondNumber);
		int nextNumber=0;
		for(int i=0;i<=range;i++) {
			nextNumber=firstNumber+secondNumber;
			System.out.println(nextNumber);
			firstNumber=secondNumber;
			secondNumber=nextNumber;
		}
		
	}

}
