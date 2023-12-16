package com.kp.ifelse;

import java.util.Scanner;

public class MarkingSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Marks");
		int a=scan.nextInt();
		marks(a);
		scan.close();
				

	}

	 static void marks(int a) {
		// TODO Auto-generated method stub
		 if(a>=60) {
				System.out.println("Passed");
			}
			else {
				System.out.println("Failed");
			}
	}

}
