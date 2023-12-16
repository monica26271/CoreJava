package com.kn.forloop;

import java.util.Scanner;

public class FiveCrossFivePattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		pattern(n);
		scan.close();

	}

	 static void pattern(int n) {
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 System.out.print("*");
			 }
			 System.out.println(" ");
		 }
		
	}

}
