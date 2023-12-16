package com.kn.arraytasks;

import java.util.Scanner;

public class PrintSumOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		
		//Array declaration and creation
		int[] arr=new int[scan.nextInt()];
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" array elements : ");
			arr[i]=scan.nextInt();
		}
		//Creation an object for the behavior 
		ArraySum arraySum=new ArraySum();
		
		//object calling the behavior 
		System.out.println("the sum = "+arraySum.findingTheSumOfArray(arr));
		
		//scan close
		scan.close();
	}

}
