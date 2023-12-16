package com.kn.arraytasks;

import java.util.Scanner;

public class ThreeArrayMerging {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Array declaration and creation 
		System.out.println("Enter the size of array 1");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter the size of array 2");
		int[] brr=new int[scan.nextInt()];
		System.out.println("Enter the size of array 3");
		int[] crr=new int[scan.nextInt()];
		int[] drr=new int[arr.length+brr.length+crr.length];
		
		
		//Array initialization for array 1
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements");
			arr[i]=scan.nextInt();
		}
		//Array initialization for array 2
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements");
			brr[i]=scan.nextInt();
		}
		for(int i=0;i<crr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements");
			crr[i]=scan.nextInt();
		}
		//function call mergingArrays()
		 mergingArrays(arr,brr,crr,drr);
		 for(int i=0;i<drr.length;i++) {
			 System.out.println(drr[i]);
		 }
		//scan close
		scan.close();
	}
	// Method created to merge 3 Arrays
	public static int[]  mergingArrays(int[] arr, int[] brr, int[] crr,int[] drr) {
//		int j=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			drr[i]=arr[i];
//		}
//		for(int i=arr.length;i<(arr.length+brr.length);i++) {
//			
//			drr[i]=brr[j];
//			j++;
//		}
//		j=0;
//		for(int i=arr.length+brr.length;i<drr.length;i++) {
//			drr[i]=crr[j];
//			j++;
//		}
		
		for(int i=0;i<arr.length;i++) {
			drr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			drr[arr.length+i]=brr[i];
		}
		for(int i=0;i<crr.length;i++) {
			drr[(arr.length+brr.length)+i]=crr[i];
		}
	return drr ;
	}
	
}
