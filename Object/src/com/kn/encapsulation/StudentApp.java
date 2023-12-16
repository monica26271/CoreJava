package com.kn.encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		Student s1=new Student(1,"Monica",100,"Female");
		System.out.println("Roll Number = "+s1.getRollNumber());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Gender = "+s1.getGender());
		System.out.println();
		
		s1.setRollNumber(1);
		s1.setName("Monu");
		s1.setMarks(99);
		System.out.println("Modified: ");
		System.out.println();
		System.out.println("Roll Number = "+s1.getRollNumber());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Gender = "+s1.getGender());
		
		

	}

}
