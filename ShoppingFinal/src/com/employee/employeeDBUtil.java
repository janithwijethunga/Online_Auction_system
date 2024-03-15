package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class employeeDBUtil {
	
	
	//public static List<employee> validate(String username, String password) {
		
	//	ArrayList<employee> emp = new ArrayList<>();
		
	//	String url = "jdbc:mysql://localhost:3306/paymentcustomer";
	//	String user = "root";
	//	String pass = "sliit";
	
	//	try {
			
			//con = DBconnect.getConnection();
		//	stmt = con.createStatement();
		//	String sql = "select * from managment where username='"+username+"' and password='"+password+"'";
			//rs = stmt.executeQuery(sql);
			
		//	if(rs.next()) {
			//	int id = rs.getInt(1);
			//	String userU = rs.getString(2);
			//	String passU = rs.getString(3);
				
			//	employee c = new employee(id,userU,passU);
			//	emp.add(c);
		//	}
			
			
	//	}
	//	catch(Exception e) {
	//		e.printStackTrace();
	//	}
	//	return emp;
	//}
	
	public static boolean insertemployee(String name,String phone,String email,String position,String salary,String gender) {
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/employeemanagment";
		String user = "root";
		String pass = "sliit";
		
		
		try{
           //con = DBconnect.getConnection();
        //   stmt = con.createStatement();
		 //  String sql = "insert into employee values (0, '"+name+"','"+phone+"',  '"+email+"', '"+position+"', '"+salary+"', '"+gender+"')";
		//   int rs = stmt.executeUpdate(sql);
			Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt  = con.createStatement();
			String sql = "insert into employee values (0, '"+name+"','"+phone+"',  '"+email+"', '"+position+"', '"+salary+"', '"+gender+"')";
			int rs = stmt.executeUpdate(sql);    //return two value 1 --> succuss 0--> unsuccess
			
			if(rs >0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}


