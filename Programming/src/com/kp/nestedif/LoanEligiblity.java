package com.kp.nestedif;

import java.util.Scanner;

public class LoanEligiblity {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("Enter your Salary");
		int salary=scan.nextInt();
		loanEligiblity(age,salary);
		scan.close();

	}

	 static void loanEligiblity(int age, int salary) {
		if(age>=18) {
			if(salary>40000) {
				System.out.println("Loan Approved");
			}
		}
		
	}

}
