package com.kp.simpleif;

import java.util.Scanner;

public class BonusEligiblity {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Years of service");
		int service=scan.nextInt();
		System.out.println("enter the Monthly target reached");
		int target=scan.nextInt();
		bonusEligible(service,target);
		
		scan.close();

	}

	 static void bonusEligible(int service, int target) {
		if(service>3 && target>6) {
			System.out.println("Bonus Eligible");
		}
	}

}
