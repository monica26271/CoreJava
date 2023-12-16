package com.kn.arraysortingtechniques;

public class InsertionSort {
	
	//method to sort array
	public int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
//			for(int j=i-1;j>=0;j--) {
//				while(temp<arr[j]) {
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
			
			while(j>=0&&temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}

}

