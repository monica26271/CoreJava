package com.kn.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"arjun", 100);
		Employee e2=new Employee(5,"Arun", 100000);
		Employee e3=new Employee(3,"Varun", 10);
		Employee e4=new Employee(2,"Jun", 1000);
		Employee e5=new Employee(4,"Jack", 10000);
		
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		System.out.println("Employee details in Ascending order using Id: ");
		System.out.println(sortByIdInAscending(empList));
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Employee details in Descending order using Id: ");
		System.out.println(sortByIdInDescending(empList));
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Employee details in Ascending order using Name: ");
		System.out.println(sortByNameInAscending(empList));
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Employee details in Descending order using Name: ");
		System.out.println(sortByNameInDescending(empList));
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Employee details in Ascending order using Salary: ");
		System.out.println(sortBySalaryInAscending(empList));
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Employee details in Descending order using Salary: ");
		System.out.println(sortBySalaryInDescending(empList));

	}
	
	//salary in decending order
	private static ArrayList<Employee> sortBySalaryInDescending(ArrayList<Employee> empList) {
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return -1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return 1;
				}else {
					return 0;
				}
				
			}
		});
		return empList;
	}
	//salary in ascending order
	private static ArrayList<Employee> sortBySalaryInAscending(ArrayList<Employee> empList) {
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}else if(o1.getSalary()<o2.getSalary()) {
					return -1;
				}else {
					return 0;
				}
				
			}
		});
		return empList;
	}
	//name in decending order
	private static ArrayList<Employee> sortByNameInDescending(ArrayList<Employee> empList) {

		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return -(o1.getEmpNAme().compareTo(o2.getEmpNAme()));
			}
		});
		return empList;
	}
	
	//Name in ascending order
	private static ArrayList<Employee> sortByNameInAscending(ArrayList<Employee> empList) {

		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpNAme().compareTo(o2.getEmpNAme());
			}
		});
		return empList;
	}

	//id in decending order
	private static ArrayList<Employee> sortByIdInDescending(ArrayList<Employee> empList) {
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getEmpId()>o2.getEmpId()) {
					return -1;
				}else if(o1.getEmpId()<o2.getEmpId()) {
					return 1;
				}else {
					return 0;
				}
				
			}
		});		
		return empList;
	}
	
	//id in ascending order
	private static ArrayList<Employee> sortByIdInAscending(ArrayList<Employee> empList) {
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getEmpId()>o2.getEmpId()) {
					return 1;
				}else if(o1.getEmpId()<o2.getEmpId()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		return empList;
	}

	

}
