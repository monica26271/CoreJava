package com.kn.bankapp;

import java.util.Scanner;



public class AccountDemo {

	public static void main(String[] args) {
		System.out.println("Enter the money to deposit in the bank");
		Scanner scan=new Scanner(System.in);
		double deposit=scan.nextInt();
		
		
		Account ac=new Account();
		System.out.println("Account Number : "+ac.accountNumber+" \nAccount holder name :  "+ac.accountHolder+"\nAvl balance of before operation = "+ac.balance);
		System.out.println("-------------------------------------");
		System.out.println("After deposit new balance is = "+ac.depositMoney(deposit));
		System.out.println("-------------------------------------");
		System.out.println("Enter the money to withdraw from the bank");
		double withdraw=scan.nextInt();
		System.out.println("After withdrawal new balance is = "+ac.removeMoney(withdraw));
		
		
		scan.close();
		

	}

}
