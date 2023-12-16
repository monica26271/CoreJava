package com.kn.multithreading1;

public class PrintingCharacter implements Runnable {

	@Override
	public void run() {
		for(int i=65;i<=69;i++) {
			System.out.println((char)(i)+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
