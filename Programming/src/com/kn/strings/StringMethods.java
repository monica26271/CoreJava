package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1="Raja Ram Mohan Roy";
		
		System.out.println("To convert a string data into Upper Case: ");
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		System.out.println("To convert a string data into Lower Case: ");
		System.out.println(s1.toLowerCase());
		System.out.println();
		
		System.out.println("Returns the charater at specific index: ");
		System.out.println(s1.charAt(5));
		System.out.println();
		
		System.out.println("It joins the two Strings: ");
		System.out.println(s1.concat(s1));
		System.out.println();
		
		System.out.println("Returns true if specifed string found else false: ");
		System.out.println(s1.contains("Nandish"));
		System.out.println();
		
		System.out.println("Returns index value for first occurance of specified character: ");
		System.out.println(s1.indexOf('a'));
		System.out.println();
		
		System.out.println("Returns index value for last occurance of specified character: ");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println();
		
		System.out.println("Returns String starting from Specified index: ");
		System.out.println(s1.substring(7));
		System.out.println();
		
		System.out.println("Returns String starting from begining index till ending index(excluded) : ");
		System.out.println(s1.substring(7, 16));
		System.out.println();		
	} 
}
