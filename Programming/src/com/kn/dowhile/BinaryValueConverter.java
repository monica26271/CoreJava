package com.kn.dowhile;

import java.util.Scanner;

public class BinaryValueConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		decimalToBinary(num);
		
		
		scan.close();

	}

	 static void decimalToBinary(int num) {
		int binary=0,pvalue=1;
		
		while(num>0) {
			int r=num%2;
			binary+=pvalue*r;
			pvalue*=10;
			num=num/2;
		}
		System.out.print(binary);
		
	
  }
	 

}
