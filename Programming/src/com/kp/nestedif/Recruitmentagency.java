package com.kp.nestedif;

import java.util.Scanner;

public class Recruitmentagency {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your experience");
		int year_of_experince=scan.nextInt();
		System.out.println("enter your skill Level");
		int skill_level=scan.nextInt();
		isSutableCandidate(year_of_experince,skill_level);
		scan.close();
		


	}

	 static void isSutableCandidate(int experince, int skill_level) {
		if(experince>5) {
			if(skill_level>7) {
				System.out.println("Suitable Candidate");
			}
		}
	}

}
