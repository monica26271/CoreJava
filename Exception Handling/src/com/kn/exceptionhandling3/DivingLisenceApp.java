package com.kn.exceptionhandling3;

import java.util.Scanner;

public class DivingLisenceApp {

	public static void main(String[] args) {
		System.out.println("===========>Welcome to Diving Lisence Application<=============");
		System.out.println();
		try {
			eligiblityToDivingLisence();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("===========>Thank You for Using Diving Lisence Application<===========");
		}

	}

	private static void eligiblityToDivingLisence() throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=scan.nextInt();
	
		if(age>18&&age<65) {
			System.out.println("Congrats!! Your Eligible to get Driving lisence");
		}else if(age<18) {
			throw new UnderAgeException("Sorry! Your Underaged to get Driving lisence");
		}else {
			throw new OverAgeException("Sorry! Your OverAged to get Driving lisence");
		}
		
	}

}
