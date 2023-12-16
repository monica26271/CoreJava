package com.practice.kodnest;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		String a="dac";
		String b="bad";
		
		char[] arr=a.toCharArray();
		char[]  brr=b.toCharArray();
		sort(arr);
		for(char i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		sort(brr);
		for(char i:brr) {
			System.out.print(i+" ");
		}
		System.out.println();
		if(isAnagram(arr,brr)) {
			System.out.println("is anaram");
			
		}else {
			System.out.println("Not anagram");
		}
		


	}

	private static boolean isAnagram(char[] arr, char[] brr) {
		boolean isAnagram=false;
		if(arr.length==brr.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==brr[i]) {
					isAnagram=true;
				}
				else {
					isAnagram=false;
					break;
				}
			}
		}
		return isAnagram;
	}

	private static void sort(char[] brr) {
		Arrays.sort(brr);
	
	}
	

}
