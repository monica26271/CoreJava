package com.kn.pattern;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print((char)(64+j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		

	}

}
