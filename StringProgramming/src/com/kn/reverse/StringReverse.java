package com.kn.reverse;

public class StringReverse {
	public String reverse(String inputString) {
		StringBuffer crr=new StringBuffer();
		
		char[] arr=inputString.toCharArray();
		
		
		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}
		
		for(int i=arr.length-1;i>=0;i--) {
			crr.append(arr[i]);
		}
		
		return crr.toString();
	}

}
