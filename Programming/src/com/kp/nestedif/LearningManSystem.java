package com.kp.nestedif;

import java.util.Scanner;

public class LearningManSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks for Test 1");
		int t1=scan.nextInt();
		System.out.println("Enter marks for Test 2");
		int t2=scan.nextInt();
		System.out.println("Enter marks for Test 3");
		int t3=scan.nextInt();
		int avg=(t1+t2+t3)/3;
		test(t1,t2,t3,avg);
		scan.close();

	}

	 static void test(int t1, int t2, int t3, int avg) {
		if(t1>50&&t2>50&&t3>50) {
			System.out.println("Passed All");
		}
		else if(avg>50) {
				System.out.println("Average Score Passed");
			}
		
	}

}
