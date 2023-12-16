package com.kp.nestedif;

import java.util.Scanner;

public class DrivingLiscenseEligiblity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("Enter your Eyesight Score");
		int eyesight_score=scan.nextInt();
		drivingEligiblity(age,eyesight_score);
		scan.close();

	}

	 static void drivingEligiblity(int age, int eyesight_score) {
		// TODO Auto-generated method stub
		 if(age>=18) {
			 if(eyesight_score>=6) {
				 System.out.println("Driving License Eligible");
			 }
		 }
		
	}

}
