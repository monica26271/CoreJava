package com.kn.multithreading1;

public class Demo {

	public static void main(String[] args) {

		PrintingNumbers pn=new PrintingNumbers();
		PrintingCharacter pc=new PrintingCharacter();
		
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		t1.start();
		t2.start(); 
		
	}

}
