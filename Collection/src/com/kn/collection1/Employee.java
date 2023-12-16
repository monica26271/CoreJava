package com.kn.collection1;

public class Employee {
	int empId;
	String empName;
	double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id=" + empId + " Name=" + empName + " salary=" + salary;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empNAme
	 */
	public String getEmpNAme() {
		return empName;
	}
	/**
	 * @param empNAme the empNAme to set
	 */
	public void setEmpNAme(String empNAme) {
		this.empName = empNAme;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
