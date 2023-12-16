package com.kn.multithreading1;

public class PrintingNumbers implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	

}
