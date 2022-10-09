package com.ce.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemo {

	public static void main(String[] args) {
		String sql = "SELECT job_id, job_title, min_salary, max_salary FROM jobs;";
		
		// automatic resource management (try-with-resources)
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
		     PreparedStatement pst = con.prepareStatement(sql);
			 ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				System.out.printf("%-15s%-50s%8s%8s\n",rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4));
			}
			
		} catch(SQLException excep) {
			excep.printStackTrace();
		} 

	}

}
