package com.kn.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String s1="Raja Ram Mohan Roy";
		String s2="               Raja Ram Mohan Roy              ";
		String s3="Monica Nandish Nakunji";
		//length() it gives length of the string
		System.out.println("Returns the length of the String: ");
		System.out.println(s1.length());
		System.out.println();
		
		//startsWith() checks the given input and string starting is matching (it is case sensitive)
		System.out.println("Returns true when the string starting matches with given input: ");
		System.out.println(s1.startsWith("Ra"));
		System.out.println();
		
		//endsWith() checks the given input and string ending is matching (it is case sensitive)
		System.out.println("Returns true when the string ending matches with given input: ");
		System.out.println(s1.endsWith(" Roy"));
		System.out.println();
		
		//toCharArray() converts the string into a character Array 
		System.out.println("Returns the character Array: ");
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		//trim() it trims off the unwanted spaces in the array at the beginning and at the end of the string
		System.out.println("Returns string that doesnt cointain spaces at begining and at the end: ");
		System.out.println(s2.trim());
		System.out.println();
		
		//split() it splits the strings using the delimiter or regex or any Characters and store the splited strings in the String array 
		System.out.println("It splits the string based on Delimiter or regexor any Characters and Returns the String Array : ");
		String[] brr=s1.split(" ");
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}
		System.out.println();
		
		//replace() it replaces the character with given new characters(here parameter is char)
		System.out.println("It replaces the characters with the new character given: ");
		System.out.println(s1.replace('a','b'));
		System.out.println();
		
		//replace() it replaces the character Sequence with given new characters Sequence(here parameter is charSequence)
		System.out.println("It replaces the characters Sequence with the new character Sequence given: ");
		System.out.println(s1.replace(s2, s3));
		System.out.println();
		
		
		//replaceAll()          
		System.out.println("It replaces the characters Sequence with the new character Sequence given: ");
		s1=s1.replaceAll("a","s"); 
		System.out.println(s1);
		System.out.println(); 
		
		 
		

	}

}
