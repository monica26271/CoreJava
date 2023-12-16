package com.kn.fristNonRepeatingCharacter;

import java.util.Scanner;

public class FirstNonRepeatingCharacterDemo {

	public static void main(String[] args) {
		
		//Taking input string from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=scan.nextLine();
		
		//object creation 
		FirstNonRepeatingCharacter nonReapt=new FirstNonRepeatingCharacter();
		
		//calling repeat() method through object
		nonReapt.repeat(input);

	}

}
