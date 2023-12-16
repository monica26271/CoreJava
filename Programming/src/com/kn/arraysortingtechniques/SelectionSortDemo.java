package com.kn.arraysortingtechniques;

import java.util.Scanner;

public class SelectionSortDemo {

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
		System.out.println();
		System.out.println("************************");
		System.out.println();
		//object creation 
		SelectionSort selectionSort=new SelectionSort();
		
		System.out.println("Elements After sorting");
		//Method call and traversing after sorting
		for(int i:selectionSort.sort(arr)) {
			System.out.print(i+" ");
			
		}
		//scan close
		scan.close();
	}

}
