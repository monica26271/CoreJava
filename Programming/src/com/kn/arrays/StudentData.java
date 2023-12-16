package com.kn.arrays;

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numberOfstudents=scan.nextInt();
		System.out.println("Enter the number of subjects");
		int numberOfSubjects=scan.nextInt();
		
		//declaration and creation
		int[][] arr=new int[numberOfstudents][numberOfSubjects];
		
		//initialization of array 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for student "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("subject "+(j+1)+" marks =");
				arr[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Student "+(i+1)+" scores are as follows: ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("subject "+(j+1)+" marks: "+arr[i][j]);	
			}
		}
		
		scan.close();
	}
}
