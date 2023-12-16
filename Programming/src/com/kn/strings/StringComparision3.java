package com.kn.strings;

public class StringComparision3 {

	public static void main(String[] args) {
//		String s1="Ram";
//		String s2="Sita";
		String s3="Ram"+"Sita";
		String s4="Ram"+"Sita";
		//s3 and s4  are created within 
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
