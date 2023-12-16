package com.kn.fibonacciSeries;

public class FibonacciSeries {
	public int printFibonacciSeries(int a,int b,int n) {
		if(n==0) {
			return 0;
		}
		else {
			System.out.print(a+" ");
			return printFibonacciSeries(b, a+b, n-1);
		}
	}

}
