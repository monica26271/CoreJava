package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of 1D array");
		int size=scan.nextInt();
		
		// array declaration and creation
		int[][] arr=new int[size][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter number of values in "+(i+1)+" array");
			arr[i]=new int[scan.nextInt()];
		}
		
		//array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("========> Array "+(i+1)+" <========");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter "+(j+1)+" element");
				arr[i][j]=scan.nextInt();
			}
		}
		// array traversing
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}

}
