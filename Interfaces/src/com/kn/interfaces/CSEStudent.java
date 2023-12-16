package com.kn.interfaces;

public class CSEStudent implements Student {

	@Override
	public void study() {
		System.out.println("Studying Algorithms");
	}

	@Override
	public void doProject() {
		System.out.println("Working on library project");
	}
	
	

}
