package com.kp.simpleif;

import java.util.Scanner;

public class RollerCoaster {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		ride(age);
		
		
		scan.close();


	}

	 static void ride(int age) {
		 if(age>=12) {
				System.out.println("Acess is granted");
			}
	}


}
