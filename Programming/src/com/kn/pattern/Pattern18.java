package com.kn.pattern;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print((char)(70-i    ));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
