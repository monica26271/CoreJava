package com.leetcode.arrays;

import java.util.Scanner;

public class Pattern1 {
//
	public static void main(String[] args) {
////		for(int i=0;i<5;i++) {
////			for(int j=0;j<5;j++) {
////				if(j<=i) {
////					System.out.print(i+1);
////				}
////				else {
////					System.out.print("");
////				}
////			}
////			System.out.println();
////		}
////		1
////		22
////		333
////		4444
////		55555
//		
//		
////***********************************************************************************************************
////		for(int i=1;i<=5;i++) {
////			for(int j=1;j<=5;j++) {
////				if(j<=6-i) {
////					System.out.print(6-i);
////				}
////				else {
////					System.out.print("");
////				}
////			}
////			System.out.println();
////			
////		}
////		55555
////		4444
////		333
////		22
////		1
//		
////********************************************************************************************************
////	for(int i=0;i<100;i++) {
////		if(i%5==0) {
////			continue;
////		}
////		else {
////			System.out.print(i+" ");
////		}
////	}
////	
//		
////		Scanner scan=new Scanner(System.in);
////		int num=scan.nextInt();
////		
////		if(num%2!=0) {
////			System.out.println("Weird");
////		}
////		else if(num%2==0) {
////			if(num>=2&&num<=5) {
////				System.out.println("Not Weird");
////			}
////			else if(num>=6&&num<=20) {
////				System.out.println("Weird");
////			}
////			else if(num>20) {
////				System.out.println("Not Weird");
////			}
////		}
//		
////		for(int i=0;i<=10;i++) {
////			for(int j=0;j<=10;j++) {
////				if(i==0||i==10) {
////					System.out.print("*");
////				}
////				else if(j==0||j==10) {
////					System.out.print("*");
////				}
////				else {
////					System.out.print("-");
////				}
////			}
////			System.out.println();
////		}
//		
//		
//		for(int i=1;i<=3;i++) {
//			for(int j=0;j<3;j++) {
//			
//				if(j<=3-i) {
//					System.out.print("-");
//				}
//				
//			}
//			for(int j=0;j<3;j++) {
//				if(j<=3-i) {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
//	}
//		public static String reverseString(String str ) {
//			
//			
//			//String  
//			StringBuffer str2 = new StringBuffer();
//			for(int i =str.length()-1;i>=0; i-- ) {
//				str2 = str2.append(str.charAt(i));
//			}
//			return str2.toString();
//		}
//		
//		public static int numberOftimesCharacter(String str, char ch) {
//			int count = 0;
//			
//			char [] arr = str.toCharArray();//converting to char Array
//			
//			for(int i = 0; i<str.length(); i++) {//forward traversing
//				if(arr[i]==ch) {//comparing
//					count ++;
//				}
//			}
//			
//			
//			return count;
//		}
//		
//		public static void main(String[] args) {
//			String str = new String("hcetofni niarbedoc si siht");
//			System.out.println(reverseString(str));
//			char ch = 't';
//			System.out.println("********************************");
//			for(int i = 97 ;i<=122; i++ ) {
//				char ch2 = (char)i;
//				System.out.println(ch2 +" = "+ numberOftimesCharacter(reverseString(str), ch2));
//			}
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome=false;
        int index=A.length()-1;
        System.out.println(index);
        for(int i=0;i<A.length();i++){
        	System.out.println(i+" "+index);
          if(A.charAt(i)==A.charAt(index-i)){
            isPalindrome=true;
          }else{
            isPalindrome=false;
            break;
          }
        }
        if(isPalindrome){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
			
		}

}
	



