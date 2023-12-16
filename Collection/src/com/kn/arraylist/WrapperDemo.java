package com.kn.arraylist;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<>();
		//auto Boxing
		list1.add(10);       //list1.add(new Integer(10));
		list1.add(20);
		
		
		//auto unboxing
		int i=list1.get(0);  //(int)list1.get(0);
	}
	

}
