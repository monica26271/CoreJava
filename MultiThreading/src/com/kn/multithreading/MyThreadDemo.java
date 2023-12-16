package com.kn.multithreading;

public class MyThreadDemo {

	public static void main(String[] args) {
		Thread t2=Thread.currentThread();
		System.out.println(t2);
		
		MyThread t1=new MyThread();
		t1.start();
		t1.setName("MyThread");
		t1.setPriority(7);
		MyThread t3=new MyThread();
		t3.start();
		MyThread t4=new MyThread();
		t4.start();
		MyThread t5=new MyThread();
		t5.start();
		MyThread t6=new MyThread();
		t6.start();
		
		

	}

}
