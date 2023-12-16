package com.kn.multithreading.deamon;

public class DeamonDemo {

	public static void main(String[] args) {
		TypingCode t1=new TypingCode();
		SavingCode t2=new SavingCode();
		CompilingCode t3=new CompilingCode();
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
