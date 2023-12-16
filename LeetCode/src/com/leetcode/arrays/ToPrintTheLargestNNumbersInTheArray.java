package com.leetcode.arrays;

import java.util.Scanner;

public class ToPrintTheLargestNNumbersInTheArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		System.out.println("Enter N smallest number to display : ");
		int n=scan.nextInt();	
		
				
		int[] arr=new int[size];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		
		}
		
		int[] brr=sort(arr);
		
		System.out.println("The first "+n+" Largest Number in the array : ");
		displayingNLargestNumbers(brr,n);
		
		
		scan.close();

	}

	public static void displayingNLargestNumbers(int[] arr, int n) {
		StringBuffer sb=new StringBuffer();
		int i=arr.length-1;
		while(n>0) {
			
				sb.append(arr[i]);
				System.out.println(arr[i]);
				i--;
				n--;
			
			
		}
		
	}

	public static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int counter=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					counter=1;
				}
			
		     }
			if(counter==0) {
				break;
			}
		}
		return arr;
	}
}
	

