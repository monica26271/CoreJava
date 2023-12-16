package com.kn.dowhile;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		double avg=average();
		System.out.println("Average"+avg);

	}

	 static double average() {
		 double sum=0.0;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=scan.nextInt();
		 for(int i=1;i<=n;i++) {
			 System.out.println("Enter the "+i+" number to find average");
			 int j=scan.nextInt();
			 sum+=j;
		 }
		 sum/=n;
		 scan.close();
		return sum;
	}

}
