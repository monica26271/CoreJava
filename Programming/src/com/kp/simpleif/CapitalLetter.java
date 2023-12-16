package com.kp.simpleif;

import java.util.Scanner;

public class CapitalLetter {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char a=scan.next().charAt(0);
		 boolean res=Character.isUpperCase(a);
		if(res==true) {
			System.out.println("It is a capital letter");
		}
		scan.close();

	}

}
