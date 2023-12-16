package com.kn.whileloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=scan.nextInt();
		iseven(n);
		
		scan.close();
		

	}

	 static void iseven(int n) {
		 int i=1;
		 while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			
			 i++;
		 }
	
		 
		 
      }
}	 

