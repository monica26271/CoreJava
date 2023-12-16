package com.kp.nestedif;

import java.util.Scanner;

public class FindingSpecialKeyGame {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of gold coins you have");
		int coin=scan.nextInt();
		System.out.println("Enter the Player level");
		int level=scan.nextInt();
		System.out.println("Enter whether he has got Special key or not");
		boolean key=scan.nextBoolean();
		iskeyFound(coin,level,key);
		
		scan.close();

	}

	static void iskeyFound(int coin, int level, boolean key) {
		if(coin>10&&level>5) {
			if(key==true) {
				System.out.println("Special key is Found");
			}
		}
		
	}

}
