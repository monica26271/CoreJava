package com.kp.elseif;

import java.util.Scanner;

public class AgeCatogrizer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agecat();	

	}
	static void agecat() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>0 &&age<=12) {
			System.out.println("child");
		}
		else if(age==13&&age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20&&age<=59) {
			System.out.println("Adult");
		}
		else if(age>=60) {
			System.out.println("Senior Citizen");
		}
		scan.close();
	}


}
