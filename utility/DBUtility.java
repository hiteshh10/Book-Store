package com.bookstore.utility;

import java.sql.*;

public class DBUtility
{
	public static Connection myconnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinebookstore20314","root","squ@d123");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
