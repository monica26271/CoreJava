package com.kn.pattern;

public class Pattern38 {

	public static void main(String[] args) {
//		int k=6;
//		for(int i=1;i<=5;i++) {
//			if(i<=3) {
//				k--;
//			}
//			else {
//				k++;
//			}
//			for(int j=1;j<=5;j++) {
//				if(j>=(6-k)&&j<=k)
//				{
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}System.out.println(" ");
//		}

		int k=10;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				k--;
			}
			else {
				k++;
			}
			for(int j=1;j<=9;j++) {
					if(j>=(10-k)&&j<=k)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}System.out.println(" ");
			}
	}

}
