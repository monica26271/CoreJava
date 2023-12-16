package com.practice.arrays;

import java.util.ArrayList;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[]= {33,2,2,1};
		ArrayList<Integer> a=new ArrayList<>();
		a=duplicate(arr);
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

	public static ArrayList<Integer> duplicate(int[] arr) {
		
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			int count=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			if(count>0) {
				a.add(arr[i]);
				
			}
			
		}
		if(a.isEmpty()) {
			a.add(-1);
		}
		return a;
	}

}
