package com.seller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SellerDBUtil {
	
	//create connection
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	//validate
	public static boolean validate(String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from sallers where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//get sellers
	public static List<Seller> getSeller(String userName) {
		
		ArrayList<Seller> seller = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from sallers where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String bod = rs.getString(3);
				String nic = rs.getString(4);
				String address = rs.getString(5);
				String email = rs.getString(6);
				String phone = rs.getString(7);
				String username = rs.getString(8);
				String password = rs.getString(9);
				
				//add to array list
				Seller slr = new Seller(id, name, bod, nic, address, email, phone, username, password);
				seller.add(slr);
			}
			
		} catch (Exception e) {
			
		}
		
		return seller;	
	}
    
	//insert sellers
    public static boolean insertseller(String name, String bod, String nic, String address, String email, String phone, String username, String password ) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into sallers values (0,'"+name+"','"+bod+"','"+nic+"','"+address+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
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
    
  //update sellers
    public static boolean updateseller(String id, String name, String bod, String nic, String address, String email, String phone, String username, String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update sallers set name='"+name+"',bod='"+bod+"',nic='"+nic+"',address='"+address+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
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
 
  //get seller details
    public static List<Seller> getSellerDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<Seller> sell = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from sallers where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
				String bod = rs.getString(3);
				String nic = rs.getString(4);
				String address = rs.getString(5);
				String email = rs.getString(6);
				String phone = rs.getString(7);
				String username = rs.getString(8);
				String password = rs.getString(9);
    			
				//add to array list
    			Seller s = new Seller(id, name, bod, nic, address, email, phone, username, password);
    			sell.add(s);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return sell;	
    }
    
    
  //delete sellers
    public static boolean deleteSeller(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from sallers where id='"+convId+"'";
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
    
  //get seller details
    public static List<Seller> getSellerDetails() {
        List<Seller> sell = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from sallers";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
				String bod = rs.getString(3);
				String nic = rs.getString(4);
				String address = rs.getString(5);
				String email = rs.getString(6);
				String phone = rs.getString(7);
				String username = rs.getString(8);
				String password = rs.getString(9);

				//add to array list
                Seller s = new Seller(id, name, bod, nic, address, email, phone, username, password);
                sell.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sell;
    }
	
	

}
