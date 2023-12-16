package com.kn.arrays;

import java.util.Scanner;

public class TwoDArrayAddition {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=scan.nextInt();
		System.out.println("Enter the size of the 2D array :");
		int subArraySize=scan.nextInt();
		
		// Array Declaration and Creation
		int[][] arr=new int[size][subArraySize];
		int[][] brr=new int[size][subArraySize];
		
		
		//Array Initialization
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for array"+(i+1));
			for(int j=0;j<arr.length||j<brr.length;j++) {
				System.out.println("Enter the elements for subarray"+(j+1));
				for(int k=0;k<arr[j].length||k<brr[i].length;k++) {
					if(i==0) {
						arr[j][k]=scan.nextInt();
					}
					else {
						brr[j][k]=scan.nextInt();
					}
				}
			}
		}
		// Array Traversing
		for(int i=0;i<size;i++) {
			System.out.println("The elements in array"+(i+1));
			for(int j=0;j<arr.length||j<brr.length;j++) {
				for(int k=0;k<arr[j].length||k<brr[i].length;k++) {
					if(i==0) {
						System.out.println(arr[j][k]);
					}
					else {
						System.out.println(brr[j][k]);
					}
				}
			}
		}
		//Addition Method call
		additionOfTwoDArray(arr,brr);
		scan.close();
		}
	
	// Method to add the elements in the array
	public static void additionOfTwoDArray(int[][] arr, int[][] brr) {
		int [][] crr=new int[arr.length][arr[0].length];
		System.out.println("=============> Sum Of two Arrays <==============");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Sum Of SubArray "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}
	}

