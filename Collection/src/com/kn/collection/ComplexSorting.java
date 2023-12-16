package com.kn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSorting {

	public static void main(String[] args) {

		Student1 s1=new Student1(3,"Monica", 100);
		Student1 s2=new Student1(2,"Moni", 78);
		Student1 s3=new Student1(1,"Mooo", 67);
		
		ArrayList StudentList=new ArrayList();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		Collections.sort(StudentList);
		System.out.println("Sorting using comparable compareTo() method"+StudentList);
		
		
		//type-1 when target class(Student1) is not there
		
		//Creating a Implementation class sortStudentbyId and object
		
		SortStudentById s=new SortStudentById();
		Collections.sort(StudentList,s);
		System.out.println("Sorting using comparator compare() method and creating a implementation class:"+StudentList);
		
		//type-2 when target class(Student1) is not there
		//without creating target class because target class will be automatically created
		Collections.sort(StudentList,new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1, Student1 s2) {
				if(s1.id>s2.id) {
					return 1;
				}
				else if(s1.id<s2.id) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println("Sorting using comparator compare() method and without creating a implementation class:"+StudentList);
		
		
		//sortingByName Using comparator
		Collections.sort(StudentList,new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1, Student1 s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println("Sorting using the elements by name: "+StudentList);
		
		
		
		
		
		//Creating a Implementation class sortStudentbyName and object
			SortStudentByName name=new SortStudentByName();
			Collections.sort(StudentList,name);
			System.out.println("Sorting using the elements by name using implementation class: "+StudentList);
				
		
	}

}
