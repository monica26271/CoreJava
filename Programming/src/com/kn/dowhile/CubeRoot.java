package com.kn.dowhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is cube root or not");
		double root=scan.nextInt();
		isCubeRoot(root);
		scan.close();

	}
   
	 static void isCubeRoot(double root) {
		System.out.println(Math.cbrt(root));
	}
}
