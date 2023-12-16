package com.kn.romannumbers;

import java.util.Scanner;

public class RomanNumbersDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		
		RomanNumbers romanNumbers=new RomanNumbers();
		System.out.println(romanNumbers.findingRomanNumbers(number));

	}

}
