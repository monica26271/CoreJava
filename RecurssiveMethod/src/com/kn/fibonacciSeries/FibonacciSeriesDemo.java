package com.kn.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		
		FibonacciSeries fibonacciSeries=new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(0, 1, n);
		
		scan.close();
	}
}
