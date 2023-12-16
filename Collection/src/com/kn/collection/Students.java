package com.kn.collection;

public class Students {
	int id;
	String name;
	double percentage;
	public Students(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	

}
