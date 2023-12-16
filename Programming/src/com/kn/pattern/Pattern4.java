package com.kn.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((char)(i+64));//for column wise pattern changing j+64
			}
			System.out.println("");
		}

	}

}
