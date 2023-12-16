package com.kn.arrays;

import java.util.Scanner;

public class OddAndEvenNumbersInArray {

	public static void main(String[] args) {
		//decleration and creation
		int[] arr=new int[5];
		//arr= {10,20,30,40,50};
		Scanner scan=new Scanner(System.in);
		//initialization of array
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" data = ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is even"); 
			}
			else {
				System.out.println(arr[i]+" is odd");
			}
		}
		scan.close();

	}

}
