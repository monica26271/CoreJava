package com.kn.strings;

public class StringComparision {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Ram";
//		String s1=new String("Ram");
//		String s2=new String("Ram");
		
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
