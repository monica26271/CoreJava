package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		isPerfect(num);
		scan.close();

	}

	 static void isPerfect(int num) {
		int sum=0,i=1;
		
		while(i<num) {
			if(num%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println(sum+" is perfect number");
		}
		else {
			System.out.println(sum+" is not perfect");
		}
		
	}

}
