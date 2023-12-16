package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemoUsingStrings {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter the size=");
		//array declaration and creation
		String[] arr;
		arr=new String[scan.nextInt()];
		//array initalization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data =");
			arr[i]=scan.next();
		}
		//Array traversing
		System.out.println("Entered  data =");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		//Array traversing backwards
		System.out.println("Entered  data in reverse order =");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}

