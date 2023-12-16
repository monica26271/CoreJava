package com.kn.collection;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		if(s1.id>s2.id) {
			return 1;
		}
		else if(s1.id<s2.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
