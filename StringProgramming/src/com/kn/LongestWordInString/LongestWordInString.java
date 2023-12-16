package com.kn.LongestWordInString;

public class LongestWordInString {
	
	//Method for finding longest word in the string
	public String longestWord(String arr) {
		String[] brr=arr.split(" ");
		
//		for(int i=0;i<brr.length;i++) {
//			System.out.println(brr[i]);
//		}
//    	String count="";
//		for(int i=0;i<brr.length;i++) {
//			
//			if(count.length()<brr[i].length()) {
//				count=brr[i];
//			}
//		return count.toString();
		StringBuffer crr=new StringBuffer(brr[0]);
		
		
		for(int i=0;i<brr.length;i++) {
			if(brr[i].length()>crr.length()) {
				crr=new StringBuffer(brr[i]);
			}
			
		}
		

		return crr.toString();
	}
}
