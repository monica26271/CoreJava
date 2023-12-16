package com.kn.multithreading4;

public class Treatment implements Runnable{
	Hospital h;

	@Override
	 public synchronized void run() {
		try {
			System.out.println("Treatment Started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in-progress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		
	}

//	public Treatment(Hospital h) {
//		this.h=h;
//	}
	

}
