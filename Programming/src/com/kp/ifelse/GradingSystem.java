package com.kp.ifelse;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		System.out.println("Enter the Cgpa = ");
		Scanner scan =new Scanner(System.in);
		double marks=scan.nextDouble();
		
		grade(marks);
		
		scan.close();

	}

	private static void grade(double marks) {
		if(marks>=90) {
			System.out.println("Your Grade is A");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("Your Grade is B");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("Your Grade is C");
		}
		else if(marks>=45 && marks<60) {
			System.out.println("Your Grade is D");
		}
		else if(marks>=35 && marks<40) {
			System.out.println("Your Grade is E");
		}
		else if(marks<35) {
			System.out.println("Better Luck next time");
		}
	}

}
