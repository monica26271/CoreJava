package com.kn.whileloop;

import java.util.Scanner;
//WAP to find the largest number in the given digit

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int res=isgreater(num);
		System.out.println("The largest number in "+num+" is "+res);
		
		scan.close();
		

	}

	 static int isgreater(int num) {
		 int digit,temp=1;
		 while(num>0) {
			
			 digit=num%10;
			 if(digit>temp) {
				 temp=digit;
				// System.out.println(temp);
			 }
			 num=num/10;
			
		 }
		 return temp;
}
}
