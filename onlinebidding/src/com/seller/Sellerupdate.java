package com.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sellerupdate")
public class Sellerupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get details and update
		String id = request.getParameter("sellerid");
		String name = request.getParameter("name");
		String bod = request.getParameter("bod");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		boolean isTrue;
		
		isTrue = SellerDBUtil.updateseller(id, name, bod, nic, address, email, phone, username, password);
		
		if(isTrue == true) {
			
			// Read the updated seller data from the database
		    List<Seller> sellerDetails = SellerDBUtil.getSellerDetails();

		    // Set the updated data c 
		    request.setAttribute("sellerDetails", sellerDetails);

		    // Forward to Sellerlist.jsp
		    RequestDispatcher dis = request.getRequestDispatcher("Sellerlist.jsp");
		    dis.forward(request, response);
		}
		else {
			List<Seller> sellerDetails = SellerDBUtil.getSellerDetails(id);
			request.setAttribute("sellerDetails", sellerDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("selleraccount.jsp");
			dis.forward(request, response);
		}
	}

}
