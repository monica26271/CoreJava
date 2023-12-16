package com.kn.arraytasks;

import java.util.Scanner;

public class MergeArrayDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Array declaration and creation 
		System.out.println("Enter the size of array 1");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter the size of array 2");
		int[] brr=new int[scan.nextInt()];
		int[] crr=new int[arr.length+brr.length];
		
		//Array initialization for array 1
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the"+(i+1)+"array elements");
			arr[i]=scan.nextInt();
		}
		//Array initialization for array 2
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter the "+(i+1)+"array elements");
			brr[i]=scan.nextInt();
		}
				
//		//Objects creation 
//		MergeArrays margeArrays=new MergeArrays();
//		
//		//calling behavior
//		margeArrays.mergeArray(arr, brr, crr);
//		for(int i=0;i<crr.length;i++) {
//			System.out.println(crr[i]);
//		}		
		
		mergeTwoArrays(arr,brr,crr);
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
		}	
		
		//scan close
		scan.close();
	}

	public static int[] mergeTwoArrays(int[] arr, int[] brr, int[] crr) {
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			crr[arr.length+i]=brr[i];
		}
		return crr;
		
	}

}
