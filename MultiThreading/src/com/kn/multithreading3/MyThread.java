package com.kn.multithreading3;

public class MyThread implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("numbers")) {
			printNumber();
		}else {
			printCharater();
		}

	}
	public void printNumber() {
		System.out.println("=====> Printing Numbers Started");
		for(int i=1;i<11;i++) {
			System.out.println("****"+i);
		}
		System.out.println("=====> Printing Numbers Completed");
	}
	public void printCharater() {
		System.out.println("=====> Printing Characters Started");
		for(int i=65;i<75;i++) {
			System.out.println((char)i);
		}
		System.out.println("=====> Printing Characters Completed");
	}

}
