package com.kp.elseif;

import java.util.Scanner;

public class CharacterInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowels();
		

	}

	static void vowels() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input");
		char inp = scan.next().charAt(0);
		if (inp >= 97 && inp <= 122) {
			if (inp == 'a' || inp == 'e' || inp == 'i' || inp == 'o' || inp == 'u') {
				System.out.println("It is a Lower case Vowels");
			} else {
				System.out.println("It is a Lower case Consonents");
			}
		} else if (inp >= 65 && inp <= 99) {
			if (inp == 'A' || inp == 'E' || inp == 'I' || inp == 'O' || inp == 'U') {
				System.out.println("It is a Upper case Vowels");
			} else {
				System.out.println("It is a Upper case Consonents");
			}

		}

		else if (inp >= 48 && inp <= 57) {
			System.out.println("It is a Digit");
		} else {
			System.out.println("It is a special character");
		}
		scan.close();

	}


}
