package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeEx {

		public static void main(String[] args) throws Exception{
			
			System.out.println(1);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(2);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			Connection conInsert = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
			System.out.println(3);
			Statement statement = con.createStatement();
			Statement statementInsert = conInsert.createStatement();

			String sql = "select * from employee";

			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				
				String emp_id = resultSet.getString(1);
				String emp_name = resultSet.getString(2);
				String emp_dept = resultSet.getString(3);
				
				System.out.println(emp_id);
				System.out.println(emp_name);
				System.out.println(emp_dept);
				
				String sqlInsert = "insert into employeecopy (ename,edept) " + "values('" + emp_name + "','"
						+ emp_dept + "')";
				int updatedcount = statementInsert.executeUpdate(sqlInsert);
				System.out.println("data inserted >" + updatedcount);
			}
			

		
	}

}
