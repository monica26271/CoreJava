package com.kp.nestedif;

import java.util.Scanner;

public class EligiblityForHonors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the GPA=");
		double gpa=scan.nextDouble();
		System.out.println("Enter the number of Course completed =");
		int credits=scan.nextInt();
		honorEligiblity(gpa,credits);
		
		scan.close();

	}

	 static void honorEligiblity(double gpa, int credits) {
		if(gpa>3.5) {
			if(credits>120) {
				System.out.println("Eligible for Honors Degree");
			}
		}
	}

}
