package com.kn.pattern;

public class Pattern39 {

	public static void main(String[] args) {
		int k=3;
		for(int i=1;i<=5;i++) {
			if(i<=2) {
				k--;
			}
			else {
				k++;
			}
			for(int j=1;j<=7;j++) {
				if(i==1&&j==4) {
					System.out.print(" ");
				}
				else if(j>=k&&j<=(8-k)) {
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
