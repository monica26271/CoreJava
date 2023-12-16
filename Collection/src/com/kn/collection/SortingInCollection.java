package com.kn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortingInCollection {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(123);
		set.add(10);
		set.add(24);
		set.add(2);
		set.add(1);
		
		System.out.println("Sorted Elements are: "+set);
		
		//sorting using Collections.sort(obj);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(10);
		list.add(24);
		list.add(2);
		list.add(1);
		System.out.println("Before sorting = "+list);
		Collections.sort(list);
		System.out.println("After sorting = "+list);
		
	}

}
