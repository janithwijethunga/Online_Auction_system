package com.item;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Customer;
import com.customer.DBConnect;

import java.sql.PreparedStatement;

import java.sql.SQLException;


public class ItemDBUtil {
	
	//create connection
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	
	
	//insert items
	public static boolean insertitem(String name, String category, double price, String imageFileName) {
        boolean isSuccess = false;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBConnect.getConnection();

         // Define  SQL query with a parameter for the image file path
            String sql = "INSERT INTO products (name, category, price, image) VALUES (?, ?, ?, ?)";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, category);
            pstmt.setDouble(3, price);
            pstmt.setString(4, imageFileName); 

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                isSuccess = true;
            } else {
                isSuccess = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }
	

	//get items
	public static List<Item> getItem(String Name) {
		
		ArrayList<Item> item = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from products where name='"+Name+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String category = rs.getString(3);
				String price = rs.getString(4);
				String image = rs.getString(5);
				
				
				Item it = new Item(id,name,category,price,image);
				item.add(it);
			}
			
		} catch (Exception e) {
			
		}
		
		return item;	
	}
    

    //update item details
    public static boolean updateitems(String id, String name, String category, String price, String image) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update products set name='"+name+"',category='"+category+"',price='"+price+"'"
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
 
  //get item details
    public static List<Item> getItemDetails(String Id) {
    	
    	int convertedID = Integer.parseInt(Id);
    	
    	ArrayList<Item> item = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from products where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			int id = rs.getInt(1);
    			String name = rs.getString(2);
    			String category = rs.getString(3);
    			String price = rs.getString(4);
    			String image = rs.getString(5);
    			
    			//add to array list
    			Item it = new Item(id,name,category,price,image);
    			item.add(it);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return item;	
    }
    
    
    //delete items
    public static boolean deleteitem(String id) {
    	
    	int convId = Integer.parseInt(id);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from products where id='"+convId+"'";
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
    
    
    public static List<Item> getItemDetails() {
        List<Item> item = new ArrayList<>();

        try {
            con = DBConnect.getConnection();
            stmt = con.createStatement();
            String sql = "select * from products";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String category = rs.getString(3);
                String price = rs.getString(4);
                String image = rs.getString(5);
               

                Item it = new Item(id, name, category, price, image);
                item.add(it);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

}
