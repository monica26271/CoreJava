package com.kn.dowhile;

import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the divisor");
		int divisor=scan.nextInt();
		System.out.println("Enter the Range");
		int range=scan.nextInt();
		int j=isDivide(range,divisor);
		System.out.println(j);
		scan.close();

	}

	 static int isDivide(int range, int divisor) {
		int i=0,sum=0;
		 do {
			 for(int j=0;j<=range;j++) {
				 if(j%divisor==0) {
					sum+=j;
				 }
				 i++;
			 }
			 
		 }while(i<range);
		 return sum;
	}

	 

}
