package com.kn.strings;

public class StringComparison4 {

	public static void main(String[] args) {
		String s1="Ram";
		//Here the address of s1 is storing into the s2 soo references will be same
		String s2=s1;
		if(s1==s2) {
			System.out.println("the reference of the object is same");
		}
		else {
			System.out.println("The reference of the objects is different");
		}
		if(s1.equals(s2)) {
			System.out.println("The data in the objects are Equal");
		}else {
			System.out.println("The data in the objects are Unequal");
		}


	}

}
