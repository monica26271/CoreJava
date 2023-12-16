package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		findProduct(n);
		scan.close();

	}

	 static void findProduct(int n) {
		int counter=0,product=1;
		
			for(int i=1;true;i++) {
				if(counter==n) {
					break;
				}
				 if(i%2==0) {
					 product=product*i;
					 //System.out.println(i);
					 counter++;
				 }
			}
		System.out.println(product);
		}
		
	 }
