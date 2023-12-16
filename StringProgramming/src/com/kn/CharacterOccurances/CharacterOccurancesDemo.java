package com.kn.CharacterOccurances;

import java.util.Scanner;

public class CharacterOccurancesDemo {

	public static void main(String[] args) {
		//Input 
		System.out.println("Enter the string: ");
		Scanner scan=new Scanner(System.in);
		String inputString=scan.next();
		
		//object creation 
		CharacterOccurance characterOccurance=new CharacterOccurance();
		
		characterOccurance.characterOccuranceInAString(inputString);
		

	}

}
