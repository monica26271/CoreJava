package com.kn.arrayobject;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
//		Student s1=new Student(1, "Amitha",93);
//		Student s2=new Student(2, "Akash",90);
//		Student s3=new Student(3, "Anusha",30);
//		Student[] srr=new Student[3];
//		srr[0]=s1;
//		srr[1]=s2;
//		srr[2]=s3;
		//Printing the data as the same name 
		
//		for(int i=0;i<srr.length;i++) {
//			if(srr[i].name.equals("Akash")) {
//				System.out.println("ID = "+srr[i].id+" , name = "+srr[i].name+" , marks = "+srr[i].marks);
//			}
//		}
	
		
		
		
		
		
		//	Checking marks whose marks will be less than 35 and making it 35	
//		for(int i=0;i<srr.length;i++) {
//			if(srr[i].marks<35) {
//				System.out.println(srr[i].name);
//				System.out.println("\t Existing marks: "+srr[i].marks);
//				srr[i].marks=35;
//				System.out.println("\t After Grace");
//				System.out.println("\t Upgraded marks: "+srr[i].marks);
//				System.out.println();
//			}
//		}
	
		
		
//		//Arranging the array in the ascending order based on marks
//		for(int i=0;i<srr.length;i++) {
//			int count=0;
//			for(int j=0;j<srr.length-1-i;j++) {
//				if(srr[j].marks>srr[j+1].marks) {
//					Student temp=srr[j];
//					srr[j]=srr[j+1];
//					srr[j+1]=temp;
//					count=1;
//				}
//				
//			}
//			if(count==0) {
//				break;
//			}
//		}
//		for(int i=0;i<srr.length;i++) {
//			
//			System.out.println("ID = "+srr[i].id+" , name = "+srr[i].name+" , marks = "+srr[i].marks);
//		}
//		
//		
		
		Scanner  scan=new Scanner(System.in);
		System.out.println("How many objects should be created: ");
		Student[] arr=new Student[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Student"+(i+1));
			System.out.println("Id = ");
			int id=scan.nextInt();
			scan.nextLine();
			System.out.println("Name = ");
			String name=scan.nextLine();
			System.out.println("Marks = ");
			int marks=scan.nextInt();
			arr[i]=new Student(id,name,marks);
		}
		System.out.println("*********************************");
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.println("ID = "+arr[i].id+" , name = "+arr[i].name+" , marks = "+arr[i].marks);
//		}
//		

		
		//binary search
		System.out.println("Enter the Id to be Searched = ");
		int element=scan.nextInt();
		int low=0,mid,high=arr.length-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			
			if(arr[mid].id==element) {
				//System.out.println(element+" is found at Index "+(mid));
				System.out.println("ID = "+arr[mid].id+" , name = "+arr[mid].name+" , marks = "+arr[mid].marks);
				break;
			}
			else if(arr[mid].id < element) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		
		
	}


}
