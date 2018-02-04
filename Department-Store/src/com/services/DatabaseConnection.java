package com.services;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DatabaseConnection {
	public Connection getConnection(String databaseName, String user, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseName,user,pass);
			return con;
		} catch (Exception e) {
			ErrorHandling error = new ErrorHandling();
			if(e.toString().contains("Communications link failure")) {
				error.getMessage("Connection problem", "Database is not connected. Check the database connection. Also check if the database name is correct, your username and password.", "E");
			}
			error.getMessage("An error has occurred", "There's some problem with connecting the database, please check your database name, username and password.", "E");
		}
		return null;
	}
	public Connection getConnection() {
		return getConnection("DepartmentStore","root","");
	}
}
