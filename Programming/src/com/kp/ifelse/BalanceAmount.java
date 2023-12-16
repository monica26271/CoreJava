package com.kp.ifelse;

import java.util.Scanner;

public class BalanceAmount {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Balance to validate");
		int a=scan.nextInt();
		balance(a);
		scan.close();

	}

	 static void balance(int a) {
		 if(a<0) {
				System.out.println("Negative Balance");
			}
			else {
				System.out.println("Positive Balance");
			}
	}

}
