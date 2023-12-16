package com.kn.multithreading.deamon;

public class SavingCode extends Thread {
	@Override
	public void run() {
		for(;;) {//Infinite loop
			System.out.println("Saving Code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
