package com.kn.collection;

public class Student1 implements Comparable {
	int id;
	String name;
	double percentage;
	public Student1(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(this.id > ((Student1)(o)).id){
			return 1;
		}
		else if(this.id < ((Student1)(o)).id) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

}
