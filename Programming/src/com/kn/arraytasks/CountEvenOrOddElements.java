package com.kn.arraytasks;

public class CountEvenOrOddElements {
	
	//Method to find the count of even or odd  elements
	public void countEvenOrOddElementsInArray(int[] arr) {
		int evenCounter=0,oddCounter=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCounter++;
			}
			else {
				oddCounter++;
			}
		}
		System.out.println("Count of even numbers in array : "+evenCounter);
		System.out.println("Count of odd numbers in array : "+oddCounter);
	}

	

}
