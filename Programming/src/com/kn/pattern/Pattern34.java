package com.kn.pattern;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=4;
		for(int i=1;i<=5;i++) {
			if(i<=3) {
				k--;
			}else {
				k++;
			}
		
		
			for(int j=1;j<=5;j++) {
				if(j==k||j==(6-k)) {
					System.out.print("*");;
				}
				else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}

	}

}
