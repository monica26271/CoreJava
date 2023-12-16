package com.kn.arrays;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=scan.nextInt();
		// Array declaration and creation
		int[] arr=new int[size];
		int[] brr=new int[size];
		int[] crr=new int[size];
		
		// Array Initialization
		for(int i=0;i<2;i++) {
			System.out.println("Enter the elements for "+(i+1)+" array :");
			for(int j=0;j<size;j++) {
				System.out.println("Element "+(j+1)+" :");
				if(i==0) {
					arr[j]=scan.nextInt();
				}
				else {
					brr[j]=scan.nextInt();
				}
			}
			
		}
		//Array Traversing
		for(int i=0;i<2;i++) {
			System.out.println("The elements in "+(i+1)+" array :");
			for(int j=0;j<size;j++) {
				if(i==0) {
					System.out.println(arr[j]);
				}
				else {
					System.out.println(brr[j]);
				}
				
			}
		}
		//Method call
		mul(arr,brr,crr,size);
		scan.close();
	}
	//Method created to do array multiplication
	 static void mul(int[] arr, int[] brr, int[] crr, int size) {
		  System.out.print("Multiplication of two Arrays = ");
			 for(int i=0;i<size;i++) {
				 crr[i]=arr[i]*brr[i];
				 int j=crr[i];
				 crr[i]=0;
				 System.out.print(j);
				 if(i<size-1) {
					 System.out.print(",");
				 }
				 else {
					 System.out.print(".");
				 }
			 }
		 
		
	}
	 

}
