package com.kn.arrayobject;

import java.util.Scanner;

public class StudentUtility {
	int id;
	String name;
	int marks;
	public static Scanner scan=new Scanner(System.in);
	public StudentUtility(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	//method to create Student objects
	public static StudentUtility[] creatingStudentObjects(int object) {
		StudentUtility[] arr=new StudentUtility[object];
		for(int i=0;i<object;i++) {
			System.out.println("Student "+(i+1));
			System.out.println("ID = ");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Name ");
			String name=scan.nextLine();
			System.out.println("Marks ");
			int marks=scan.nextInt();
			arr[i]=new StudentUtility(id,name,marks);
		}
		return arr;
	}
	
	
	//Method To Search Student Based on Id
	public static void searchStudentBasedOnId(StudentUtility[] srr) {
		System.out.println("Enter the Id to be found: ");
		
		int element=scan.nextInt();
		int low=0,high=srr.length-1,mid;
		boolean isFound=true;
		while(low<=high) {
			mid=(low+high)/2;
			if(srr[mid].id==element) {
				isFound=false;
				System.out.println("ID = "+srr[mid].id+" , name = "+srr[mid].name+" , marks = "+srr[mid].marks);
				break;
			}
			else if(srr[mid].id<element) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
		}
		if(isFound) {
			System.out.println("ID Not found");
		}
		
	}

	
	//Method To Search Student Based on Name
	public static void searchStudentBasedOnName(StudentUtility[] srr) {
		System.out.println("Enter the Name to be found: ");
		scan.nextLine();
		String element=scan.nextLine();
		boolean isFound=true;
		for(int i=0;i<srr.length;i++) {
			if(srr[i].name.equalsIgnoreCase(element)) {
				System.out.println(" ");
				System.out.println("ID = "+srr[i].id+" , name = "+srr[i].name+" , marks = "+srr[i].marks);
				isFound=false;
			}
		}
		if(isFound) {
			System.out.println("Name Not Found");
		}
		System.out.println("************************************");
	}

	
	//Method to Sorting Student Based On Marks
	public static void SortingStudentBasedOnMarks(StudentUtility[] srr) {
		for(int i=0;i<srr.length;i++) {
			int count=0;
			for(int j=0;j<srr.length-1-i;j++) {
				if(srr[j].marks>srr[j+1].marks) {
					StudentUtility temp=srr[j];
					srr[j]=srr[j+1];
					srr[j+1]=temp;
					count=1;
				}
			}
			if(count==0) {
				break;
			}
		}
		System.out.println("Sorted Based On marks in ascending order :");
		for(int i=0;i<srr.length;i++) {
			System.out.println("ID = "+srr[i].id+" , name = "+srr[i].name+" , marks = "+srr[i].marks);
		}
		
	}

	
	// Method to apply grace Marks for student who have faild
	public static void graceMarks(StudentUtility[] srr) {
		for(int i=0;i<srr.length;i++) {
			if(srr[i].marks<35) {
				System.out.println(srr[i].name);
				System.out.println("\t Existing marks: "+srr[i].marks);
				srr[i].marks=35;
				System.out.println("\t After Grace");
				System.out.println("\t Upgraded marks: "+srr[i].marks);
				System.out.println();
			}
		}
	}
	

	//Method to Rate the Application
	public static void ratingApplication() {
		
		System.out.println("Enter the rating from 1 to 5: ");
		int rating=scan.nextInt();
		if(rating<=5) {
			for(int i=0;i<rating;i++) {
				System.out.print("*");
			}
		}else {
			System.out.println("Enter the Valid Rating");
		}
		
	}
}
