package com.kn.multithreading4;

public class Hospital {

	public static void main(String[] args) {
		//without using Synchronization
		
	
//		Hospital h=new Hospital();
//		
//		Treatment tom=new Treatment(h);
//		Treatment jerry=new Treatment(h);
//		
//		Thread t1=new Thread(tom);
//		Thread t2=new Thread(jerry);
//		
//		t2.setName("Jerry");
//		t1.setName("Tom");
//		
//		t1.start();
////		try {
////			t1.join();
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
//		t2.start();
//		
		//with synchronization
		Treatment t=new Treatment();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("Tom");
		t1.start();
		t2.setName("Jerry");
		t2.start();
	}
}
