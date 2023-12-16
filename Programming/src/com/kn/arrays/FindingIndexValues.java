package com.kn.arrays;

import java.util.Scanner;

public class FindingIndexValues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+" data ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element to find its index");
		int num=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(num+" present at the index "+i);
//				break;
			}
		}
		
		scan.close();

	}

}
