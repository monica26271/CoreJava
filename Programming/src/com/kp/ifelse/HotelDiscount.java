package com.kp.ifelse;

import java.util.Scanner;

public class HotelDiscount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your age ");
		int a=scan.nextInt();
		discount(a);
		scan.close();

	}

	 static void discount(int a) {
		 if(a>=60) {
				System.out.println("Senior Citizen Discount Applicable");
			}
			else {
				System.out.println("Regular charges Applicable");
			}
		
	}

}
