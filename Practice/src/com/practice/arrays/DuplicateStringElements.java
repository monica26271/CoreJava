package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateStringElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of the array ");
//		int size=sc.nextInt();
//		String[] arr=new String[size];
//		
//		for(int i=0;i<size;i++) {
//			arr[i]=sc.next();
//		}
//		for(String i:arr) {
//			System.out.print(i+" ");
//		}
		String[] arr= {"abc","bca","aab","abc","bca","bca"};
		
		Arrays.sort(arr);
		for(String i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The duplicated strings are:");
		int counter=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					counter++;
				}
			}
			if(counter>0) {
				System.out.println(arr[i]);
			}
		}
		
		
		
	}

}
