package com.bidding;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Customer;
import com.customer.DBConnect;

public class BindingDBUtil {
	
	//create connection
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
		
	//read bidding details
	public static List<Binding> getBinding(String Name) {
		
		ArrayList<Binding> binding = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from productstest where name='"+Name+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String category = rs.getString(3);
				String price = rs.getString(4);
				String image = rs.getString(5);
				int access = rs.getInt("access");

				//add to array list
				Binding bind = new Binding(id, name, category, price, image, access);
				binding.add(bind);
			}
			
		} catch (Exception e) {
			
		}
		
		return binding;	
	}
    
	//insert bidding
    public static boolean insertbinding(String name, String category, String price, String image, String access) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into productstest values (0,'"+name+"','"+category+"','"+price+"','"+image+"','"+access+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
   
  //update bidding
    public static boolean updatebindingr(String id, String name, String category, String price, String image, String access) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update productstest set name='"+name+"',category='"+category+"',price='"+price+"',image='"+image+"',access='"+access+"'"
    				+ "where id='"+id+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
 
  //get bidding details for customer
    public static List<Binding> getBindingDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<Binding> binding = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from productstest where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String category = rs.getString(3);
    			String price = rs.getString(4);
    			String image = rs.getString(5);
    			int access = rs.getInt("access");
    			
    			Binding c = new Binding(convertedID, name, category, price, image, access);
    			binding.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return binding;	
    }
    
  //delete bidding
    public static boolean deleteBinding(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from productstest where id='"+convId+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
  //get bidding details to admin
    public static List<Binding> getBindingDetails() {
        List<Binding> binding = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from productstest";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String category = rs.getString(3);
                String price = rs.getString(4);
                String image = rs.getString(5);
                int access = rs.getInt("access");

              //add to array list
                Binding bind = new Binding(id, name, category, price, image, access);
                binding.add(bind);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return binding;
    }

	
	

}
