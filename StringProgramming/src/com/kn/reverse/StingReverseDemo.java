package com.kn.reverse;

import java.util.Scanner;

public class StingReverseDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		
		
		StringReverse sr=new StringReverse();
		String output=sr.reverse(inputString);
		System.out.println(output);
		
	
		
		

	}

	

}
