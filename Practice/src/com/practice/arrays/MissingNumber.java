package com.practice.arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr= {1,3,4,5};
		int k=1;
		int count=0,miss=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<=arr.length;j++) {
				
				if(arr[i]==k) {
					count=1;
					
				}
			}
			if(count==0) {
				
				miss=k;
				break;
			}
		}
		System.out.println(miss);
	}

}
