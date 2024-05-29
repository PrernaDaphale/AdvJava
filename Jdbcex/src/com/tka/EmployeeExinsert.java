package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeExinsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "root");
		Statement statement = con.createStatement();

		String sql = "insert into employeecopy (ename,edept) values('comp','tka')";

		int updatedcount = statement.executeUpdate(sql);
		System.out.println(updatedcount);

	}

}
