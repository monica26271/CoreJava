package com.kn.encapsulation;

public class StudentRTest {
	private String name;
	private int age;
	private String gender;
	private int marks;
	public StudentRTest(String name, int age, String gender, int marks) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	

}
