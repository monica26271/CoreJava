package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		numberSeries(n);
		
		scan.close();

	}

	 static void numberSeries(int n) {
		double sum=0.0,i=1;
		while(i<=n) {
			sum=sum+(1/i);
			//sum+=i*i;
			i++;
		}
		System.out.println(sum);
	}

}
