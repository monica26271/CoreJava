package com.kn.arrayobject;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many objects should be created = ");
		
		StudentUtility[] srr=StudentUtility.creatingStudentObjects(scan.nextInt());
		System.out.println();
		System.out.println("*********************************");
		//Search the Student based on ID
		StudentUtility.searchStudentBasedOnId(srr);
		System.out.println();
		System.out.println("**********************************");
		
		//Search the student based on Name
		StudentUtility.searchStudentBasedOnName(srr);
		System.out.println();
		System.out.println("***********************************");
		
		//sorting student based on marks
		StudentUtility.SortingStudentBasedOnMarks(srr);
		System.out.println();
		System.out.println("***********************************");
		
		//GraceMarks
		StudentUtility.graceMarks(srr);
		System.out.println();
		System.out.println("***********************************");
		
		//Student Rating
		StudentUtility.ratingApplication();
		
		//releasing the resources
		scan.close();
	
		
	}

}
