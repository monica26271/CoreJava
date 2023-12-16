package com.kn.CountOfVowelsConsonentsAndSpecialCharactersInString;

import java.util.Scanner;

public class CountOfVowelsConsonentsAndSpecialCharactersInStringDemo {
 
	public static void main(String[] args) {
		//input 
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String inputString=scan.nextLine();
		//object creation 
		CountOfVowelsConsonentsAndSpecialCharactersInString countOfCharacter=new CountOfVowelsConsonentsAndSpecialCharactersInString();
		countOfCharacter.sortingTheCharacter(inputString);
		
		//Releasing the resources
		scan.close();
	}

}
