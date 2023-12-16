package com.kn.arraytasks;

public class MergeArrays {
	
	//method to merge array
	public int[] mergeArray(int[] arr,int[] brr,int[] crr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];	
		}
		for(int i=arr.length;i<crr.length;i++) {
			crr[i]=brr[j];
			j++;
		}
	 return crr;
	}

}
