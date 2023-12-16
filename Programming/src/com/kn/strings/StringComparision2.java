package com.kn.strings;

public class StringComparision2 {

	public static void main(String[] args) {
		String s1="Ram";
		
		String s3=s1+"Sita";
		String s4=s1+"Sita";
		
		if(s3==s4) {
			System.out.println("References are same");
		}else {
			System.out.println("References are different");
		}
		if(s3.equals(s4)) {
			System.out.println("String data is equal");
		}else {
			System.out.println("String data is Unequal");
		}

	}

}
