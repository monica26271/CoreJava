package com.kn.multithreading.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		
		
		
		t1.setName("numbers");
		t2.setName("character");
		
		t1.start();
		t2.start();

	}

}
