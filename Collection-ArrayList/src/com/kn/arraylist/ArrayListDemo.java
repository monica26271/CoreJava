package com.kn.arraylist;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1.size());
		System.out.println(list1);
		//list1.add(2,'M');
//		System.out.println("**********************");
//		System.out.println("after adding at a particular index: "+list1);
//		System.out.println("**********************");
//		//list1.set(3,"Moni");
//		System.out.println("after changing data at a particular index: "+list1);
		
		ArrayList list2=new ArrayList();
		list2.add("one");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		
		System.out.println("**********************");
		System.out.println();
		
		list2.addAll(list1);
		System.out.println("after adding all the elements of list1 to list2: "+list2);
		
		System.out.println("**********************");
		System.out.println();
	
		list2.addAll(2,list1);
		System.out.println("after adding all the elements of list1 to list2 at particular index: "+list2);
		
		
	}

}
