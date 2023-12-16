package com.kn.arraysortingtechniques;

import java.util.Scanner;

public class BubbleSortingTechnique {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array=");
		int size=scan.nextInt();
		
		//Array declaration and creation
		int[] arr=new int[size];
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+(i+1)+" element = ");
			arr[i]=scan.nextInt();
		}
		
		//Traversing elements before sorting
		System.out.print("Before Sorting elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Method call for bubbleSort()
		bubbleSort(arr);
		
		//Traversing the Sorted array
		System.out.println();
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		System.out.print("Sorted elements: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//scan close
		scan.close();
	}

	//Method For sorting the array using Bubble Sorting Technique
	public static int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length-i-1;j++) {
				int temp=0;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
			if(count==0) {
				break;
			}
		}
		return arr;
	}
}
