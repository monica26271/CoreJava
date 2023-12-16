package com.kn.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingArrayList {

	public static void main(String[] args) {

		ArrayList<Object> list1=new ArrayList<Object>();
		
		list1.add("Shirt");
		list1.add("Pant");
		list1.add(1);
		list1.add(true);
		list1.add(10.2);
		//************************* Different Traversal technique In Collection ********************************
		
		
//		//1.for loop
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
		
//		//2.for each loop
//		for(Object i:list1) {
//			System.out.println(i);	
//		}
		
//		//3.Iterator
//		Iterator itr=list1.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//ListIterator for backward traversing on for lists
		
		ListIterator<Object> itr1=list1.listIterator(list1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}
