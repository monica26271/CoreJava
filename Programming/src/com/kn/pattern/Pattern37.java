package com.kn.pattern;

public class Pattern37 {

	public static void main(String[] args) {
		int k;
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				k=0;
			}
			else {
				k=1;
			}
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(k);
					if(k==1) {
						k=0;
					}
					else {
						k=1;
					}}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
