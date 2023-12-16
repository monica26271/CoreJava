package com.practice.kodnest;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop l=new Laptop("DELL","8 GB");
		
		System.out.println(l.getProcessorName()+" Laptop of pocessor size "+l.getMemorySize());
		System.out.println();
		System.out.println("After Updating the Processor size: ");
		l.setMemorySize("64 GB");
		System.out.println();
		System.out.println(l.getProcessorName()+" Laptop of pocessor size "+l.getMemorySize());

	}

}
