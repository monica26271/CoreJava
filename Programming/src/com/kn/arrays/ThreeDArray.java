package com.kn.arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//Array Declaration
		int[][][] arr;
		
		//Array Creation
		arr=new int[4][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("For 2d array index"+i);
			arr[i]=new int[scan.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.println("For 3d array index"+j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		//Array Initialization
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		// Array Traversing
		System.out.println("*********************************");
		for(int l=0;l<4;l++) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println(arr[i][j][k]);
					}
				}
		}
	}
	scan.close();	
}
}
