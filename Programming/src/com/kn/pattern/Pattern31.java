package com.kn.pattern;

public class Pattern31 {

	public static void main(String[] args) {
		int k=0;
		for(int i=0;i<=9;i++) {
			if(i<5) {
				k++;
			}
			else {
				k--;
			}
			for(int j=1;j<=5;j++) {
				if(j<=k) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}
	}
}
	
