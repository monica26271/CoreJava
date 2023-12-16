package com.kn.whileloop;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		isOdd(num);
		
		scan.close();

	}

	 static void isOdd(int num) {
		//while(num>=0) {
		 int count=0;
		 
			for(int i=0;true;i++) {
				if(count==num) {
					break;
				}
				 if(i%2!=0) {

					   System.out.println(i);
					count++;
				 }
			}}
		}
	//}


