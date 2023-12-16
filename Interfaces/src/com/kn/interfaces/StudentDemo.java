package com.kn.interfaces;

public class StudentDemo {
	public static void main(String[] args) {
		CSEStudent cs1=new CSEStudent();
		MECHStudent me1=new MECHStudent();
		
		StudentDemo.callmethods(cs1);
		callmethods(me1);
	}

	private static void callmethods(Student s) {
		s.study();
		s.doProject();
	}

}
