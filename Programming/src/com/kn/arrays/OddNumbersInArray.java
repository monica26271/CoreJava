package com.kn.arrays;

import java.util.Scanner;

public class OddNumbersInArray {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		Scanner scan=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data");
			arr[i]=scan.nextInt();
			
		}int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]+" is Odd");
				count++;
		}
			
	}
		System.out.println("Total Odd numbers in array is "+count);
		scan.close();

	}

}
