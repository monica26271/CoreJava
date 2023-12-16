package com.leetcode.arrays;

public class AddOneToTheLastIndexElement {
 
	public static void main(String[] args) {

//		int[] digits = { 1, 2, 3 };
//		plusOne(digits);
//		for (int i = 0; i < digits.length; i++) {
//			System.out.print(digits[i] + " ");
//		
//		}
//
//	}
//	public static int[] plusOne(int[] digits) {
//		int n = 0;
//		for (int i = 0; i < digits.length; i++) {
//			n = n * 10 + digits[i];
//		}
//		n += 1;
//
//		while (n > 0) {
//			int digit;
//			for (int i = digits.length - 1; i >= 0; i--) {
//				digit = n % 10;
//				digits[i] = digit;
//				n /= 10;
//			}
//	}
//		return digits;
//		int[] arr= {0,1,2,2,3,0,4,2};
//		int value=2;
//		int [] brr=new int[arr.length];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			
//				if(arr[i]!=value) {
//					brr[j]=arr[i];
//					j++;
//				}
//		}
//		System.out.println(j);
//		for(int a:brr) {
//			System.out.print(a+" ");
//		}
		int dividend=-1,divisor=-1;
		int result=dividend/divisor;
		System.out.println(result);
		if(dividend<0&&divisor<0) {
			result*=-1;
		}
		
	}
}