package com.kn.multithreading3;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.setName("numbers");
		t2.setName("character");
		
		t1.start();
		t2.start();
		

	}

}
