package com.kn.maven.proj1;



public class TestConn {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has loaded");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
