package com.jdbcLab28Dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection driver manager
			Connection conn= DriverManager.getConnection
					  ("jdbc:mysql://localhost:3306/suchidb","root","annika@2000");//step 2
			
			Statement stmt=conn.createStatement();
//inserting data into database table //step 4
			stmt.executeUpdate("insert into Employee_2 values "
					+ "(081,'Vikram','12000','9878761212','Ad1',2");
					
					System.out.println("inserted successfully");
		conn.close();//step 5
		}
		catch (Exception e) {
			System.out.println(e);
	}

}
}