package com.kp.swithcase;

import java.util.Scanner;

public class Librarydemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your option to choose the genres");
		int genres=scan.nextInt();
		genresOfBooks(genres);
		scan.close();
		
		

	}

	 static void genresOfBooks(int genres) {
		switch (genres) {
		case 1: {
			System.out.println("Fiction");
			break;
		}
		case 2: {
			System.out.println("Non-Fiction");
			break;
		}
		case 3: {
			System.out.println("Fantasy");
			break;
		}
		case 4: {
			System.out.println("Mystery");
			break;
		}
		case 5: {
			System.out.println("Biography");
			break;
		}
		default:
			System.out.println("Enter the valid input");
		}
	}

}
