// Write a program to print a given number table.

package com.kn.forloop;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find its tables");
		int num=scan.nextInt();
		findTables(num);
		scan.close();
		

	}

	 static void findTables(int num) {
		
		for(int i=0;i<=10;i++) {
			int mul=num*i;
			System.out.println(num+" * "+i+"="+mul);
		}
		
	}

}
