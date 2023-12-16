package com.kp.elseif;

import java.util.Scanner;

public class PositiveOrNegativeDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		
		checknumbers(a);
		
		scan.close();
	}

	 static void checknumbers(int a) {
		 if(a>0) {
				System.out.println("number is positive");
			}
		else if(a<0){
				System.out.println("number is negative");
			}
		else {
				System.out.println("Zero");
			}
	}

}
