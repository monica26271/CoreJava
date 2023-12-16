package com.kn.arrays;

import java.util.Scanner;

public class PositiveNumberCountInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//array decleration and creation
		System.out.println("Enter the size of the array");
		int[] arr=new int[scan.nextInt()];
		// array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the "+(i+1)+" number = ");
			arr[i]=scan.nextInt();
		}
		
		//Method creation
		int count=positiveNumbersInArray(arr);
		System.out.println("Total positive numbers in array = "+count);
		scan.close();

	}
	// method to find the total number of positive numbers in array

	public static int positiveNumbersInArray(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				count++;
			}
		}
		return count;
	}

}
