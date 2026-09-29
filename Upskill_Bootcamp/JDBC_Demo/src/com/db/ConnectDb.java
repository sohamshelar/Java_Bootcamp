package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
	static Connection con=null;
	public static void createconnect()
	{
		try
		{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","SS","Soham24");
			System.out.println("Connected");
		}catch(SQLException sq)
		{
			System.out.println(sq.getMessage());
		}
	}
}
