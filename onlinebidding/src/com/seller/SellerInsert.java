package com.seller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/SellerInsert")
public class SellerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set seller details and insert
		String name = request.getParameter("name");
		String bod = request.getParameter("bod");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = SellerDBUtil.insertseller(name, bod, nic, address, email, phone, username, password);
		
		if(isTrue == true) {
			// Re-fetch the updated seller data from the database
		    List<Seller> sellerDetails = SellerDBUtil.getSellerDetails();

		    // Set the updated data as an attribute in the request
		    request.setAttribute("sellerDetails", sellerDetails);

			RequestDispatcher dis = request.getRequestDispatcher("Sellerlist.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
