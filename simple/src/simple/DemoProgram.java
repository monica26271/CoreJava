package simple;

import java.util.Scanner;

public class DemoProgram {
	public static void main(String[] args) {
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