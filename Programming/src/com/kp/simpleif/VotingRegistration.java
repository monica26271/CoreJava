package com.kp.simpleif;

import java.util.Scanner;

public class VotingRegistration {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		votingEligiblity(age);
		
		scan.close();

	}

	 static void votingEligiblity(int age) {
		if(age>=18) {
			System.out.println("Voter registration eligible");
		}
		
	}

}
