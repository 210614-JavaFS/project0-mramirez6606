package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() throws SQLException {
		
		//For many frameworks using JDBC it is necessary to "register" the driver 
		//in order for the framework to be aware of it. 
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:postgresql://java-react-210614.cvtq9j4axrge.us-east-1.rds.amazonaws.com:5432/demos";
		String username = "postgres"; //It is possible to use env variables to hide this information
		String password = "password"; // you would access them with System.getenv("var-name");
		
		return DriverManager.getConnection(url, username, password);
	}
	
//	public static void main(String[] args) {
//		try(Connection conn = ConnectionUtil.getConnection()){
//			System.out.println("Connection Successful!");
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}

}
