package com.kn.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class employee {
	
	
	
	 public static Scanner scan=new Scanner(System.in);
	private static final String URL="jdbc:mysql://localhost:3306/employee";
	private static final String USER_NAME="root";
	private static final String PASSWORD="root";
	private static final String UPDATE_SALARY_USING_NAME="update emp set salary=salary+((salary*10)/100) where name = ?";
	private static final String UPDATE_SALARY_USING_ID="update emp set salary=salary+((salary*10)/100) where id = ?";
	private static final String SELECT_QUERY="Select * from emp;";
	public static void main(String[] args){
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			 Statement stmt=con.createStatement();
			 System.out.println("Before updating the salary");
			 ResultSet rs=stmt.executeQuery(SELECT_QUERY);
			 while(rs.next()) {
				 System.out.println("Id = "+rs.getInt(1)+
						 " Name = "+rs.getString(2)+
								 " Salary = "+rs.getInt(3));
				 
			 }
			 System.out.println("****************************");
			
			 System.out.println("enter the id = ");
			 int id=scan.nextInt();
			 PreparedStatement pstmt=con.prepareStatement(UPDATE_SALARY_USING_ID);
			 
			 pstmt.setInt(1, id);
			 pstmt.execute();
			 ResultSet rs1=pstmt.executeQuery(SELECT_QUERY);
			 while(rs1.next()) {
				 System.out.println("Id = "+rs1.getInt(1)+
						 " Name = "+rs1.getString(2)+
								 " Salary = "+rs1.getInt(3));
			 }	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
