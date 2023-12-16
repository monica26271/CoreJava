package com.kn.arraytasks;

public class ArraySum {
	
	//Creating the behavior to find the sum of the array
	public int findingTheSumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
