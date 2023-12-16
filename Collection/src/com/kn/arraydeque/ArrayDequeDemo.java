package com.kn.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Monica");
		ad.add(true);
		System.out.println("first element: "+ad.getFirst());
		System.out.println("last element: "+ad.getLast());
		System.out.println("**************");
		System.out.println(ad);
		ad.addFirst(111);
		ad.addLast(999);
		System.out.println("first element: "+ad.getFirst());
		System.out.println("last element: "+ad.getLast());
		System.out.println(ad);
	}

}
