package com.kn.pattern;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				k++;
			}else {
				k--;
			}
			for(int j=1;j<=9;j++) {
				if(j<=k||j>=(10-k)) {
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
