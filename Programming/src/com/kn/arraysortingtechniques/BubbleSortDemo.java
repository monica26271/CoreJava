package com.kn.arraysortingtechniques;

public class BubbleSortDemo {

	public static void main(String[] args) {
		//Array creation and intialization
		int arr[]= {48,32,64,9,17,96,5};
		
		System.out.println("Array before sorting:");
		
		//traversing before sorting
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//object creation
		BubbleSort bubbleSort=new BubbleSort();
		
		//method calling using object
		int[] brr=bubbleSort.sort(arr);
		
		System.out.println(" ");
		System.out.println("Array before sorting:");
		//traversing the sorted array
		
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}

	}

}
