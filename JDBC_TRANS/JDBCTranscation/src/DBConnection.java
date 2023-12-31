package com.jdbc.transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public final static String DB_DRIVER_CLASS =
"com.mysql.jdbc.Driver";
	public final static String DB_URL =
"jdbc:mysql://localhost:3307/transaction_management";
	public final static String DB_USERNAME = "root";
	public final static String DB_PASSWORD = "root";

	public static Connection getConnection() throws 
ClassNotFoundException, SQLException {

		Connection con = null;

		// load the Driver Class
		Class.forName(DB_DRIVER_CLASS);

		// create the connection now
		con = DriverManager.getConnection(DB_URL,
 DB_USERNAME, DB_PASSWORD);

		System.out.println("DB Connection created 
successfully");
		return con;
	}
}
