package com.kn.strings;

public class StringComparision1 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3=s1+s2;
		String s4=s1+s2;
		
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
