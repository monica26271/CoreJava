package com.kn.bankapp;

public class Account {
	int accountNumber=123;
	String accountHolder="Nishchitha";
	double balance=100.45;
	
	public double depositMoney(double deposit) {
		balance=(deposit+balance);
		return balance;
		
	}

	public double removeMoney(double withdraw) {
		if(balance<withdraw) {
			System.out.println("Insufficient balance");
		}else {
			balance=balance-withdraw;
		}
		return balance;
	}

}
