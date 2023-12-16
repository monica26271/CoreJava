package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr;
		
		Scanner scan=new Scanner(System.in);
		arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data");
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Entered Data =");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
