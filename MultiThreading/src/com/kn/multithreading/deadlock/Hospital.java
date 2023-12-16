package com.kn.multithreading.deadlock;

public class Hospital {
	String res1="Dr.Monica";
	String res2="Bed";
	
	public void treatTom() {
		try {
			synchronized (res1) {
				System.out.println(res1+" is allocated for tom");
				Thread.sleep(2000);
			synchronized (res2) {
				System.out.println(res2+" is allocated for Tom");
				Thread.sleep(2000);
				}
			}
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void treatJerry() {
		try {
			synchronized (res2) {
				System.out.println(res2+" is allocated for jerry");
			
				Thread.sleep(2000);
			 
			synchronized (res1) {
				System.out.println(res1+" is allocated for Jerry");
				Thread.sleep(2000);
			
			}
			}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
	

