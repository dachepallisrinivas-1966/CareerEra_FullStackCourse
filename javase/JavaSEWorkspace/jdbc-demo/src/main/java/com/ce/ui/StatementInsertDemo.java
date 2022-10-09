package com.ce.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInsertDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
			String sql = "INSERT INTO jobs (job_id, job_title, min_salary, max_salary) VALUES ('j4', 'developer4', 40000, 45000)";
			st = con.createStatement();
			st.executeUpdate(sql);
			System.out.println("row inserted.");
		
		} catch(SQLException excep) {
			excep.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch(SQLException excep) {
				excep.printStackTrace();
			}
		}

	}

}
