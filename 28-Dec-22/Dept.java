package com.jdbcLab28Dec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Dept {

	Scanner d= new Scanner(System.in);
	int d_id;
	String d_name,d_Head,d_Desc;

	public void saveMenudriven() throws SQLException {
		System.out.println("enter Dept ID");
		d_id=d.nextInt();
		System.out.println("enter Dept Name");
		d_name=d.next();
		System.out.println("enter Dept Head");
		d_Head=d.next();
		System.out.println("enter Dept Desc");
		d_Desc=d.next();
		
		Connection conn=Dept.con();	
		PreparedStatement stmt=conn.prepareStatement
		("Insert into Dept values(?,?,?,?)");
		stmt.setInt(1, d_id);
		stmt.setString(2, d_name);
		stmt.setString(1, d_Head);
		stmt.setString(1, d_Desc);
		stmt.executeUpdate();
	}
	private static Connection con() {
		// TODO Auto-generated method stub
		return null;
	}}




	/*//fetching student details in the database (display)
		public void fetchMenuDriven() throws SQLException{
			Connection conn= Employee_2.con();
			Statement stmt=conn.createStatement();
			//execute query fetch data from database
			ResultSet rs=stmt.executeQuery("select*from Student1");
			//iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+
			rs.getString(2)+""+rs.getInt(3)+""+rs.getInt(4));
				System.out.println("Data Inserted & saved Successfully---------");
			}}
		//updating Student details in the database
		public void updateMenudriven()throws SQLException{
			Connection conn=Employee_2.con();
			Statement stmt=conn.createStatement();//create statement
			System.out.println("Enter student address:");
			s_addr=s.nextLine();
			System.out.println("Enter Student ID");
			s_id=s.nextInt();
			stmt.executeUpdate
			("update Student1 set Address="+s_addr+" where stu_id="+s_id);
		}
			
		//deleting student details in the database
		
		public void deleteMenudriven() throws SQLException{
			Connection conn=Employee_2.conn();
			Statement stmt=conn.createStatement();//
			System.out.println("Enter Student id");
			s_id=s.nextInt();
			stmt.executeUpdate("delete from Student1 where stu_id="+s_id);*/
		

