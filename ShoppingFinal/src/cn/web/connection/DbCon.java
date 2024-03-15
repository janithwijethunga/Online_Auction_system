package cn.web.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon {
	
	private static String url = "jdbc:mysql://localhost:3306/ecommerce_cart";
	private static String userName = "root";
	private static String password = "Sliit@1234";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,userName,password);
			System.out.print("connected");
		}
		catch (Exception e) {
			System.out.println("Database connection is not success !!!");
		}
		return con;
		
	}

}
