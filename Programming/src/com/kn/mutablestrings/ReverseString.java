package com.kn.mutablestrings;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer s2=new StringBuffer();
		String s1="Monica";
		System.out.println("the reversed string is :"+reverse(s1,s2));
		

	}

	public static String reverse(String s1, StringBuffer s2) {
		for(int i=s1.length()-1;i>=0;i--) {
			s2.append(s1.charAt(i));
		}
		return s2.toString();
	}
}
