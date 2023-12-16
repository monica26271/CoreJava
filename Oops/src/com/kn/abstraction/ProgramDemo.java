package com.kn.abstraction;

public class ProgramDemo {

	public static void main(String[] args) {
		
		Program.m1();
		Program p1=new Program() {
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println("abstract class overriden in Demo class");
				
			}
		};
		p1.m3();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		p1.m1();
//		p1.m2();
//		p1.m3();
//		p1.m4();
//		String[] srr= {"a","b"};
//		p1.main(srr);

	}

}
