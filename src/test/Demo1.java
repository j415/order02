package test;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
	 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/order"; 
			Connection connection = DriverManager.getConnection(url,"root","15111202020");
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}