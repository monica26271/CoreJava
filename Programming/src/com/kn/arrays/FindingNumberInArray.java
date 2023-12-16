package com.kn.arrays;

import java.util.Scanner;

public class FindingNumberInArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size=");
		//array declaration and creation
		int[] arr;
		arr=new int[scan.nextInt()];
		//array initalization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data =");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number to find the given number is in array or not");
		int num=scan.nextInt();
		
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(arr[i]+" number is at the "+i+" index");
					break;
			    }
//			else {
//		        System.out.println(num+" is not present in the array");
//			}
		}
		scan.close();
	}
}
