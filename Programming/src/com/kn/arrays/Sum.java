package com.kn.arrays;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		Scanner scan=new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data");
			arr[i]=scan.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		System.out.println("Sum ="+sum);
		scan.close();

	}

}
