package com.kn.polymorphism.softwareengineering;

public class DatabaseEngineer extends SoftwareEngineer {

	@Override
	public void attendMeeting() {
		System.out.println("Database Engineer attending Database Meeting.");
	}
	
	public void doDatabaseProject() {
		System.out.println("Database Engineer doing database project.");
	}
	public void learnSql() {
		System.out.println("Database Engineer learning Sql.");
	}
	

}
