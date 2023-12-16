package com.kn.casechange;

import java.util.Scanner;

public class CharacterCaseChangingDemo {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		CharacterCaseChanging caseChange=new CharacterCaseChanging();
		
		System.out.println(caseChange.characterCase(s1));
		
		scan.close();
		

	}

}
