package com.kn.arraysortingtechniques;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scan.nextInt();
		
		//array declaration and creation
		int [] arr= new int[size]; 
		
		//array initialization
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Elements before sorting");
		//traversing before sorting
		for(int i:arr) {
			System.out.print(i+" ");
		}
		 
		//object creation
		InsertionSort insertionSort=new InsertionSort();
		System.out.println();
		System.out.println("**********************");
		//traversing the elements after sorting
		System.out.println("Elements after sorting");
		for(int i:insertionSort.sort(arr)) {
			System.out.print(i+" ");
		}
		//scan close
		scan.close();
	}

}
