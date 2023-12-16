package com.kn.LongestWordInString;

import java.util.Scanner;

public class LongestWordInStringDemo {

	public static void main(String[] args) {
		//Input 
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String arr=scan.nextLine();
		//method call to know the longest word in the string
		LongestWordInString b=new LongestWordInString();
		System.out.println("The longest word in the string is "+b.longestWord(arr));
		
		
		//scan close
		scan.close();
	}

}
