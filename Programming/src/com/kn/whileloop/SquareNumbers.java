package com.kn.whileloop;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the number till where you need to find its squares");
		int num=scan.nextInt();
		squareNumber(num);
		
		scan.close();

	}

	 static void squareNumber(int num) {
		 int sqrt=1;
	 
			for(int i=1;i<=num;i++) {
				sqrt=i*i;
				System.out.println(sqrt);
				
			}
			
		}
			
	}

