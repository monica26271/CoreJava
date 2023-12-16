package com.kn.arrays;

import java.util.Scanner;

public class CarBrands {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		
		// Array Declaration and creation
		System.out.println("Enter the types of Brands");
		int size=scan.nextInt();
		String[][] arr=new String[size][];
		String[] brr=new String[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the name of "+(i+1)+" Car brand:");
			brr[i]=scan.next();
		}
		for(int i=0;i<brr.length;i++) {
				System.out.println("Enter the Number of car Models available in "+brr[i]+" :");
				arr[i]=new String[scan.nextInt()];
		}
		// Array Initialization
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter Name of the "+arr[i].length+" Models available in "+brr[i]);
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scan.next();
			}
		}
		// Array Traversing
		for(int i=0;i<brr.length;i++) {
			System.out.println("========== "+brr[i]+" Models =========");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print((j+1)+".");
				System.out.println(arr[i][j]);
				
			}
		}
		scan.close();
	}

}
