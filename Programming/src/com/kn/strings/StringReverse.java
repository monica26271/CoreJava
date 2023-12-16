package com.kn.strings;

public class StringReverse {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy";
		
		String[] arr=s1.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
