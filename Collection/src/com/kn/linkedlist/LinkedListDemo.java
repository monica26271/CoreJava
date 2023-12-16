package com.kn.linkedlist;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list1=new LinkedList();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
		System.out.println("**************");
		list1.add(2, 22);
		list1.get(2);
		System.out.println("getting element at index 2"+list1);
		list1.set(1, 55);
		System.out.println("setting an element at the index 1 as 55 :"+list1);
		System.out.println(list1);
		System.out.println("**************");
		list1.add(10);
		System.out.println("index of 10 :"+list1.indexOf(10));
		System.out.println("Last index of 10 :"+list1.lastIndexOf(10));
		LinkedList list2=new LinkedList();
		list2.add("one");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		list2.addAll(list1);
		System.out.println("addling all elements of list1 at the end of list2: "+list2);
		list2.add(2, list1);
		System.out.println("addling all elements of list1 at the index 2 in list2 : "+list2);
		
		
		
	}

}
