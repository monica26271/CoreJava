package com.kn.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> list1=new PriorityQueue<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		//list.add("Mo");//compilation error
		System.out.println(list1);
		PriorityQueue<String> list2=new PriorityQueue<String>();
		list2.add("one");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		//list2.add(1); //compilation error
		System.out.println(list2);
		

	}

}
