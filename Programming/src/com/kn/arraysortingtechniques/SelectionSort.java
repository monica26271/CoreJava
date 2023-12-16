package com.kn.arraysortingtechniques;

public class SelectionSort {
	// Method of Selection sort
	public int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int min=arr[i],index=i;

			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
					
				}
			}
			arr[index]=arr[i];
			arr[i]=min;
		}
		
	 return arr;
	}

}
