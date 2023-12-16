package com.kn.whileloop;

import java.util.Scanner;

public class LargestPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the range");
		int range=scan.nextInt();
		
	   //boolean res=isPalindrome();
//	if(res==true) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("not");
//	}
	isLargestPalindrome(range);
		
		
		scan.close();

	}

	  static void isLargestPalindrome(int range) {
		// TODO Auto-generated method stub
		  int i=range;
		  while(i>=1) {
			  if(isPalindrome(i)==true) {
			  System.out.println("The largest Palindrome "+i);
			  break;
			  }
			  i--;
		  }
		  
		
	}

	static boolean isPalindrome(int num) {
		 int digit,sum=0,temp=num;
		 boolean r=false;
		 while(num>0){
			 digit=num%10;
			 sum=sum*10+digit;
			 num=num/10;
		 }
		if(sum==temp) {
		   r=true;
	}
		return r;

}
}

