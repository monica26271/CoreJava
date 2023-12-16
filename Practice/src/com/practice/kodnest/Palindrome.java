package com.practice.kodnest;

public class Palindrome {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] arr= {"bab","sad","mad","sas","malayalam"};
			for(int i=0;i<arr.length;i++) {
				boolean isPalindrome=palidrome(arr[i]);
				if(isPalindrome) {
					System.out.println(arr[i]+" at index "+i);
				}
			}
			
		}

		private static boolean palidrome(String arr) {
			 boolean isPalindrome=false;
			 char[] brr=arr.toCharArray();
			for(int i=0;i<brr.length;i++) {
				if(brr[i]!=(brr[brr.length-1-i])) {
					isPalindrome=false;
					break;
					
				}else {
					isPalindrome=true;
				}
			}
			return isPalindrome;
		}


}
