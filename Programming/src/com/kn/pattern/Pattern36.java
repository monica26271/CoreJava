package com.kn.pattern;

public class Pattern36 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==(5-i)||j==4) {
					System.out.print("1");
					
				}
				else if(j==i&&j+i==6) {
					System.out.print("2");
				}
				else if(i==4&&(i-j==1||i+j==6)) {
					System.out.print("3");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}
}
