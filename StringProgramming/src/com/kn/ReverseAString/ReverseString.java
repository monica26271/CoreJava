 package com.kn.ReverseAString;

public class ReverseString {

	public void stringReversing(String input) {
		char[] arr=input.toCharArray();
		
		char[] brr=new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==32) {
				brr[i]=(int)32;
			}
			
		}
		int j=brr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(brr[j]==' ') {
					j--;
				}
				brr[j]=arr[i];
				j--;
			}
			
		}

		for(char c:brr) {
			System.out.print(c);
		}
		
		
	}

}
