package com.kn.strings;

public class StringCharacterReversing {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy";
		
		char[] arr=s1.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
