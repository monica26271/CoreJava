package com.kn.arraydeque;

import java.util.*;
public class UpcastingInCollection {

	public static void main(String[] args) {
		//Upcasting with collection objects
		
		List list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		List list2=new LinkedList();
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		Queue que1=new ArrayDeque();
		que1.add(11);
		que1.add(22);
		que1.add(33);
		
		Queue que2=new PriorityQueue();
		que2.add(44);
		que2.add(55);
		que2.add(66);
		

	}

}
