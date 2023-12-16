package com.kn.arraydeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BackwardTraversalInArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		//***********In ArrayDeque indexing is not there soo we cant use for loops only iterator is used********************
		
		//for backward traversal
		Iterator<Integer> itr=ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
