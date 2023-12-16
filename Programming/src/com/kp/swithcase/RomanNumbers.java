package com.kp.swithcase;

import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Roman Number");
		String num=scan.next();
		romanConvert(num);
		
		scan.close();

	}

	 static void romanConvert(String ch) {
		 switch (ch) {
		case "I": {
			System.out.println(1);
			break;
		}
		case "II": {
			System.out.println(2);
			break;
		}
		case "III": {
			System.out.println(3);
			break;
		}
		case "IV": {
			System.out.println(4);
			break;
		}
		case "V": {
			System.out.println(5);
			break;
		}
		default:
			System.out.println("Enter the Valid Roman number From 0 to 5");
		}
		
	}

}
