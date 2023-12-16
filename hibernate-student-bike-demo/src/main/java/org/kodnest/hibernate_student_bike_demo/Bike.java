package org.kodnest.hibernate_student_bike_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	int regNumber;
	String model;
	double cost;
	public Bike(int regNumber, String model, double cost) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.cost = cost;
	}
	public Bike() {
		super();
	}
	/**
	 * @return the regNumber
	 */
	public int getRegNumber() {
		return regNumber;
	}
	/**
	 * @param regNumber the regNumber to set
	 */
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", model=" + model + ", cost=" + cost + "]";
	}
	

}
