package com.kn.arraytasks;

import java.util.Scanner;

public class CountEvenOrOddElementsDemo {

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
		
		//Object Creation of CountEvenOrOddElements
		CountEvenOrOddElements countEvenOrOddElements=new CountEvenOrOddElements();
		
		// calling CountEvenOrOddElementsInArray
		countEvenOrOddElements.countEvenOrOddElementsInArray(arr);
		
		//scan close
		scan.close();

	}

}
