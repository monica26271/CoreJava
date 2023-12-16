package com.kn.polymorphism.softwareengineering;



public class SoftwareEngineerDemo {

	public static void main(String[] args) {
		SoftwareEngineer se;
		
		
		se=new BackendEngineer();
		doActivity(se);
		System.out.println("-------------------------------");
		
		JavaBackendEngineer je=new JavaBackendEngineer();
		doActivity(je);
		System.out.println("-------------------------------");
		
		PythonBackendEngineer pe=new PythonBackendEngineer();
		doActivity(pe);
		
		System.out.println("-------------------------------");
		
		se=new DatabaseEngineer();
		doActivity(se);
		
		
	
	}

	public static void doActivity(SoftwareEngineer se) {
		//inherited
		se.doTesting();
		//overriden
		
		if(se instanceof BackendEngineer) {
			System.out.println("Backend Engin");
			se.attendMeeting();
			//child Specific 
			((BackendEngineer) se).doBackendProject();
		}
		else if(se instanceof DatabaseEngineer) {
			se.attendMeeting();
			//child Specific 
			((DatabaseEngineer) se).doDatabaseProject();
			//child Specific 
			((DatabaseEngineer) se).learnSql();
		}
		else if(se instanceof PythonBackendEngineer) {
			
			se.attendMeeting();
			//child Specific 
			((PythonBackendEngineer) se).doBackendProject();
			//child Specific 
			((PythonBackendEngineer) se).learnPython();
			
		}
		else {
			//overriden
			se.attendMeeting();
			//child Specific 
			((JavaBackendEngineer)se).doBackendProject();
			//child Specific 
			((JavaBackendEngineer) se).learnJava();
		}
		
	}

}
